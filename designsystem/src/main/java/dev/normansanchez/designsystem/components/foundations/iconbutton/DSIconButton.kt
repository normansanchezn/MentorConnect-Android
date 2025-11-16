package dev.normansanchez.designsystem.components.foundations.iconbutton

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import dev.normansanchez.designsystem.components.foundations.text.DSText
import dev.normansanchez.designsystem.components.foundations.iconbutton.model.DSIconButtonModel
import dev.normansanchez.designsystem.theme.OnSecondaryLight
import dev.normansanchez.designsystem.theme.dynamiccolors.DynamicColors
import kotlinx.coroutines.delay

/**
 *  DSIconButton
 *
 *  @param dsIconButtonModel
 *
 *  @author Norman Sanchez
 *  @since 1.0.0
 *
 *  @sample dev.normansanchez.designsystem.components.previews.DSIconButtonExamplePreview
 */
@Composable
fun DSIconButton(
    dsIconButtonModel: DSIconButtonModel
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        val interactionSource = remember { MutableInteractionSource() }
        val isPressed by interactionSource.collectIsPressedAsState()
        val pressedListener by rememberUpdatedState(dsIconButtonModel.onClick)

        Box(
            modifier = dsIconButtonModel.modifier
                .size(48.dp)
                .background(
                    color = DynamicColors.onPrimaryVar,
                    shape = RoundedCornerShape(6.dp)
                )
                .clickable(
                    interactionSource = interactionSource,
                    onClick = dsIconButtonModel.onClick
                ),
            contentAlignment = Alignment.Center,
        ) {
            Icon(
                painter = painterResource(id = dsIconButtonModel.resourceIconId),
                tint = OnSecondaryLight,
                contentDescription = null
            )
        }

        LaunchedEffect(isPressed) {
            while (isPressed) {
                delay(dsIconButtonModel.stepDelay.coerceIn(1L, Long.MAX_VALUE))
                pressedListener()
            }
        }

        DSText(
            modifier = Modifier.width(80.dp).padding(top = 8.dp),
            dsTextModel = dsIconButtonModel.dsTextModel
        )
    }
}


