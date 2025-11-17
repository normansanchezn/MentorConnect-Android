package dev.normansanchez.designsystem.components.foundations.text

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import dev.normansanchez.designsystem.components.foundations.text.model.DSTextStyle
import dev.normansanchez.designsystem.theme.dynamiccolors.DynamicColors
import dev.normansanchez.designsystem.theme.dynamiccolors.DynamicFonts

object DSTextHelper {
    fun getMCTextStyle(dsTextStyle: DSTextStyle): TextStyle =
        when (dsTextStyle) {
            DSTextStyle.TITLE -> DynamicFonts.typography.displayLarge
            DSTextStyle.SUBTITLE -> DynamicFonts.typography.displaySmall
            DSTextStyle.HEADING -> DynamicFonts.typography.headlineLarge
            DSTextStyle.SUBHEADING -> DynamicFonts.typography.headlineSmall
            DSTextStyle.BODY -> DynamicFonts.typography.bodyLarge
            DSTextStyle.BODY_MEDIUM -> DynamicFonts.typography.bodySmall
            DSTextStyle.LABEL -> DynamicFonts.typography.labelLarge
            DSTextStyle.LABEL_MEDIUM -> DynamicFonts.typography.labelMedium
            DSTextStyle.CAPTION -> DynamicFonts.typography.labelSmall
        }

    @Composable
    fun getMCColor(dsTextStyle: DSTextStyle): Color = when(dsTextStyle) {
        DSTextStyle.TITLE -> DynamicColors.primaryVar
        DSTextStyle.SUBTITLE -> DynamicColors.onPrimaryVar
        DSTextStyle.HEADING -> DynamicColors.secondaryVar
        DSTextStyle.SUBHEADING -> DynamicColors.onSecondaryVar
        DSTextStyle.BODY -> DynamicColors.onTertiaryVar
        DSTextStyle.BODY_MEDIUM -> DynamicColors.onTertiaryVar
        DSTextStyle.LABEL -> DynamicColors.onTertiaryVar
        DSTextStyle.LABEL_MEDIUM -> DynamicColors.whiteAlways
        DSTextStyle.CAPTION -> DynamicColors.whiteAlways
    }
}