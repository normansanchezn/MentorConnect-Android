package dev.normansanchez.designsystem.components.foundations.text

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import dev.normansanchez.designsystem.components.foundations.text.model.DSTextModel
import dev.normansanchez.designsystem.components.foundations.text.model.DSTextStyle
import dev.normansanchez.designsystem.theme.dynamiccolors.DynamicColors
import dev.normansanchez.designsystem.theme.dynamiccolors.DynamicFonts
import dev.normansanchez.designsystem.theme.dynamiccolors.DynamicFonts.MentorConnectFontFamily

/**
 * DSText
 *
 * @param modifier
 * @param dsTextModel
 *
 * @author Norman Sanchez
 * @since 1.0.0
 * @version 1.0.0
 * @see DSTextModel
 *
 * @return Unit
 *
 * @sample dev.normansanchez.designsystem.components.previews.DSTextExamplePreview
 */
@Composable
fun DSText(
    modifier: Modifier,
    dsTextModel: DSTextModel
) {
    val styleResolved: TextStyle =
        getMCTextStyle(dsTextStyle = dsTextModel.dsTextStyle)

    val colorResolved: Color =
        getMCColor(dsTextModel.dsTextStyle)

    Text(
        modifier = modifier,
        text = stringResource(dsTextModel.resourceId),
        maxLines = dsTextModel.maxLines,
        fontFamily = MentorConnectFontFamily,
        style = styleResolved,
        color = colorResolved,
        textAlign = dsTextModel.alignmentText,
        fontSize = styleResolved.fontSize
    )
}

private fun getMCTextStyle(dsTextStyle: DSTextStyle): TextStyle =
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
private fun getMCColor(dsTextStyle: DSTextStyle): Color = when(dsTextStyle) {
    DSTextStyle.TITLE -> DynamicColors.primaryVar
    DSTextStyle.SUBTITLE -> DynamicColors.onPrimaryVar
    DSTextStyle.HEADING -> DynamicColors.secondaryVar
    DSTextStyle.SUBHEADING -> DynamicColors.onSecondaryVar
    DSTextStyle.BODY -> DynamicColors.onTertiaryVar
    DSTextStyle.BODY_MEDIUM -> DynamicColors.onTertiaryVar
    DSTextStyle.LABEL -> DynamicColors.onTertiaryVar
    DSTextStyle.LABEL_MEDIUM -> DynamicColors.onTertiaryVar
    DSTextStyle.CAPTION -> DynamicColors.onTertiaryVar
}
