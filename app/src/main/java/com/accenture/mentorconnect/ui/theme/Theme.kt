package com.accenture.mentorconnect.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import com.accenture.mentorconnect.ui.theme.MentorConnectBaseTheme.DynamicColors
import com.accenture.mentorconnect.ui.theme.MentorConnectBaseTheme.DynamicFonts
import com.accenture.mentorconnect.ui.theme.MentorConnectBaseTheme.DynamicShapes.mcShapes

@Composable
fun MentorConnectTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorTheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DynamicColors.DarkColorScheme
        else -> DynamicColors.LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorTheme,
        typography = DynamicFonts.typography,
        shapes = mcShapes,
        content = content
    )
}