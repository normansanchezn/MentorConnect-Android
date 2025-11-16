package dev.normansanchez.designsystem.components.foundations.iconbutton.model

import androidx.compose.ui.Modifier
import dev.normansanchez.designsystem.components.foundations.text.model.DSTextModel
import dev.normansanchez.designsystem.functional.SimpleCallback

data class DSIconButtonModel(
    val modifier: Modifier,
    val resourceIconId: Int,
    val dsTextModel: DSTextModel,
    val stepDelay: Long = 100L,
    val onClick: SimpleCallback = {}
)
