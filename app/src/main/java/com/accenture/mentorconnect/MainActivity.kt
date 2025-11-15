package com.accenture.mentorconnect

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.accenture.mentorconnect.ui.theme.MentorConnectBaseTheme.DynamicColors
import com.accenture.mentorconnect.ui.theme.MentorConnectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MentorConnectTheme {
                Text(
                    text = "Mentor Connect App",
                    style = MaterialTheme.typography.bodyMedium,
                    color = DynamicColors.primaryVar,
                    modifier = Modifier.padding(40.dp)
                )
            }
        }
    }
}