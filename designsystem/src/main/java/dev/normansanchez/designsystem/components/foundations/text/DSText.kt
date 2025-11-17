package dev.normansanchez.designsystem.components.foundations.text

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import dev.normansanchez.designsystem.components.foundations.text.DSTextHelper.getMCColor
import dev.normansanchez.designsystem.components.foundations.text.DSTextHelper.getMCTextStyle
import dev.normansanchez.designsystem.components.foundations.text.model.DSTextModel
import dev.normansanchez.designsystem.theme.dynamiccolors.DynamicFonts.MentorConnectFontFamily

/**
 * DSText
 *
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
    dsTextModel: DSTextModel
) {
    val styleResolved: TextStyle =
        getMCTextStyle(dsTextStyle = dsTextModel.dsTextStyle)

    val colorResolved: Color =
        getMCColor(dsTextModel.dsTextStyle)

    Text(
        modifier = dsTextModel.modifier,
        text = stringResource(dsTextModel.resourceId),
        maxLines = dsTextModel.maxLines,
        fontFamily = MentorConnectFontFamily,
        style = styleResolved,
        color = colorResolved,
        textAlign = dsTextModel.alignmentText,
        fontSize = styleResolved.fontSize
    )
}
