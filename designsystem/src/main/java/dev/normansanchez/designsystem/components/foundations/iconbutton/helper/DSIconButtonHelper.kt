package dev.normansanchez.designsystem.components.foundations.iconbutton.helper

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import dev.normansanchez.designsystem.components.foundations.iconbutton.model.DSIconButtonModel
import dev.normansanchez.designsystem.components.foundations.iconbutton.model.DSIconButtonStyle
import dev.normansanchez.designsystem.theme.dynamics.DynamicColors

object DSIconButtonHelper {

    @Composable
    fun resolvedModifierDSIconButton(
        dsIconButtonModel: DSIconButtonModel,
        interactionSource: MutableInteractionSource
    ): Modifier =
        dsIconButtonModel.modifier
            .size(48.dp)
            .background(
                color = resolvedBackgroundColor(dsIconButtonModel),
                shape = RoundedCornerShape(8.dp)
            )
            .clickable(
                interactionSource = interactionSource,
                indication = null, // o deja el ripple por default si quieres
                onClick = { /* el click real lo maneja LaunchedEffect */ }
            )

    @Composable
    fun resolvedBackgroundColor(dsIconButtonModel: DSIconButtonModel): Color =
        when (dsIconButtonModel.style) {
            DSIconButtonStyle.PRIMARY -> DynamicColors.secondaryVar   // pill azul/morado
            DSIconButtonStyle.SECONDARY -> DynamicColors.surfaceSecondaryVar
            DSIconButtonStyle.TERTIARY -> Color.Transparent           // ghost, solo ícono
        }
    @Composable
    fun resolvedIconTint(style: DSIconButtonStyle): Color =
        when (style) {
            DSIconButtonStyle.PRIMARY   -> DynamicColors.whiteAlways
            DSIconButtonStyle.SECONDARY -> DynamicColors.primaryVar
            DSIconButtonStyle.TERTIARY  -> DynamicColors.textBodyVar
        }
}