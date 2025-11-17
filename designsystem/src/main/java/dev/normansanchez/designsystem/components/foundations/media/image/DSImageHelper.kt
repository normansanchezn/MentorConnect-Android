package dev.normansanchez.designsystem.components.foundations.media.image

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
import dev.normansanchez.designsystem.theme.dynamiccolors.DynamicColors.primaryVar

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
                .background(primaryVar, RoundedCornerShape(20))
                .clip(RoundedCornerShape(20)),
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
        Box(modifier =
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
                    .background(primaryVar.copy(alpha = 0.4F), RoundedCornerShape(20))
            )

            GlideImage(
                model = dsImageModel.imageSource,
                contentDescription = dsImageModel.imageSource,
                modifier = dsImageModel.modifier
                    .matchParentSize()
                    .background(primaryVar, RoundedCornerShape(20))
                    .clip(RoundedCornerShape(20))
                ,
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
                .background(color = primaryVar, CircleShape)
                .clip(CircleShape)
                .border((1.5).dp, primaryVar, CircleShape)
            ,
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