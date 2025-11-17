package dev.normansanchez.designsystem.components.foundations.media.lottie

import androidx.annotation.RawRes
import androidx.compose.ui.Modifier

data class DSLottieModel(
    val modifier: Modifier,
    @param:RawRes val lottieResourceId: Int
)
