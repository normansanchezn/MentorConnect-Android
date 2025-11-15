package com.accenture.mentorconnect.ui.theme.MentorConnectBaseTheme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.accenture.mentorconnect.ui.theme.BackgroundDark
import com.accenture.mentorconnect.ui.theme.BackgroundLight
import com.accenture.mentorconnect.ui.theme.GlassBorderDark
import com.accenture.mentorconnect.ui.theme.GlassBorderLight
import com.accenture.mentorconnect.ui.theme.GlassDark
import com.accenture.mentorconnect.ui.theme.GlassLight
import com.accenture.mentorconnect.ui.theme.OnBackgroundDark
import com.accenture.mentorconnect.ui.theme.OnBackgroundLight
import com.accenture.mentorconnect.ui.theme.OnPrimaryDark
import com.accenture.mentorconnect.ui.theme.OnPrimaryLight
import com.accenture.mentorconnect.ui.theme.OnSecondaryDark
import com.accenture.mentorconnect.ui.theme.OnSecondaryLight
import com.accenture.mentorconnect.ui.theme.OnSurfaceDark
import com.accenture.mentorconnect.ui.theme.OnSurfaceLight
import com.accenture.mentorconnect.ui.theme.OnTertiaryDark
import com.accenture.mentorconnect.ui.theme.OnTertiaryLight
import com.accenture.mentorconnect.ui.theme.OutlineDark
import com.accenture.mentorconnect.ui.theme.OutlineLight
import com.accenture.mentorconnect.ui.theme.PrimaryDark
import com.accenture.mentorconnect.ui.theme.PrimaryLight
import com.accenture.mentorconnect.ui.theme.SecondaryDark
import com.accenture.mentorconnect.ui.theme.SecondaryLight
import com.accenture.mentorconnect.ui.theme.SurfaceDark
import com.accenture.mentorconnect.ui.theme.SurfaceLight
import com.accenture.mentorconnect.ui.theme.TertiaryDark
import com.accenture.mentorconnect.ui.theme.TertiaryLight

object DynamicColors {
    val primaryVar: Color @Composable get() =
        if (isSystemInDarkTheme()) PrimaryDark else PrimaryLight

    val onPrimaryVar: Color @Composable get() =
        if (isSystemInDarkTheme()) OnPrimaryDark else OnPrimaryLight

    val secondaryVar: Color @Composable get() =
        if (isSystemInDarkTheme()) SecondaryDark else SecondaryLight

    val onSecondaryVar: Color @Composable get() =
        if (isSystemInDarkTheme()) OnSecondaryDark else OnSecondaryLight

    val backgroundVar: Color @Composable get() =
        if (isSystemInDarkTheme()) BackgroundDark else BackgroundLight

    val onBackgroundVar: Color @Composable get() =
        if (isSystemInDarkTheme()) OnBackgroundDark else OnBackgroundLight

    val surfaceVar: Color @Composable get() =
        if (isSystemInDarkTheme()) SurfaceDark else SurfaceLight

    val onSurfaceVar: Color @Composable get() =
        if (isSystemInDarkTheme()) OnSurfaceDark else OnSurfaceLight

    val outlineVar: Color @Composable get() =
        if (isSystemInDarkTheme()) OutlineDark else OutlineLight

    val glass: Color @Composable get() =
        if (isSystemInDarkTheme()) GlassDark else GlassLight

    val glassBorder: Color @Composable get() =
        if (isSystemInDarkTheme()) GlassBorderDark else GlassBorderLight

    val tertiaryVar: Color @Composable get() =
        if (isSystemInDarkTheme()) TertiaryDark else TertiaryLight

    val onTertiaryVar: Color @Composable get() =
        if (isSystemInDarkTheme()) OnTertiaryDark else OnTertiaryLight

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