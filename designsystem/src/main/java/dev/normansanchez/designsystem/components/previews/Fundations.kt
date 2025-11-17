package dev.normansanchez.designsystem.components.previews

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.normansanchez.designsystem.R
import dev.normansanchez.designsystem.components.foundations.button.DSButton
import dev.normansanchez.designsystem.components.foundations.button.model.DSButtonModel
import dev.normansanchez.designsystem.components.foundations.button.model.DSButtonType
import dev.normansanchez.designsystem.components.foundations.text.DSText
import dev.normansanchez.designsystem.components.foundations.iconbutton.DSIconButton
import dev.normansanchez.designsystem.components.foundations.iconbutton.model.DSIconButtonModel
import dev.normansanchez.designsystem.components.foundations.media.image.DSImage
import dev.normansanchez.designsystem.components.foundations.media.image.model.DSImageModel
import dev.normansanchez.designsystem.components.foundations.media.image.model.DSImageType
import dev.normansanchez.designsystem.components.foundations.media.lottie.DSLottie
import dev.normansanchez.designsystem.components.foundations.media.lottie.DSLottieModel
import dev.normansanchez.designsystem.components.foundations.text.model.DSTextModel
import dev.normansanchez.designsystem.components.foundations.text.model.DSTextStyle
import dev.normansanchez.designsystem.components.previews.FoundationsHelper.body
import dev.normansanchez.designsystem.components.previews.FoundationsHelper.bodyLarge
import dev.normansanchez.designsystem.components.previews.FoundationsHelper.headline
import dev.normansanchez.designsystem.components.previews.FoundationsHelper.subheadline
import dev.normansanchez.designsystem.components.previews.FoundationsHelper.subtitle
import dev.normansanchez.designsystem.components.previews.FoundationsHelper.title
import dev.normansanchez.designsystem.theme.MentorConnectTheme
import dev.normansanchez.designsystem.theme.dynamiccolors.DynamicColors

@Preview(showBackground = true)
@Composable
fun DSIconButtonExamplePreview() {
    MentorConnectTheme(
        darkTheme = isSystemInDarkTheme(),
        dynamicColor = true
    ) {
        DSIconButton(
            dsIconButtonModel = DSIconButtonModel(
                modifier = Modifier.padding(),
                resourceIconId = R.drawable.favorite_filled,
                dsTextModel = DSTextModel(
                    resourceId = R.string.dummy_txt,
                    maxLines = 1,
                    dsTextStyle = DSTextStyle.CAPTION,
                    alignmentText = TextAlign.Center
                ),
                onClick = {
                    println("Clicked")
                }
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DSTextExamplePreview() {
    MentorConnectTheme(
        darkTheme = isSystemInDarkTheme(),
        dynamicColor = true
    ) {
        Column(
            modifier = Modifier.fillMaxSize().background(DynamicColors.backgroundVar),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        ) {
            DSText(dsTextModel = title)
            DSText(dsTextModel = subtitle)
            DSText(dsTextModel = headline)
            DSText(dsTextModel = subheadline)
            DSText(dsTextModel = bodyLarge)
            DSText(dsTextModel = body)
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun DSButtonPrimaryExample() {
    MentorConnectTheme(
        darkTheme = isSystemInDarkTheme(),
        dynamicColor = true
    ) {
        DSButton(
            dsButtonModel = DSButtonModel(
                modifier = Modifier.padding(),
                textResourceId = R.string.dummy_txt,
                onClick = {
                    Log.i("TAG", "onCreate: Button primary clicked")
                },
                buttonType = DSButtonType.PRIMARY,
                isEnabled = true
            )
        )
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
                imageType = DSImageType.CIRCULAR,
                onClickImage = {
                    Log.i("TAG", "onCreate: On click image")
                }
            )
        )
    }
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