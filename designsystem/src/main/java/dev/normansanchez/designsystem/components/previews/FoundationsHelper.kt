package dev.normansanchez.designsystem.components.previews

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import dev.normansanchez.designsystem.R
import dev.normansanchez.designsystem.components.foundations.text.model.DSTextModel
import dev.normansanchez.designsystem.components.foundations.text.model.DSTextStyle

object FoundationsHelper {

    val title = DSTextModel(
        resourceId = R.string.dummy_txt,
        maxLines = 2,
        dsTextStyle = DSTextStyle.TITLE,
        alignmentText = TextAlign.Right,
        modifier = Modifier.width(80.dp).padding(top = 8.dp)
    )
    val subtitle = DSTextModel(
        resourceId = R.string.dummy_txt,
        maxLines = 2,
        dsTextStyle = DSTextStyle.SUBTITLE,
        alignmentText = TextAlign.Right,
        modifier = Modifier.width(80.dp).padding(top = 8.dp)
    )

    val headline = DSTextModel(
        resourceId = R.string.dummy_txt,
        maxLines = 2,
        dsTextStyle = DSTextStyle.HEADING,
        alignmentText = TextAlign.Right,
        modifier = Modifier.width(80.dp).padding(top = 8.dp)
    )

    val subheadline = DSTextModel(
        resourceId = R.string.dummy_txt,
        maxLines = 2,
        dsTextStyle = DSTextStyle.SUBHEADING,
        alignmentText = TextAlign.Right,
        modifier = Modifier.width(80.dp).padding(top = 8.dp)
    )

    val bodyLarge = DSTextModel(
        resourceId = R.string.dummy_txt,
        maxLines = 2,
        dsTextStyle = DSTextStyle.BODY,
        alignmentText = TextAlign.Right,
        modifier = Modifier.width(80.dp).padding(top = 8.dp)
    )

    val body = DSTextModel(
        resourceId = R.string.dummy_txt,
        maxLines = 2,
        dsTextStyle = DSTextStyle.BODY_MEDIUM,
        alignmentText = TextAlign.Right,
        modifier = Modifier.width(80.dp).padding(top = 8.dp)
    )
}