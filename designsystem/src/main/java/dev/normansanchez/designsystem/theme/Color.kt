package dev.normansanchez.designsystem.theme

import androidx.compose.ui.graphics.Color

// Brand
val PrimaryLight = Color(0xFF007FFF) // Accent azul (botones, pills, toggles) – #007FFF
val PrimaryDark  = Color(0xFF339DFF) // Azul un poco más claro sobre fondo oscuro

// En este diseño casi no hay "secondary" y "tertiary" fuertes, son azules más apagados.
val SecondaryLight = Color(0xFF111827) // Gris-azulado oscuro (chips / tags)
val SecondaryDark  = Color(0xFF020F24) // Paneles algo más claros que el fondo

val TertiaryLight = Color(0xFF00C2FF) // Azul celeste para detalles/gradients
val TertiaryDark  = Color(0xFF4FD5FF) // Variante luminosa para glow

// Backgrounds
val BackgroundLight = Color(0xFFF5F7FB) // Fondo claro suave, casi gris azulado
val BackgroundDark  = Color(0xFF000A17) // Navy casi negro del Behance

val SurfaceLight = Color(0xFFFFFFFF) // Cards en modo claro
val SurfaceDark  = Color(0xFF020F24) // Cards/paneles sobre fondo #000A17

val SurfaceSecondaryLight = Color(0xFFE4ECF7) // Chips / contenedores secundarios en light
val SurfaceSecondaryDark  = Color(0xFF062446) // Chips / contenedores secundarios en dark

// Text
val TextTitleLight = Color(0xFF050816) // Títulos en light (casi negro azulado)
val TextTitleDark  = Color(0xFFF5F7FF) // Títulos blancos suaves en dark

val TextSubtitleLight = Color(0xFF4B5563) // Subtítulos en light
val TextSubtitleDark  = Color(0xFFC7D2F5) // Subtítulos gris-azulados en dark

val TextBodyLight = Color(0xFF111827) // Cuerpo light
val TextBodyDark  = Color(0xFFE5E7EB) // Cuerpo dark (puedes dejar este)

val TextCaptionLight = Color(0xFF6B7280) // Caption light
val TextCaptionDark  = Color(0xFF9CA3AF) // Caption dark

val OnBackgroundLight = TextTitleLight
val OnBackgroundDark  = TextTitleDark

val OnSurfaceLight = TextBodyLight
val OnSurfaceDark  = TextBodyDark

// En este estilo, el texto sobre el botón azul es **SIEMPRE blanco**
val OnPrimaryLight = Color(0xFFFFFFFF)
val OnPrimaryDark  = Color(0xFFFFFFFF)

val OnSecondaryLight = Color(0xFFFFFFFF)
val OnSecondaryDark  = Color(0xFFFFFFFF)

// Tertiary casi siempre se usa en fondos claros, texto oscuro
val OnTertiaryLight = Color(0xFF00111F)
val OnTertiaryDark  = Color(0xFF00111F)

// States (estos pueden quedarse casi igual, son neutros y funcionan bien)
val SuccessLight = Color(0xFF22C55E)
val SuccessDark  = Color(0xFF4ADE80)

val WarningLight = Color(0xFFF59E0B)
val WarningDark  = Color(0xFFFBBF24)

val ErrorLight = Color(0xFFEF4444)
val ErrorDark  = Color(0xFFFCA5A5)

// Outline
val OutlineLight = Color(0xFFE5E7EB)
val OutlineDark  = Color(0xFF1F2933)

// Efecto glass (blancos translúcidos tipo DiWander)
val GlassLight       = Color(0x26FFFFFF) // ~15% white
val GlassDark        = Color(0x14FFFFFF) // ~8% white
val GlassBorderLight = Color(0x33FFFFFF) // ~20% white
val GlassBorderDark  = Color(0x26FFFFFF) // ~15% white
