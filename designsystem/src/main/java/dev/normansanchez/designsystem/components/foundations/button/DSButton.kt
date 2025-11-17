package dev.normansanchez.designsystem.components.foundations.button

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import dev.normansanchez.designsystem.components.foundations.button.model.DSButtonModel
import dev.normansanchez.designsystem.components.foundations.text.DSText

/**
 * DSButton
 *
 * @param dsButtonModel
 *
 * @author Norman Sanchez
 * @since 1.0.0
 * @version 1.0.0
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
        colors = ButtonColors(
            containerColor = buttonTypeResolved.backgroundColor,
            contentColor = buttonTypeResolved.textColor,
            disabledContainerColor = Color.Gray,
            disabledContentColor = Color.DarkGray
        )
    ) {
        DSText(
            dsTextModel = DSButtonHelper.getDsTextModel(dsButtonModel.textResourceId)
        )
    }
}



