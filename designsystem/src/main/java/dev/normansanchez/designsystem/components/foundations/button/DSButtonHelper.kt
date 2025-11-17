package dev.normansanchez.designsystem.components.foundations.button

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import dev.normansanchez.designsystem.components.foundations.button.model.DSButtonStyle
import dev.normansanchez.designsystem.components.foundations.button.model.DSButtonType
import dev.normansanchez.designsystem.components.foundations.text.model.DSTextModel
import dev.normansanchez.designsystem.components.foundations.text.model.DSTextStyle
import dev.normansanchez.designsystem.theme.BackgroundLight
import dev.normansanchez.designsystem.theme.dynamiccolors.DynamicColors.outlineVar
import dev.normansanchez.designsystem.theme.dynamiccolors.DynamicColors.primaryVar
import dev.normansanchez.designsystem.theme.dynamiccolors.DynamicColors.secondaryVar

object DSButtonHelper {
    fun getDsTextModel(textResourceId: Int): DSTextModel = DSTextModel(
        modifier = Modifier.padding().width(200.dp),
        resourceId = textResourceId,
        maxLines = 1,
        dsTextStyle = DSTextStyle.LABEL_MEDIUM,
        alignmentText = TextAlign.Center
    )

    @Composable
    fun resolvedButtonType(buttonType: DSButtonType): DSButtonStyle = when (buttonType) {
        DSButtonType.PRIMARY -> DSButtonStyle(
            backgroundColor = primaryVar,
            textColor = BackgroundLight
        )
        DSButtonType.SECONDARY -> DSButtonStyle(
            backgroundColor = secondaryVar,
            textColor = BackgroundLight
        )
        DSButtonType.TERTIARY -> DSButtonStyle(
            backgroundColor = outlineVar,
            textColor = BackgroundLight
        )
    }
}