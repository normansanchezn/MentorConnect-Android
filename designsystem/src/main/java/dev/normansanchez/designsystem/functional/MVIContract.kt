package dev.normansanchez.designsystem.functional

interface MVIContractEvent<EVENT> {
    fun event(event: EVENT)
}

interface MVIContract<STATE, EFFECT, EVENT> : MVIContractEvent<EVENT> {
    val state: STATE
    val effect: EFFECT

}