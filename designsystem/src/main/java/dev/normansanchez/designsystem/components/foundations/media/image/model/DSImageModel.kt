package dev.normansanchez.designsystem.components.foundations.media.image.model

import android.media.MediaRouter
import androidx.annotation.StringRes
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import dev.normansanchez.designsystem.R
import dev.normansanchez.designsystem.functional.OnClickCallback

data class DSImageModel(
    val modifier: Modifier = Modifier,
    val imageSource: String,
    val size: Dp = 32.dp,
    val imageType: DSImageType,
    val onClickImage: OnClickCallback = {},
    @param:StringRes val placeHolderImageRes: Int = R.drawable.circular_progress,
    @param:StringRes val errorImageRes: Int = R.drawable.error
)