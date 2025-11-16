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
import androidx.compose.material3.Surface
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import dev.normansanchez.designsystem.R
import dev.normansanchez.designsystem.components.foundations.iconbutton.DSIconButton
import dev.normansanchez.designsystem.components.foundations.iconbutton.model.DSIconButtonModel
import dev.normansanchez.designsystem.components.foundations.text.model.DSTextModel
import dev.normansanchez.designsystem.components.foundations.text.model.DSTextStyle
import dev.normansanchez.designsystem.theme.dynamiccolors.DynamicColors
import dev.normansanchez.designsystem.theme.MentorConnectTheme

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
                        DSIconButton(
                            dsIconButtonModel = DSIconButtonModel(
                                modifier = Modifier.padding(),
                                resourceIconId = R.drawable.favorite_filled,
                                dsTextModel = DSTextModel(
                                    resourceId = R.string.dummy_txt,
                                    maxLines = 1,
                                    dsTextStyle = DSTextStyle.CAPTION,
                                    alignmentText = TextAlign.Center
                                ),
                                onClick = {
                                    println("Clicked")
                                }
                            )
                        )
                    }

                }
            }
        }
    }
}