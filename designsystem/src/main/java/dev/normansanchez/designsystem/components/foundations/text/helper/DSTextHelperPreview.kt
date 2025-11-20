package dev.normansanchez.designsystem.components.foundations.text.helper

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import dev.normansanchez.designsystem.components.foundations.text.helper.DSTextHelper.previewDummyLargeText
import dev.normansanchez.designsystem.components.foundations.text.model.DSTextModel
import dev.normansanchez.designsystem.components.foundations.text.model.DSTextStyle

object DSTextHelperPreview {

    val listText = listOf(
        DSTextModel(
            resourceId = previewDummyLargeText,
            maxLines = 4,
            dsTextStyle = DSTextStyle.TITLE,
            alignmentText = TextAlign.Center,
            modifier = Modifier.fillMaxSize().padding(top = 8.dp)
        ),
        DSTextModel(
            resourceId = previewDummyLargeText,
            maxLines = 2,
            dsTextStyle = DSTextStyle.SUBTITLE,
            alignmentText = TextAlign.Right,
            modifier = Modifier.fillMaxSize().padding(top = 8.dp)
        ),
        DSTextModel(
            resourceId = previewDummyLargeText,
            maxLines = 2,
            dsTextStyle = DSTextStyle.HEADING,
            alignmentText = TextAlign.Right,
            modifier = Modifier.fillMaxSize().padding(top = 8.dp)
        ),
        DSTextModel(
            resourceId = previewDummyLargeText,
            maxLines = 2,
            dsTextStyle = DSTextStyle.SUBHEADING,
            alignmentText = TextAlign.Right,
            modifier = Modifier.fillMaxSize().padding(top = 8.dp)
        ),
        DSTextModel(
            resourceId = previewDummyLargeText,
            maxLines = 2,
            dsTextStyle = DSTextStyle.BODY,
            alignmentText = TextAlign.Right,
            modifier = Modifier.fillMaxSize().padding(top = 8.dp)
        ),
        DSTextModel(
            resourceId = previewDummyLargeText,
            maxLines = 2,
            dsTextStyle = DSTextStyle.BODY_MEDIUM,
            alignmentText = TextAlign.Right,
            modifier = Modifier.fillMaxSize().padding(top = 8.dp)
        )
    )
}