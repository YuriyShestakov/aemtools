package com.aemtools.completion.util

import com.aemtools.completion.htl.model.*
import com.aemtools.completion.htl.predefined.HtlELPredefined
import com.aemtools.constant.const.SLY_TAG
import com.aemtools.constant.const.htl.DATA_SLY_LIST
import com.aemtools.constant.const.htl.DATA_SLY_REPEAT
import com.aemtools.constant.const.htl.DATA_SLY_TEMPLATE
import com.aemtools.constant.const.htl.DATA_SLY_TEST
import com.aemtools.constant.const.htl.DATA_SLY_USE
import com.aemtools.constant.const.htl.HTL_ATTRIBUTES
import com.aemtools.constant.const.htl.UNIQUE_HTL_ATTRIBUTES
import com.aemtools.index.TemplateDefinition
import com.aemtools.lang.htl.HtlLanguage
import com.aemtools.lang.htl.psi.HtlHtlEl
import com.aemtools.lang.htl.psi.HtlVariableName
import com.intellij.openapi.util.Conditions
import com.intellij.psi.PsiElement
import com.intellij.psi.impl.source.xml.XmlTokenImpl
import com.intellij.psi.util.PsiTreeUtil
import com.intellij.psi.xml.XmlAttribute
import com.intellij.psi.xml.XmlTag
import java.util.*

/**
 * Searches for children by type (@see [PsiTreeUtil])
 */
fun <T : PsiElement> PsiElement?.findChildrenByType(type: Class<T>): Collection<T> {
    return PsiTreeUtil.findChildrenOfType(this, type)
}

/**
 * Searches for parent PSI element of specified class
 */
fun <T : PsiElement> PsiElement?.findParentByType(type: Class<T>): T? {
    return PsiTreeUtil.findFirstParent(this, Conditions.instanceOf(type)) as T?
}

/**
 * Search for parent which is of given type and satisfies given predicate.
 * @param type the type of parent
 * @param predicate the predicate
 * @return the element
 */
fun <T : PsiElement> PsiElement?.findParentByType(type: Class<T>, predicate: (T) -> Boolean) : T? =
        if (this != null) {
            val elements = kotlin.run {
                val result = ArrayList<T>()
                var currentElement = this

                while (currentElement != null) {
                    if (type.isAssignableFrom(currentElement.javaClass)) {
                        result.add(currentElement as T)
                    }
                    currentElement = currentElement.parent
                }
                result
            }

            elements.find {predicate.invoke(it) }
        } else {
            null
        }






/**
 * Check if current [PsiElement] has parent of specified class.
 */
fun <T : PsiElement> PsiElement?.hasParent(type: Class<T>): Boolean =
        this.findParentByType(type) != null

/**
 * Check if current [PsiElement] has child of specified type.
 * @param type type of child
 * @return __true__ if current element has one or more children of specified type
 */
fun <T : PsiElement> PsiElement?.hasChild(type: Class<T>): Boolean =
        this.findChildrenByType(type).isNotEmpty()

/**
 * Extract Htl unique attributes as [Collection<String>] from given [XmlAttribute] collection.
 */
fun Array<PsiElement>.uniqueHtlAttributes(): Collection<String> =
        filter { it.isUniqueHtlAttribute() }.map { it.text }

/**
 * Check if current [PsiElement] is unique. Unique attributes are
 *  `data-sly-unwrap`
 *  `data-sly-list`
 */
fun PsiElement.isUniqueHtlAttribute(): Boolean = UNIQUE_HTL_ATTRIBUTES.contains(this.text)

/**
 * Check if current [XmlTag] is sly tag.
 */
fun XmlTag.isSlyTag(): Boolean = this.name == SLY_TAG

/**
 * Get element type String.
 */
fun PsiElement?.elementType(): String? = (this as? XmlTokenImpl)?.elementType.toString() ?: null

/**
 * Extract [HtlHtlEl] from current element.
 */
fun XmlAttribute.extractHtlHel(): HtlHtlEl? {
    val htlFile = containingFile.viewProvider.getPsi(HtlLanguage)
    val valueElement = valueElement ?: return null
    val helStart = htlFile.findElementAt(valueElement.textOffset + 1)
    return helStart.findParentByType(HtlHtlEl::class.java)
}

/**
 * Extract Htl attributes from given [XmlAttribute] collection.
 */
fun Collection<XmlAttribute>.htlAttributes(): Collection<XmlAttribute> =
        filter { it.isHtlAttribute() }

/**
 * Resolves the class of variable declared in current [XmlAttribute] element.
 *
 * e.g.
 *
 * ```
 * data-sly-use.bean="com.my.package.BeanClass" -> "com.my.package.BeanClass
 * data-sly-use.bean="${'com.my.package.BeanClass' @ param1='value'}" -> "com.my.package.BeanClass"
 *
 * TODO: find solution for:
 * data-sly-use.bean="javascript-file.js"
 * ->
 * ???
 * ```
 *
 * @return full qualified class name, or _null_ in case if resolution is not possible
 */
fun XmlAttribute.resolveUseClass(): String? {
    val attributeValue = valueElement?.value ?: return null
    return when {
        attributeValue.matches(Regex("[\\w.]+")) -> attributeValue
        attributeValue.indexOf("\${") != -1 -> extractBeanNameFromEl(attributeValue)
        else -> null
    }
}

private fun extractBeanNameFromEl(el: String): String? {
    val start = el.indexOf("'") + 1
    val end = el.indexOf("'", start + 1)
    if (start != -1 && end != -1) {
        return el.substring(start, end)
    }
    return null
}

/**
 * Check if current [XmlAttribute] is `data-sly-use` attribute.
 */
fun XmlAttribute.isDataSlyUse(): Boolean = this.name.startsWith(DATA_SLY_USE)

/**
 * Resolve [DataSlyUseType]
 * @return [DataSlyUseType], __null__ if current attribute is not [DATA_SLY_USE]
 */
fun XmlAttribute.dataSlyUseType(): DataSlyUseType? {
    if (!this.isDataSlyUse()) {
        return null
    }

    val name = resolveUseClass() ?: return DataSlyUseType.UNKNOWN
    return with(name) {
        when {
            endsWith(".js") -> DataSlyUseType.JAVASCRIPT
            length > 0 -> DataSlyUseType.JAVA
            else -> DataSlyUseType.UNKNOWN
        }
    }
}

/**
 * Check if current [XmlAttribute] is Htl attribute.
 *
 * @return __true__ if current element is Htl attribute
 */
fun XmlAttribute.isHtlAttribute(): Boolean = with(this.name) {
    HTL_ATTRIBUTES.forEach {
        if (startsWith(it)) {
            return true
        }
    }

    return false
}

/**
 * Check if current element is Htl attribute which declares some variable.
 *
 * e.g.
 *
 * ```
 * data-sly-use.bean -> true
 * data-sly-use -> false
 * data-sly-list -> true
 * ```
 * @return __true__ if current element declares some variable
 */
fun XmlAttribute.isHtlDeclarationAttribute(): Boolean =
        with(this.name) {
            when {
                startsWith(DATA_SLY_USE) && length > DATA_SLY_USE.length -> true
                startsWith(DATA_SLY_TEST) && length > DATA_SLY_TEST.length -> true
                startsWith(DATA_SLY_TEMPLATE) -> true
                startsWith(DATA_SLY_LIST) -> true
                startsWith(DATA_SLY_REPEAT) -> true
                else -> false
            }
        }

/**
 * Extract list of Htl variable declarations from current [XmlAttribute] collection.
 * @return collection of [HtlVariableDeclaration] elements
 */
fun Collection<XmlAttribute>.extractDeclarations(): Collection<HtlVariableDeclaration> {
    return filter { it.isHtlDeclarationAttribute() }
            .flatMap {
                with(it.name) {
                    when {
                        startsWith(DATA_SLY_USE) ->
                            listOf(HtlVariableDeclaration(it, extractUseVariableName(this), DeclarationAttributeType.DATA_SLY_USE))

                        startsWith(DATA_SLY_TEST) ->
                            listOf(HtlVariableDeclaration(it, extractUseVariableName(this), DeclarationAttributeType.DATA_SLY_TEST))

                        startsWith(DATA_SLY_LIST) -> {
                            val (item, itemList) = extractItemAndItemListNames(this)

                            listOf(
                                    HtlVariableDeclaration(it, item,
                                            DeclarationAttributeType.DATA_SLY_LIST,
                                            DeclarationType.ITERABLE),
                                    HtlVariableDeclaration(it, itemList,
                                            DeclarationAttributeType.DATA_SLY_LIST,
                                            DeclarationType.VARIABLE,
                                            ResolutionResult(
                                                    predefined = HtlELPredefined.DATA_SLY_LIST_REPEAT_LIST_FIELDS))
                            )
                        }

                        startsWith(DATA_SLY_REPEAT) -> {
                            val (item, itemList) = extractItemAndItemListNames(this)

                            listOf(
                                    HtlVariableDeclaration(it, item,
                                            DeclarationAttributeType.DATA_SLY_REPEAT,
                                            DeclarationType.ITERABLE),
                                    HtlVariableDeclaration(it,
                                            itemList,
                                            DeclarationAttributeType.DATA_SLY_REPEAT,
                                            DeclarationType.VARIABLE,
                                            ResolutionResult(
                                                    predefined = HtlELPredefined.DATA_SLY_LIST_REPEAT_LIST_FIELDS))
                            )
                        }

                        startsWith(DATA_SLY_TEMPLATE) -> {
                            val templateParameters = it.extractTemplateParameters()
                            templateParameters.map { parameter ->
                                HtlVariableDeclaration(it,
                                        parameter,
                                        DeclarationAttributeType.DATA_SLY_TEMPLATE,
                                        DeclarationType.VARIABLE)
                            }
                        }
                        else -> listOf()
                    }
                }
            }
}

/**
 * Extract variable name from `data-sly-use` attribute.
 * @return the name of `data-sly-use` variable. Empty String in case if no name present in attribute name
 */
private fun extractUseVariableName(name: String): String = if (name.lastIndexOf(".") != 1) {
    name.substring(name.lastIndexOf(".") + 1)
} else {
    ""
}

/**
 * Extract template parameters from current [XmlAttribute]
 * e.g.
 *
 * ```
 *   data-sly-template.myTemplate="${@ param1, param2}"
 * ```
 *
 * will return list of "param1" and "param2".
 *
 * @return list of parameter names, empty list if no parameters were declared
 * or in case if the attribute is not `data-sly-template`
 */
fun XmlAttribute.extractTemplateParameters(): List<String> {
    if (!this.name.startsWith(DATA_SLY_TEMPLATE)) {
        return listOf()
    }

    val htlHel = this.extractHtlHel() ?: return listOf()

    return htlHel.findChildrenByType(HtlVariableName::class.java)
            .filter(HtlVariableName::isOption).map { it.text }
}

/**
 * Extract [TemplateDefinition] from current [XmlAttribute].
 * @return template definition, _null_ in case if current tag isn't of `data-sly-template` type.
 */
fun XmlAttribute.extractTemplateDefinition(): TemplateDefinition? {
    val name = if (name.contains(".")) {
        name.substring(name.indexOf(".") + 1)
    } else {
        ""
    }

    val params = extractTemplateParameters()

    return TemplateDefinition(containingFile.virtualFile?.path, name, params)
}