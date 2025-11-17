package dev.normansanchez.designsystem.components.foundations.media.image

import androidx.compose.runtime.Composable
import dev.normansanchez.designsystem.components.foundations.media.image.DSImageHelper.resolvedCircularImageCase
import dev.normansanchez.designsystem.components.foundations.media.image.DSImageHelper.resolvedNormalCase
import dev.normansanchez.designsystem.components.foundations.media.image.DSImageHelper.resolvedRectangleRounded
import dev.normansanchez.designsystem.components.foundations.media.image.DSImageHelper.resolvedRectangleRoundedWithBackground
import dev.normansanchez.designsystem.components.foundations.media.image.model.DSImageModel
import dev.normansanchez.designsystem.components.foundations.media.image.model.DSImageType


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
 * @sample dev.normansanchez.designsystem.components.previews.DSImageExample
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

