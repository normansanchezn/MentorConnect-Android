package dev.normansanchez.designsystem.components.previews

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.normansanchez.designsystem.R
import dev.normansanchez.designsystem.components.foundations.text.DSText
import dev.normansanchez.designsystem.components.foundations.iconbutton.DSIconButton
import dev.normansanchez.designsystem.components.foundations.iconbutton.model.DSIconButtonModel
import dev.normansanchez.designsystem.components.foundations.text.model.DSTextModel
import dev.normansanchez.designsystem.components.foundations.text.model.DSTextStyle
import dev.normansanchez.designsystem.components.previews.FoundationsHelper.body
import dev.normansanchez.designsystem.components.previews.FoundationsHelper.bodyLarge
import dev.normansanchez.designsystem.components.previews.FoundationsHelper.headline
import dev.normansanchez.designsystem.components.previews.FoundationsHelper.subheadline
import dev.normansanchez.designsystem.components.previews.FoundationsHelper.subtitle
import dev.normansanchez.designsystem.components.previews.FoundationsHelper.title
import dev.normansanchez.designsystem.theme.MentorConnectTheme
import dev.normansanchez.designsystem.theme.dynamiccolors.DynamicColors

@Preview(showBackground = true)
@Composable
fun DSIconButtonExamplePreview() {
    MentorConnectTheme(
        darkTheme = isSystemInDarkTheme(),
        dynamicColor = true
    ) {
        DSIconButton(
            dsIconButtonModel = DSIconButtonModel(
                modifier = Modifier.padding(),
                resourceIconId = R.drawable.favorite_filled,
                dsTextModel = DSTextModel(
                    resourceId = R.string.dummy_txt,
                    maxLines = 1,
                    dsTextStyle = DSTextStyle.CAPTION,
                    alignmentText = TextAlign.Center
                ),
                onClick = {
                    println("Clicked")
                }
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DSTextExamplePreview() {
    MentorConnectTheme(
        darkTheme = isSystemInDarkTheme(),
        dynamicColor = true
    ) {
        Column(
            modifier = Modifier.fillMaxSize().background(DynamicColors.backgroundVar),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        ) {
            DSText(
                Modifier.padding(16.dp),
                dsTextModel = title
            )
            DSText(
                Modifier.padding(16.dp),
                dsTextModel = subtitle
            )
            DSText(
                Modifier.padding(16.dp),
                dsTextModel = headline
            )
            DSText(
                Modifier.padding(16.dp),
                dsTextModel = subheadline
            )
            DSText(
                Modifier.padding(16.dp),
                dsTextModel = bodyLarge
            )
            DSText(
                Modifier.padding(16.dp),
                dsTextModel = body
            )
        }
    }
}