package dev.normansanchez.designsystem.theme.dynamics

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import dev.normansanchez.designsystem.R

object DynamicFonts {

    val MentorConnectFontFamily = FontFamily(
        Font(R.font.mc_bold, weight = FontWeight.Bold),
        Font(R.font.mc_semi_bold, weight = FontWeight.SemiBold),
        Font(R.font.mc_medium, weight = FontWeight.Medium),
        Font(R.font.mc_regular, weight = FontWeight.Normal),
        Font(R.font.mc_light, weight = FontWeight.Light),
        Font(R.font.mc_light, weight = FontWeight.ExtraLight)
    )

    val typography = Typography(

        /* DISPLAY */
        displayLarge = TextStyle(
            fontFamily = MentorConnectFontFamily,
            fontWeight = FontWeight.Bold,
            fontSize = DynamicDimens.TextSizes.display,
            letterSpacing = (-0.2f).sp
        ),
        displaySmall = TextStyle(
            fontFamily = MentorConnectFontFamily,
            fontWeight = FontWeight.Bold,
            fontSize = DynamicDimens.TextSizes.xxxl,
            letterSpacing = (-0.2f).sp
        ),

        /* HEADLINES */
        headlineLarge = TextStyle(
            fontFamily = MentorConnectFontFamily,
            fontWeight = FontWeight.Bold,
            fontSize = DynamicDimens.TextSizes.xxl
        ),
        headlineSmall = TextStyle(
            fontFamily = MentorConnectFontFamily,
            fontWeight = FontWeight.Bold,
            fontSize = DynamicDimens.TextSizes.xl
        ),

        /* BODY */
        bodyLarge = TextStyle(
            fontFamily = MentorConnectFontFamily,
            fontWeight = FontWeight.Medium,
            fontSize = DynamicDimens.TextSizes.lg
        ),
        bodySmall = TextStyle(
            fontFamily = MentorConnectFontFamily,
            fontWeight = FontWeight.Medium,
            fontSize = DynamicDimens.TextSizes.md
        ),

        /* LABELS */
        labelLarge = TextStyle(
            fontFamily = MentorConnectFontFamily,
            fontWeight = FontWeight.Medium,
            fontSize = DynamicDimens.TextSizes.sm
        ),
        labelMedium = TextStyle(
            fontFamily = MentorConnectFontFamily,
            fontWeight = FontWeight.Medium,
            fontSize = DynamicDimens.TextSizes.xs
        ),
        labelSmall = TextStyle(
            fontFamily = MentorConnectFontFamily,
            fontWeight = FontWeight.Medium,
            fontSize = DynamicDimens.TextSizes.xs
        )
    )
}