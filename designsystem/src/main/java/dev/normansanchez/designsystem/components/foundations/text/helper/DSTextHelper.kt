package dev.normansanchez.designsystem.components.foundations.text.helper

import android.annotation.SuppressLint
import androidx.annotation.StringRes
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalInspectionMode
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import dev.normansanchez.designsystem.components.foundations.text.model.DSTextStyle
import dev.normansanchez.designsystem.theme.dynamics.DynamicColors
import dev.normansanchez.designsystem.theme.dynamics.DynamicFonts

object DSTextHelper {

    private const val DUMMY_SMALL_TEXT = -20
    private const val DUMMY_MEDIUM_TEXT = -15
    private const val DUMMY_LARGE_TEXT = -10
    private const val DUMMY_TEXT = -5

    @Composable
    fun textStyleFor(dsTextStyle: DSTextStyle): TextStyle {
        val base = when (dsTextStyle) {
            DSTextStyle.TITLE        -> DynamicFonts.typography.displayLarge
            DSTextStyle.SUBTITLE     -> DynamicFonts.typography.displaySmall
            DSTextStyle.HEADING      -> DynamicFonts.typography.headlineLarge
            DSTextStyle.SUBHEADING   -> DynamicFonts.typography.headlineSmall
            DSTextStyle.BODY         -> DynamicFonts.typography.bodyLarge
            DSTextStyle.BODY_MEDIUM  -> DynamicFonts.typography.bodySmall
            DSTextStyle.LABEL        -> DynamicFonts.typography.labelLarge
            DSTextStyle.LABEL_MEDIUM -> DynamicFonts.typography.labelMedium
            DSTextStyle.CAPTION      -> DynamicFonts.typography.labelSmall
        }

        val color = when (dsTextStyle) {

            // Headings (H1-H4) → blanco suave
            DSTextStyle.TITLE        -> DynamicColors.textTitleVar
            DSTextStyle.SUBTITLE     -> DynamicColors.textTitleVar

            // Headings menores → blanco suave también
            DSTextStyle.HEADING      -> DynamicColors.textTitleVar
            DSTextStyle.SUBHEADING   -> DynamicColors.textTitleVar

            // Body principal → blanco suave
            DSTextStyle.BODY         -> DynamicColors.textBodyVar

            // Body secundario → gris azulado
            DSTextStyle.BODY_MEDIUM  -> DynamicColors.textSubtitleVar

            // Label → gris azulado (como los “from $45”)
            DSTextStyle.LABEL        -> DynamicColors.textCaptionVar

            // Label medium (chips, info) → BLANCO puro o gris claro según contexto
            DSTextStyle.LABEL_MEDIUM -> DynamicColors.whiteAlways

            // Caption → gris azulado suave
            DSTextStyle.CAPTION      -> DynamicColors.textCaptionVar
        }


        return base.copy(color = color)
    }

    const val previewDummySmallText: Int = DUMMY_SMALL_TEXT
    const val previewDummyMediumText: Int = DUMMY_MEDIUM_TEXT
    const val previewDummyLargeText: Int = DUMMY_LARGE_TEXT
    const val previewDummyText: Int = DUMMY_TEXT

    @SuppressLint("ResourceType")
    @Composable
    fun resolveResourceId(@StringRes resourceId: Int): String {
        return if (resourceId < 0) {
            when (resourceId) {
                previewDummySmallText  -> LoremIpsum(words = 2).values.joinToString(" ")
                previewDummyMediumText -> LoremIpsum(words = 5).values.joinToString(" ")
                previewDummyLargeText  -> LoremIpsum(words = 15).values.joinToString(" ")
                previewDummyText       -> LoremIpsum(words = 50).values.joinToString(" ")
                else                   -> LoremIpsum(words = 3).values.joinToString(" ")
            }
        } else {
            stringResource(id = resourceId)
        }
    }
}
