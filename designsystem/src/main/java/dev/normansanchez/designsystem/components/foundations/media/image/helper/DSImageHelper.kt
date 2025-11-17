package dev.normansanchez.designsystem.components.foundations.media.image.helper

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import dev.normansanchez.designsystem.components.foundations.media.image.model.DSImageModel
import dev.normansanchez.designsystem.theme.dynamics.DynamicColors

/**
 * DSImageHelper
 *
 * This object is the helper resolver to DSImage, here DSImage change from DSImageType.
 *
 * @author Norman Sanchez
 * @since 1.0.0
 * @version 1.0.0
 */
object DSImageHelper {

    @OptIn(ExperimentalGlideComposeApi::class)
    @Composable
    fun resolvedRectangleRounded(dsImageModel: DSImageModel) {
        GlideImage(
            model = dsImageModel.imageSource,
            contentDescription = dsImageModel.imageSource,
            modifier = dsImageModel.modifier
                .size(dsImageModel.size)
                .clickable { dsImageModel.onClickImage() }
                .background(DynamicColors.primaryVar, RoundedCornerShape(20))
                .clip(androidx.compose.foundation.shape.RoundedCornerShape(20)),
            contentScale = ContentScale.Crop
        ) {
            it.apply {
                error(dsImageModel.errorImageRes)
                placeholder(dsImageModel.placeHolderImageRes)
                load(dsImageModel.imageSource)
            }
        }
    }

    @OptIn(ExperimentalGlideComposeApi::class)
    @Composable
    fun resolvedRectangleRoundedWithBackground(dsImageModel: DSImageModel) {
        Box(
            modifier =
                dsImageModel.modifier
                    .size(dsImageModel.size)
                    .clickable {
                        dsImageModel.onClickImage()
                    }
        ) {
            Box(
                modifier = Modifier
                    .matchParentSize()
                    .rotate(45f)
                    .background(
                        DynamicColors.primaryVar.copy(alpha = 0.4F),
                        androidx.compose.foundation.shape.RoundedCornerShape(20)
                    )
            )

            GlideImage(
                model = dsImageModel.imageSource,
                contentDescription = dsImageModel.imageSource,
                modifier = dsImageModel.modifier
                    .matchParentSize()
                    .background(
                        DynamicColors.primaryVar,
                        androidx.compose.foundation.shape.RoundedCornerShape(20)
                    )
                    .clip(androidx.compose.foundation.shape.RoundedCornerShape(20)),
                contentScale = ContentScale.Crop
            ) {
                it.apply {
                    error(dsImageModel.errorImageRes)
                    placeholder(dsImageModel.placeHolderImageRes)
                    load(dsImageModel.imageSource)
                }
            }
        }
    }

    @OptIn(ExperimentalGlideComposeApi::class)
    @Composable
    fun resolvedCircularImageCase(dsImageModel: DSImageModel) {
        GlideImage(
            model = dsImageModel.imageSource,
            contentDescription = dsImageModel.imageSource,
            modifier = dsImageModel.modifier
                .size(
                    dsImageModel.size
                )
                .clickable {
                    dsImageModel.onClickImage()
                }
                .background(color = DynamicColors.primaryVar, CircleShape)
                .clip(CircleShape)
                .border((1.5).dp, DynamicColors.primaryVar, CircleShape),
            contentScale = ContentScale.Crop,
        ) {
            it.apply {
                error(dsImageModel.errorImageRes)
                placeholder(dsImageModel.placeHolderImageRes)
                load(dsImageModel.imageSource)
            }
        }
    }

    @OptIn(ExperimentalGlideComposeApi::class)
    @Composable
    fun resolvedNormalCase(dsImageModel: DSImageModel) {
        GlideImage(
            model = dsImageModel.imageSource,
            contentDescription = dsImageModel.imageSource,
            modifier = dsImageModel.modifier
                .size(dsImageModel.size)
                .clickable {
                    dsImageModel.onClickImage()
                },
            contentScale = ContentScale.Crop
        ) {
            it.apply {
                error(dsImageModel.errorImageRes)
                placeholder(dsImageModel.placeHolderImageRes)
                load(dsImageModel.imageSource)
            }
        }
    }
}