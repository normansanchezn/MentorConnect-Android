package dev.normansanchez.designsystem.components.foundations.button.model

import androidx.annotation.StringRes
import androidx.compose.ui.Modifier
import dev.normansanchez.designsystem.functional.OnClickCallback

data class DSButtonModel(
    val modifier: Modifier = Modifier,
    @param:StringRes val textResourceId: Int,
    val onClick: OnClickCallback,
    val buttonType: DSButtonType,
    val isEnabled: Boolean,
)
