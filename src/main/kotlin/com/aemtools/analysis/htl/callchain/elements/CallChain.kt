package com.aemtools.analysis.htl.callchain.elements

/**
 * @author Dmytro_Troynikov
 */
class CallChain(val callChainSegments: List<CallChainSegment>) {
    companion object {
        private val EMPTY_CHAIN = CallChain(listOf())
        fun empty() = EMPTY_CHAIN
    }
}