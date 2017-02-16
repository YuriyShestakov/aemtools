package com.aemtools.completion.util

import com.aemtools.lang.htl.HtlLanguage
import com.aemtools.lang.htl.psi.HtlPsiFile
import com.intellij.lang.Language
import com.intellij.lang.StdLanguages
import com.intellij.psi.PsiFile

/**
 * Psi utility & extension methods
 * @author Dmytro_Troynikov
 */

/**
 * Get [PsiFile] for specified [Language].
 * @param language the language
 * @return the [PsiFile] for given [Language], _null_ in case if no file was found
 */
fun PsiFile.getPsi(language: Language): PsiFile? = viewProvider.getPsi(language)

/**
 * Get [PsiFile] for [StdLanguages.HTML] language.
 */
fun PsiFile.getHtmlFile(): PsiFile? = getPsi(StdLanguages.HTML)

/**
 * Get [HtlPsiFile] from current [PsiFile].
 */
fun PsiFile.getHtlFile(): HtlPsiFile? = getPsi(HtlLanguage) as? HtlPsiFile