package com.accenture.mentorconnect

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import dev.normansanchez.designsystem.components.foundations.media.lottie.DSLottie
import dev.normansanchez.designsystem.components.foundations.media.lottie.DSLottieModel
import dev.normansanchez.designsystem.theme.MentorConnectTheme
import dev.normansanchez.designsystem.theme.dynamiccolors.DynamicColors

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MentorConnectTheme(
                darkTheme = isSystemInDarkTheme(),
                dynamicColor = true
            ) {
                Surface(
                    color = DynamicColors.backgroundVar,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
                        DSLottie(
                            dsLottieModel = DSLottieModel(
                                modifier = Modifier
                                    .size(500.dp)
                                    .padding(),
                                lottieResourceId = dev.normansanchez.designsystem.R.raw.shared_lottie
                            )
                        )
                    }
                }
            }
        }
    }
}