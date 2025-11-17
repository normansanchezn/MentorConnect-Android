package dev.normansanchez.designsystem.components.foundations.iconbutton.model

import androidx.compose.ui.Modifier
import dev.normansanchez.designsystem.components.foundations.text.model.DSTextModel
import dev.normansanchez.designsystem.functional.OnClickCallback

data class DSIconButtonModel(
    val modifier: Modifier,
    val resourceIconId: Int,
    val onClick: () -> Unit,
    val dsTextModel: DSTextModel,
    val style: DSIconButtonStyle = DSIconButtonStyle.PRIMARY,
    val stepDelay: Long = 500L
)
