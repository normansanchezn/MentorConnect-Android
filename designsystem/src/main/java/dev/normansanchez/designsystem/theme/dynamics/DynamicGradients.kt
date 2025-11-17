package dev.normansanchez.designsystem.theme.dynamics

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import dev.normansanchez.designsystem.theme.BackgroundDark
import dev.normansanchez.designsystem.theme.BackgroundLight
import dev.normansanchez.designsystem.theme.PrimaryDark
import dev.normansanchez.designsystem.theme.PrimaryLight
import dev.normansanchez.designsystem.theme.SurfaceDark
import dev.normansanchez.designsystem.theme.SurfaceLight
import dev.normansanchez.designsystem.theme.SurfaceSecondaryLight
import kotlin.coroutines.EmptyCoroutineContext.get

object DynamicGradients {

    // ---------------------------------------
    // 1. PRIMARY GRADIENT (Background screens)
    // Navy (#000A17) → Azul eléctrico (#007FFF)
    // ---------------------------------------
    val primaryGradient: Brush
    @Composable get() = Brush.verticalGradient(
        colors = listOf(
            BackgroundDark,         // top
            Color(0xFF001327),
            Color(0xFF003060),
            PrimaryDark,            // bottom azul claro
        )
    )

    // ---------------------------------------
    // 2. SURFACE GRADIENT (Cards / containers)
    // Navy oscuro → Soft blue glass
    // ---------------------------------------
    val surfaceGradient: Brush
    @Composable get() = Brush.linearGradient(
        colors = listOf(
            SurfaceDark,                   // #020F24
            Color(0xFF021A36),
            Color(0xFF062446),             // secondary surface
        )
    )

    // ---------------------------------------
    // 3. GLOW ACCENT GRADIENT
    // Azul eléctrico → Celeste brillante (glow)
    // ---------------------------------------
    val glowAccentGradient: Brush
    @Composable get() = Brush.radialGradient(
        colors = listOf(
            PrimaryLight,                  // #007FFF
            Color(0xFF00B4FF),             // celeste
            Color(0x802FFFD4),             // mint glow (transparente)
        )
    )

    // ---------------------------------------
    // 4. GLASS OVERLAY GRADIENT
    // Efecto glass: blanco leve → transparente
    // ---------------------------------------
    val glassOverlay: Brush
    @Composable get() = Brush.verticalGradient(
        colors = listOf(
            Color(0x33FFFFFF),             // high translucent white
            Color(0x11FFFFFF),             // softer
            Color(0x00FFFFFF),             // fade out
        )
    )

    // ---------------------------------------
    // 5. ACCENT BORDER GRADIENT
    // Azul → Celeste para borders premium
    // ---------------------------------------
    val accentBorder: Brush
    @Composable get() = Brush.linearGradient(
        colors = listOf(
            PrimaryLight,                  // left
            Color(0xFF00B4FF),             // mid
            Color(0xFF4FD5FF),             // right
        )
    )

    // -------------------------
    // LIGHT MODE (Soft premium)
    // -------------------------
    val primaryGradientLight: Brush
        @Composable get() = Brush.verticalGradient(
            colors = listOf(
                BackgroundLight,           // #F5F7FB
                Color(0xFFE8F0FF),
                Color(0xFFD4E5FF),
                Color(0xFFA6CCFF)
            )
        )

    val surfaceGradientLight: Brush
        @Composable get() = Brush.linearGradient(
            colors = listOf(
                SurfaceLight,              // #FFFFFF
                Color(0xFFF0F4FF),
                SurfaceSecondaryLight       // #E4ECF7
            )
        )

    // Glow accent (light)
    val glowAccentLight: Brush
        @Composable get() = Brush.radialGradient(
            colors = listOf(
                PrimaryLight,              // #007FFF
                Color(0xFF6AB7FF),
                Color(0x33A6CCFF)
            )
        )
}