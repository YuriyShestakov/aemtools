package com.aemtools.completion.htl.completionprovider

import com.aemtools.blocks.BaseVariantsCheckContributorTest
import com.intellij.openapi.project.Project
import com.intellij.testFramework.createHeavyProject
import org.assertj.core.api.Assertions.assertThat

/**
 * @author Dmytro Troynikov
 */
class PredefinedVariablesTest : BaseVariantsCheckContributorTest("com/aemtools/completion/htl/fixtures/noafter") {

    fun testContextObjectFieldsResolution() {
        myFixture.configureByFile(fileName)
        val variants = myFixture.completeBasic()
        assertThat(variants).isNotNull()
    }

}