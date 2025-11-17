package dev.normansanchez.designsystem.components.foundations.button

import android.util.Log
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import dev.normansanchez.designsystem.R
import dev.normansanchez.designsystem.components.foundations.button.helper.DSButtonHelper
import dev.normansanchez.designsystem.components.foundations.button.model.DSButtonModel
import dev.normansanchez.designsystem.components.foundations.button.model.DSButtonType
import dev.normansanchez.designsystem.components.foundations.text.DSText
import dev.normansanchez.designsystem.components.foundations.text.helper.DSTextHelper.previewDummySmallText
import dev.normansanchez.designsystem.theme.MentorConnectTheme
import dev.normansanchez.designsystem.theme.dynamics.DynamicColors

/**
 * DSButton
 *
 * @param dsButtonModel
 *
 * @author Norman Sanchez
 * @since 1.0.0
 * @version 1.0.1
 *
 * @see DSButtonModel
 *
 * @sample dev.normansanchez.designsystem.components.foundations.button.DSButton
 */
@Composable
fun DSButton(
    dsButtonModel: DSButtonModel
) {
    val buttonTypeResolved = DSButtonHelper.resolvedButtonType(dsButtonModel.buttonType)

    Button(
        modifier = dsButtonModel.modifier,
        enabled = dsButtonModel.isEnabled,
        onClick = dsButtonModel.onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = buttonTypeResolved.backgroundColor,
            contentColor = buttonTypeResolved.textColor,
            disabledContainerColor = DynamicColors.onSurfaceVar.copy(alpha = 0.08f),
            disabledContentColor = DynamicColors.onSurfaceVar.copy(alpha = 0.3f)
        )
    ) {
        DSText(
            dsTextModel = DSButtonHelper.getDsTextModel(dsButtonModel.textResourceId)
        )
    }
}

@Preview(showBackground = false, apiLevel = 36)
@Composable
fun DSButtonPrimaryExample() {
    MentorConnectTheme(
        darkTheme = isSystemInDarkTheme(),
        dynamicColor = true
    ) {
        DSButton(
            dsButtonModel = DSButtonModel(
                modifier = Modifier.padding(),
                textResourceId = previewDummySmallText,
                onClick = {
                    Log.i("TAG", "onCreate: Button primary clicked")
                },
                buttonType = DSButtonType.PRIMARY,
                isEnabled = true
            )
        )
    }
}

@Preview(showBackground = false, apiLevel = 36)
@Composable
fun DSButtonSecondaryExample() {
    MentorConnectTheme(
        darkTheme = isSystemInDarkTheme(),
        dynamicColor = true
    ) {
        DSButton(
            dsButtonModel = DSButtonModel(
                modifier = Modifier.padding(),
                textResourceId = previewDummySmallText,
                onClick = {
                    Log.i("TAG", "onCreate: Button primary clicked")
                },
                buttonType = DSButtonType.SECONDARY,
                isEnabled = true
            )
        )
    }
}

@Preview(showBackground = false, apiLevel = 36)
@Composable
fun DSButtonTertiaryExample() {
    MentorConnectTheme(
        darkTheme = isSystemInDarkTheme(),
        dynamicColor = true
    ) {
        DSButton(
            dsButtonModel = DSButtonModel(
                modifier = Modifier.padding(),
                textResourceId = previewDummySmallText,
                onClick = {
                    Log.i("TAG", "onCreate: Button primary clicked")
                },
                buttonType = DSButtonType.SECONDARY,
                isEnabled = true
            )
        )
    }
}


