package dev.normansanchez.designsystem.theme

import android.os.Build
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import dev.normansanchez.designsystem.theme.dynamics.DynamicColors
import dev.normansanchez.designsystem.theme.dynamics.DynamicFonts
import dev.normansanchez.designsystem.theme.dynamics.DynamicShapes.mcShapes

@Composable
fun MentorConnectTheme(
    darkTheme: Boolean,
    dynamicColor: Boolean,
    content: @Composable () -> Unit
) {
    val colorScheme =
        if (dynamicColor && Build.VERSION.SDK_INT >= 31) {
            val context = LocalContext.current
            if (darkTheme) {
                dynamicDarkColorScheme(context)
            } else {
                dynamicLightColorScheme(context)
            }
        } else {
            if (darkTheme) {
                DynamicColors.DarkColorScheme
            } else {
                DynamicColors.LightColorScheme
            }
        }

    val shapes = mcShapes
    val typography = DynamicFonts.typography
    MaterialTheme(
        colorScheme = colorScheme,
        typography = typography,
        shapes = shapes,
        content = content
    )
}