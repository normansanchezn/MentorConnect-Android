package dev.normansanchez.designsystem.components.foundations.media.image

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.normansanchez.designsystem.components.foundations.media.image.helper.DSImageHelper.resolvedCircularImageCase
import dev.normansanchez.designsystem.components.foundations.media.image.helper.DSImageHelper.resolvedNormalCase
import dev.normansanchez.designsystem.components.foundations.media.image.helper.DSImageHelper.resolvedRectangleRounded
import dev.normansanchez.designsystem.components.foundations.media.image.helper.DSImageHelper.resolvedRectangleRoundedWithBackground
import dev.normansanchez.designsystem.components.foundations.media.image.model.DSImageModel
import dev.normansanchez.designsystem.components.foundations.media.image.model.DSImageType
import dev.normansanchez.designsystem.theme.MentorConnectTheme


/**
 * DSImage
 *
 * @param dsImageModel
 *
 * @see DSImageModel
 * @see DSImageType
 * @see resolvedNormalCase
 * @see resolvedCircularImageCase
 * @see resolvedRectangleRounded
 * @see resolvedRectangleRoundedWithBackground
 *
 * @sample DSImageExample
 *
 * @author Norman Sanchez
 * @since 1.0.0
 * @version 1.0.0
 */
@Composable
fun DSImage(
   dsImageModel: DSImageModel
) {
    when(dsImageModel.imageType) {
        DSImageType.NORMAL -> resolvedNormalCase(dsImageModel = dsImageModel)
        DSImageType.CIRCULAR -> resolvedCircularImageCase(dsImageModel = dsImageModel)
        DSImageType.RECTANGLE_ROUNDED -> resolvedRectangleRounded(dsImageModel = dsImageModel)
        DSImageType.RECTANGLE_ROUNDED_WITH_BACKGROUND -> resolvedRectangleRoundedWithBackground(dsImageModel = dsImageModel)
    }
}

@Preview
@Composable
fun DSImageExample() {
    MentorConnectTheme(
        darkTheme = true,
        dynamicColor = true
    ) {
        DSImage(
            dsImageModel = DSImageModel(
                imageSource = "https://uiskaogodllxicvnfdab.supabase.co/storage/v1/object/public/General%20assets/norman.jpg",
                size = 140.dp,
                imageType = DSImageType.RECTANGLE_ROUNDED_WITH_BACKGROUND,
                onClickImage = {
                    Log.i("TAG", "onCreate: On click image")
                }
            )
        )
    }
}
