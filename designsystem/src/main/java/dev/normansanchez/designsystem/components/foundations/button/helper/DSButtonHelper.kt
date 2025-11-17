package dev.normansanchez.designsystem.components.foundations.button.helper

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import dev.normansanchez.designsystem.components.foundations.button.model.DSButtonStyle
import dev.normansanchez.designsystem.components.foundations.button.model.DSButtonType
import dev.normansanchez.designsystem.components.foundations.text.model.DSTextModel
import dev.normansanchez.designsystem.components.foundations.text.model.DSTextStyle
import dev.normansanchez.designsystem.theme.dynamics.DynamicColors

object DSButtonHelper {

    fun getDsTextModel(textResourceId: Int): DSTextModel =
        DSTextModel(
            modifier = Modifier
                .padding(horizontal = 24.dp, vertical = 10.dp),
            resourceId = textResourceId,
            maxLines = 1,
            dsTextStyle = DSTextStyle.LABEL_MEDIUM,
            alignmentText = TextAlign.Center
        )

    @Composable
    fun resolvedButtonType(buttonType: DSButtonType): DSButtonStyle =
        when (buttonType) {

            // Botón principal: azul accent + texto blanco
            DSButtonType.PRIMARY -> DSButtonStyle(
                backgroundColor = DynamicColors.primaryVar,
                textColor = DynamicColors.onPrimaryVar
            )

            // Botón secundario: superficie secundaria + texto principal
            DSButtonType.SECONDARY -> DSButtonStyle(
                backgroundColor = DynamicColors.surfaceSecondaryVar,
                textColor = DynamicColors.onSurfaceVar
            )

            // Tertiary: ghost – por ahora fondo transparente y texto en primary
            DSButtonType.TERTIARY -> DSButtonStyle(
                backgroundColor = Color.Transparent,
                textColor = DynamicColors.primaryVar
            )
        }
}
