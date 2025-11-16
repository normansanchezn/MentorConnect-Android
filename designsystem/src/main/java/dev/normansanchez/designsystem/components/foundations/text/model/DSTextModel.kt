package dev.normansanchez.designsystem.components.foundations.text.model

import androidx.annotation.StringRes
import androidx.compose.ui.text.style.TextAlign

data class DSTextModel(
    @param:StringRes val resourceId: Int,
    val maxLines: Int = Int.MAX_VALUE,
    val dsTextStyle: DSTextStyle = DSTextStyle.BODY,
    val alignmentText: TextAlign = TextAlign.Justify
)