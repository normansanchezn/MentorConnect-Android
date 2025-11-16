package dev.normansanchez.designsystem.components.previews

import androidx.compose.ui.text.style.TextAlign
import dev.normansanchez.designsystem.R
import dev.normansanchez.designsystem.components.foundations.text.model.DSTextModel
import dev.normansanchez.designsystem.components.foundations.text.model.DSTextStyle

object FoundationsHelper {

    val title = DSTextModel(
        resourceId = R.string.dummy_txt,
        maxLines = 2,
        dsTextStyle = DSTextStyle.TITLE,
        alignmentText = TextAlign.Right
    )
    val subtitle = DSTextModel(
        resourceId = R.string.dummy_txt,
        maxLines = 2,
        dsTextStyle = DSTextStyle.SUBTITLE,
        alignmentText = TextAlign.Right
    )

    val headline = DSTextModel(
        resourceId = R.string.dummy_txt,
        maxLines = 2,
        dsTextStyle = DSTextStyle.HEADING,
        alignmentText = TextAlign.Right
    )

    val subheadline = DSTextModel(
        resourceId = R.string.dummy_txt,
        maxLines = 2,
        dsTextStyle = DSTextStyle.SUBHEADING,
        alignmentText = TextAlign.Right
    )

    val bodyLarge = DSTextModel(
        resourceId = R.string.dummy_txt,
        maxLines = 2,
        dsTextStyle = DSTextStyle.BODY,
        alignmentText = TextAlign.Right
    )

    val body = DSTextModel(
        resourceId = R.string.dummy_txt,
        maxLines = 2,
        dsTextStyle = DSTextStyle.BODY_MEDIUM,
        alignmentText = TextAlign.Right
    )
}