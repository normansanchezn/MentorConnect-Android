package dev.normansanchez.designsystem.components.foundations.media.lottie

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition

/**
 * DSLottie
 *
 * @param dsLottieModel DSLottieModel
 *
 * @see LottieAnimation
 *
 * @author Norman Sanchez
 * @since 1.0.0
 * @version 1.0.0
 *
 * @sample dev.normansanchez.designsystem.components.previews.DSLottieExample
 */
@Composable
fun DSLottie(
    dsLottieModel: DSLottieModel
) {
    val preLoaderLottieComposition by rememberLottieComposition(
        LottieCompositionSpec.RawRes(
            dsLottieModel.lottieResourceId
        )
    )

    val preLoaderProgress by animateLottieCompositionAsState(
        preLoaderLottieComposition,
        iterations = LottieConstants.IterateForever,
        isPlaying = true
    )

    LottieAnimation(
        composition = preLoaderLottieComposition,
        progress = preLoaderProgress,
        modifier = dsLottieModel.modifier
    )
}