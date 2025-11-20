package dev.normansanchez.designsystem.components.foundations.media.lottie

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import dev.normansanchez.designsystem.R
import dev.normansanchez.designsystem.components.foundations.media.lottie.model.DSLottieModel
import dev.normansanchez.designsystem.theme.MentorConnectTheme

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
 * @sample DSLottieExample
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

@Preview
@Composable
fun DSLottieExample() {
    MentorConnectTheme(
        darkTheme = true,
        dynamicColor = true
    ) {
        DSLottie(
            dsLottieModel = DSLottieModel(
                modifier = Modifier
                    .size(500.dp)
                    .padding(),
                lottieResourceId = R.raw.shared_lottie
            )
        )
    }
}