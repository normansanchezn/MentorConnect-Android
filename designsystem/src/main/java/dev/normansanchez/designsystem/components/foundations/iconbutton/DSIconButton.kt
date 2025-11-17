package dev.normansanchez.designsystem.components.foundations.iconbutton

import android.content.res.Configuration
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.normansanchez.designsystem.R
import dev.normansanchez.designsystem.components.foundations.iconbutton.helper.DSIconButtonHelper.resolvedIconTint
import dev.normansanchez.designsystem.components.foundations.iconbutton.helper.DSIconButtonHelper.resolvedModifierDSIconButton
import dev.normansanchez.designsystem.components.foundations.iconbutton.model.DSIconButtonModel
import dev.normansanchez.designsystem.components.foundations.iconbutton.model.DSIconButtonStyle
import dev.normansanchez.designsystem.components.foundations.text.DSText
import dev.normansanchez.designsystem.components.foundations.text.helper.DSTextHelper.previewDummySmallText
import dev.normansanchez.designsystem.components.foundations.text.model.DSTextModel
import dev.normansanchez.designsystem.components.foundations.text.model.DSTextStyle
import dev.normansanchez.designsystem.theme.MentorConnectTheme
import kotlinx.coroutines.delay

/**
 *  DSIconButton
 *
 *  @param dsIconButtonModel
 *
 *  @author Norman Sanchez
 *  @since 1.0.1
 *
 *  @sample DSIconButtonExamplePreview
 */
@Composable
fun DSIconButton(
    dsIconButtonModel: DSIconButtonModel
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isPressed by interactionSource.collectIsPressedAsState()
    val pressedListener by rememberUpdatedState(dsIconButtonModel.onClick)

    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val resolvedModifier = resolvedModifierDSIconButton(
            dsIconButtonModel = dsIconButtonModel,
            interactionSource = interactionSource
        )

        Box(
            modifier = resolvedModifier,
            contentAlignment = Alignment.Center,
        ) {
            Icon(
                painter = painterResource(id = dsIconButtonModel.resourceIconId),
                tint = resolvedIconTint(dsIconButtonModel.style),
                contentDescription = null
            )
        }

        LaunchedEffect(isPressed) {
            if (!isPressed) return@LaunchedEffect

            while (isPressed) {
                delay(dsIconButtonModel.stepDelay.coerceIn(1L, Long.MAX_VALUE))
                pressedListener()
            }
        }

        DSText(
            dsTextModel = dsIconButtonModel.dsTextModel.copy(
                maxLines = 1,
                modifier = Modifier
                    .wrapContentWidth()
                    .padding(top = 8.dp)
            )
        )
    }
}

@Preview(
    apiLevel = 36,
    uiMode = Configuration.UI_MODE_NIGHT_NO,
    showBackground = true,
)
@Composable
fun DSIconButtonExamplePreview() {
    MentorConnectTheme(
        darkTheme = isSystemInDarkTheme(),
        dynamicColor = false
    ) {
        Column {
            DSIconButton(
                dsIconButtonModel = DSIconButtonModel(
                    modifier = Modifier.padding(),
                    resourceIconId = R.drawable.favorite_filled,
                    dsTextModel = DSTextModel(
                        resourceId = previewDummySmallText,
                        maxLines = 1,
                        dsTextStyle = DSTextStyle.CAPTION,
                        alignmentText = TextAlign.Center
                    ),
                    onClick = {
                        println("Clicked")
                    }
                )
            )
            DSIconButton(
                dsIconButtonModel = DSIconButtonModel(
                    modifier = Modifier.padding(),
                    resourceIconId = R.drawable.favorite_filled,
                    dsTextModel = DSTextModel(
                        resourceId = previewDummySmallText,
                        maxLines = 1,
                        dsTextStyle = DSTextStyle.CAPTION,
                        alignmentText = TextAlign.Center
                    ),
                    onClick = {
                        println("Clicked")
                    },
                    style = DSIconButtonStyle.SECONDARY
                )
            )
            DSIconButton(
                dsIconButtonModel = DSIconButtonModel(
                    modifier = Modifier.padding(),
                    resourceIconId = R.drawable.favorite_filled,
                    dsTextModel = DSTextModel(
                        resourceId = previewDummySmallText,
                        maxLines = 1,
                        dsTextStyle = DSTextStyle.CAPTION,
                        alignmentText = TextAlign.Center
                    ),
                    onClick = {
                        println("Clicked")
                    },
                    style = DSIconButtonStyle.TERTIARY
                )
            )
        }
    }
}