package dev.normansanchez.designsystem.components.foundations.iconbutton

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import dev.normansanchez.designsystem.components.foundations.iconbutton.model.DSIconButtonModel
import dev.normansanchez.designsystem.theme.dynamiccolors.DynamicColors

object DSIconButtonHelper {
    @Composable
    fun resolvedModifierDSIconButton(dsIconButtonModel: DSIconButtonModel, interactionSource: MutableInteractionSource): Modifier = dsIconButtonModel.modifier
        .size(48.dp)
        .background(
            color = DynamicColors.onPrimaryVar,
            shape = RoundedCornerShape(8.dp)
        )
        .clickable(
            interactionSource = interactionSource,
            onClick = dsIconButtonModel.onClick
        )
}