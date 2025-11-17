package com.accenture.mentorconnect

import android.os.Bundle
import android.util.Log
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
import dev.normansanchez.designsystem.R
import dev.normansanchez.designsystem.components.foundations.button.DSButton
import dev.normansanchez.designsystem.components.foundations.button.model.DSButtonModel
import dev.normansanchez.designsystem.components.foundations.button.model.DSButtonType
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
                        DSButton(
                            dsButtonModel = DSButtonModel(
                                modifier = Modifier.padding(),
                                textResourceId = R.string.dummy_txt,
                                onClick = {
                                    Log.i("TAG", "onCreate: Button primary clicked")
                                },
                                buttonType = DSButtonType.PRIMARY,
                                isEnabled = true
                            )
                        )
                    }

                }
            }
        }
    }
}