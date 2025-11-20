package com.accenture.mentorconnect

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import dev.normansanchez.designsystem.components.foundations.text.DSText
import dev.normansanchez.designsystem.components.foundations.text.helper.DSTextHelperPreview.listText
import dev.normansanchez.designsystem.theme.MentorConnectTheme
import dev.normansanchez.designsystem.theme.dynamics.DynamicColors
import dev.normansanchez.designsystem.theme.dynamics.DynamicGradients

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MentorConnectTheme(
                darkTheme = isSystemInDarkTheme(),
                dynamicColor = false
            ) {
                val backgroundBrush = if (isSystemInDarkTheme()) {
                    DynamicGradients.primaryGradient
                } else {
                    Brush.verticalGradient(
                        colors = listOf(
                            DynamicColors.backgroundVar,
                            DynamicColors.backgroundVar
                        )
                    )
                }

                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .clip(RoundedCornerShape(20.dp)),
                    color = Color.Transparent,
                    shadowElevation = 0.dp,
                ) {
                    Box(
                        modifier = Modifier
                            .background(backgroundBrush)
                            .padding(20.dp)
                    ) {
                        LazyColumn(modifier = Modifier.padding(top = 56.dp)) {
                            items(listText.size) { index ->
                                DSText(listText[index])
                            }
                        }
                    }
                }
            }
        }
    }
}