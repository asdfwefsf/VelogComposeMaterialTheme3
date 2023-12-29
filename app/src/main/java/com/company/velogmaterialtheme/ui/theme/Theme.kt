package com.company.velogmaterialtheme.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Typography
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val LightColors = lightColorScheme(
    primary = custom1,
    onPrimary = custom2,
    primaryContainer = custom3,
    onPrimaryContainer = custom1,
    secondary = custom1,
    onSecondary = custom1,
    secondaryContainer = custom1,
    onSecondaryContainer = custom1,
    tertiary = custom1,
    onTertiary = custom1,
    tertiaryContainer = custom1,
    onTertiaryContainer = custom1,
    error = custom1,
    errorContainer = custom1,
    onError = custom1,
    onErrorContainer = custom1,
    background = lightBackground,
    onBackground = custom1,
    surface = custom1,
    onSurface = custom1,
    surfaceVariant = custom1,
    onSurfaceVariant = custom1,
    outline = custom1,
    inverseOnSurface = custom1,
    inverseSurface = custom1,
    inversePrimary = custom1,
    surfaceTint = custom1,
    outlineVariant = custom1,
    scrim = custom1
)

private val DarkColors = darkColorScheme(
    primary = custom4,
    onPrimary = custom5,
    primaryContainer = custom6,
    onPrimaryContainer = custom1,
    secondary = custom1,
    onSecondary = custom1,
    secondaryContainer = custom1,
    onSecondaryContainer = custom1,
    tertiary = custom1,
    onTertiary = custom1,
    tertiaryContainer = custom1,
    onTertiaryContainer = custom1,
    error = custom1,
    errorContainer = custom1,
    onError = custom1,
    onErrorContainer = custom1,
    background = darkBackground,
    onBackground = custom1,
    surface = custom1,
    onSurface = custom1,
    surfaceVariant = custom1,
    onSurfaceVariant = custom1,
    outline = custom1,
    inverseOnSurface = custom1,
    inverseSurface = custom1,
    inversePrimary = custom1,
    surfaceTint = custom1,
    outlineVariant = custom1,
    scrim = custom1
)

@Composable
fun VelogMaterialThemeTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = true,
    // parameter로 typography 추가 해주기
    typography : Typography = Typography,
    content: @Composable () -> Unit
) {
    val colors = if (!darkTheme) {
        LightColors
    } else {
        DarkColors
    }
    MaterialTheme(
        colorScheme = colors,
        content = content,
        typography = typography,
    )
}
