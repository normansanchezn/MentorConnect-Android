package dev.normansanchez.designsystem.components.foundations.media.video.model

import androidx.annotation.RawRes
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

data class DSVideoModel(
    @param:RawRes val videoRawRes: Int,
    val modifier: Modifier = Modifier,
    val playWhenReady: Boolean = true,
    val isMuted: Boolean = true,
    val content: @Composable BoxScope.() -> Unit = {}
)
