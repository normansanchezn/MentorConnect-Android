package dev.normansanchez.designsystem.components.foundations.text

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import dev.normansanchez.designsystem.components.foundations.text.helper.DSTextHelper
import dev.normansanchez.designsystem.components.foundations.text.helper.DSTextHelper.resolveResourceId
import dev.normansanchez.designsystem.components.foundations.text.helper.DSTextHelperPreview
import dev.normansanchez.designsystem.components.foundations.text.model.DSTextModel
import dev.normansanchez.designsystem.theme.MentorConnectTheme

/**
 * DSText
 *
 * @param dsTextModel
 *
 * @author Norman Sanchez
 * @since 1.0.0
 * @version 1.0.1
 * @see DSTextModel
 *
 * @return Unit
 *
 * @sample DSTextExamplePreview
 */
@Composable
fun DSText(
    dsTextModel: DSTextModel
) {
    val text = resolveResourceId(dsTextModel.resourceId)
    Text(
        text = text,
        modifier = dsTextModel.modifier,
        maxLines = dsTextModel.maxLines,
        textAlign = dsTextModel.alignmentText,
        style = DSTextHelper.textStyleFor(dsTextModel.dsTextStyle)
    )
}

@Preview(
    apiLevel = 36,
    showSystemUi = false,
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_NO
)
@Composable
fun DSTextExamplePreview() {
    MentorConnectTheme(
        darkTheme = isSystemInDarkTheme(),
        dynamicColor = true,
    ) {
        LazyColumn(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        ) {
            items(DSTextHelperPreview.listText.size) { index ->
                DSText(DSTextHelperPreview.listText[index])
            }
        }
    }
}

@Preview(
    apiLevel = 36,
    showSystemUi = false,
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES, backgroundColor = 0xFF000000
)
@Composable
fun DSTextExampleDarkPreview() {
    MentorConnectTheme(
        darkTheme = isSystemInDarkTheme(),
        dynamicColor = false,
    ) {
        LazyColumn(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        ) {
            items(DSTextHelperPreview.listText.size) { index ->
                DSText(DSTextHelperPreview.listText[index])
            }
        }
    }
}