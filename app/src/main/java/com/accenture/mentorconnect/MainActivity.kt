package com.accenture.mentorconnect

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import dev.normansanchez.designsystem.components.IconButtonCustom
import dev.normansanchez.designsystem.theme.MentorConnectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MentorConnectTheme {
                IconButtonCustom(modifier = Modifier.padding(16.dp))
            }
        }
    }
}