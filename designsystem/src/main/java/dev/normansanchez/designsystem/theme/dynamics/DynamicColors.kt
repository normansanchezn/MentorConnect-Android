package dev.normansanchez.designsystem.theme.dynamics

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import dev.normansanchez.designsystem.theme.BackgroundDark
import dev.normansanchez.designsystem.theme.BackgroundLight
import dev.normansanchez.designsystem.theme.ErrorDark
import dev.normansanchez.designsystem.theme.ErrorLight
import dev.normansanchez.designsystem.theme.GlassBorderDark
import dev.normansanchez.designsystem.theme.GlassBorderLight
import dev.normansanchez.designsystem.theme.GlassDark
import dev.normansanchez.designsystem.theme.GlassLight
import dev.normansanchez.designsystem.theme.OnBackgroundDark
import dev.normansanchez.designsystem.theme.OnBackgroundLight
import dev.normansanchez.designsystem.theme.OnPrimaryDark
import dev.normansanchez.designsystem.theme.OnPrimaryLight
import dev.normansanchez.designsystem.theme.OnSecondaryDark
import dev.normansanchez.designsystem.theme.OnSecondaryLight
import dev.normansanchez.designsystem.theme.OnSurfaceDark
import dev.normansanchez.designsystem.theme.OnSurfaceLight
import dev.normansanchez.designsystem.theme.OnTertiaryDark
import dev.normansanchez.designsystem.theme.OnTertiaryLight
import dev.normansanchez.designsystem.theme.OutlineDark
import dev.normansanchez.designsystem.theme.OutlineLight
import dev.normansanchez.designsystem.theme.PrimaryDark
import dev.normansanchez.designsystem.theme.PrimaryLight
import dev.normansanchez.designsystem.theme.SecondaryDark
import dev.normansanchez.designsystem.theme.SecondaryLight
import dev.normansanchez.designsystem.theme.SuccessDark
import dev.normansanchez.designsystem.theme.SuccessLight
import dev.normansanchez.designsystem.theme.SurfaceDark
import dev.normansanchez.designsystem.theme.SurfaceLight
import dev.normansanchez.designsystem.theme.SurfaceSecondaryDark
import dev.normansanchez.designsystem.theme.SurfaceSecondaryLight
import dev.normansanchez.designsystem.theme.TertiaryDark
import dev.normansanchez.designsystem.theme.TertiaryLight
import dev.normansanchez.designsystem.theme.TextBodyDark
import dev.normansanchez.designsystem.theme.TextBodyLight
import dev.normansanchez.designsystem.theme.TextCaptionDark
import dev.normansanchez.designsystem.theme.TextCaptionLight
import dev.normansanchez.designsystem.theme.TextSubtitleDark
import dev.normansanchez.designsystem.theme.TextSubtitleLight
import dev.normansanchez.designsystem.theme.TextTitleDark
import dev.normansanchez.designsystem.theme.TextTitleLight
import dev.normansanchez.designsystem.theme.WarningDark
import dev.normansanchez.designsystem.theme.WarningLight
object DynamicColors {

    // -----------------------------
    // BRAND (Primary, Secondary, Tertiary)
    // -----------------------------
    val primaryVar: Color
        @Composable get() = if (isSystemInDarkTheme()) PrimaryDark else PrimaryLight

    val onPrimaryVar: Color
        @Composable get() = if (isSystemInDarkTheme()) OnPrimaryDark else OnPrimaryLight

    val secondaryVar: Color
        @Composable get() = if (isSystemInDarkTheme()) SecondaryDark else SecondaryLight

    val onSecondaryVar: Color
        @Composable get() = if (isSystemInDarkTheme()) OnSecondaryDark else OnSecondaryLight


    val tertiaryVar: Color
        @Composable get() = if (isSystemInDarkTheme()) TertiaryDark else TertiaryLight

    val onTertiaryVar: Color
        @Composable get() = if (isSystemInDarkTheme()) OnTertiaryDark else OnTertiaryLight


    // -----------------------------
    // BACKGROUND / SURFACE
    // -----------------------------
    val backgroundVar: Color
        @Composable get() = if (isSystemInDarkTheme()) BackgroundDark else BackgroundLight

    val onBackgroundVar: Color
        @Composable get() = if (isSystemInDarkTheme()) OnBackgroundDark else OnBackgroundLight

    val surfaceVar: Color
        @Composable get() = if (isSystemInDarkTheme()) SurfaceDark else SurfaceLight

    val onSurfaceVar: Color
        @Composable get() = if (isSystemInDarkTheme()) OnSurfaceDark else OnSurfaceLight


    val surfaceSecondaryVar: Color
        @Composable get() = if (isSystemInDarkTheme()) SurfaceSecondaryDark else SurfaceSecondaryLight


    // -----------------------------
    // TEXT TOKENS (Semantic aliases)
    // -----------------------------
    val textTitleVar: Color
        @Composable get() = if (isSystemInDarkTheme()) TextTitleDark else TextTitleLight

    val textSubtitleVar: Color
        @Composable get() = if (isSystemInDarkTheme()) TextSubtitleDark else TextSubtitleLight

    val textBodyVar: Color
        @Composable get() = if (isSystemInDarkTheme()) TextBodyDark else TextBodyLight

    val textCaptionVar: Color
        @Composable get() = if (isSystemInDarkTheme()) TextCaptionDark else TextCaptionLight

    // States
    val successVar: Color
        @Composable get() = if (isSystemInDarkTheme()) SuccessDark else SuccessLight

    val warningVar: Color
        @Composable get() = if (isSystemInDarkTheme()) WarningDark else WarningLight

    val errorVar: Color
        @Composable get() = if (isSystemInDarkTheme()) ErrorDark else ErrorLight

    // Outline / glass (Android-specific)
    val outlineVar: Color
        @Composable get() = if (isSystemInDarkTheme()) OutlineDark else OutlineLight

    val glass: Color
        @Composable get() = if (isSystemInDarkTheme()) GlassDark else GlassLight

    val glassBorder: Color
        @Composable get() = if (isSystemInDarkTheme()) GlassBorderDark else GlassBorderLight

    val whiteAlways: Color
        @Composable get() = Color.White

    val DarkColorScheme = darkColorScheme(
        primary = PrimaryDark,
        onPrimary = OnPrimaryDark,
        secondary = SecondaryDark,
        onSecondary = OnSecondaryDark,
        tertiary = TertiaryDark,
        onTertiary = OnTertiaryDark,
        background = BackgroundDark,
        onBackground = OnBackgroundDark,
        surface = SurfaceDark,
        onSurface = OnSurfaceDark,
        outline = OutlineDark
    )

    val LightColorScheme = lightColorScheme(
        primary = PrimaryLight,
        onPrimary = OnPrimaryLight,
        secondary = SecondaryLight,
        onSecondary = OnSecondaryLight,
        tertiary = TertiaryLight,
        onTertiary = OnTertiaryLight,
        background = BackgroundLight,
        onBackground = OnBackgroundLight,
        surface = SurfaceLight,
        onSurface = OnSurfaceLight,
        outline = OutlineLight
    )
}