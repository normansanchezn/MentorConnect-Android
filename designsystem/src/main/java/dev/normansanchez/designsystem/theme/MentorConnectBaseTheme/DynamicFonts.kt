package dev.normansanchez.designsystem.theme.MentorConnectBaseTheme

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
        bodyMedium = TextStyle(
            fontFamily = MentorConnectFontFamily,
            fontWeight = FontWeight.Medium,
            fontSize = 16.sp,
            letterSpacing = (-0.8).sp
        )
    )
}