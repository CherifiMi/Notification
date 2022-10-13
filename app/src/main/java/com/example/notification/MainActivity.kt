package com.example.notification

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.notification.ui.theme.NotificationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NotificationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    App()
                }
            }
        }
    }
}

@Composable
fun App() {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.padding(100.dp)
    ) {
        Text(
            "Notifications in Jetpack Compose",
            style = MaterialTheme.typography.subtitle1,
            modifier = Modifier.padding(bottom = 100.dp)
        )

        // simple notification button
        Button(onClick = {
           /* showSimpleNotification(
                context,
                channelId,
                notificationId,
                "Simple notification",
                "This is a simple notification with default priority."
            )*/
        }, modifier = Modifier.padding(top = 16.dp)) {
            Text(text = "Simple Notification")
        }

        // simple notification button with tap action
        Button(onClick = {
            /*showSimpleNotificationWithTapAction(
                context,
                channelId,
                notificationId,
                "Simple notification + Tap action",
                "This simple notification will open an activity on tap."
            )*/
        }, modifier = Modifier.padding(top = 16.dp)) {
            Text(text = "Simple Notification + Tap Action")
        }

        // large text notification button
        Button(onClick = {
            /*showLargeTextNotification(
                context,
                channelId,
                notificationId + 1,
                "My Large Text Notification",
                bigText
            )*/
        }, modifier = Modifier.padding(top = 16.dp)) {
            Text(text = "Large Text Notification")
        }

        // large text with big icon notification
        Button(onClick = {
            /*showLargeTextWithBigIconNotification(
                context,
                channelId,
                notificationId + 2,
                "Large Text with Big Icon Notification",
                "This is a large text notification with a big icon on the right.",
                myBitmap
            )*/
        }, modifier = Modifier.padding(top = 16.dp)) {
            Text(text = "Large Text + Big Icon Notification")
        }

        // big picture with auto hiding thumbnail notification
        Button(onClick = {
            /*showBigPictureWithThumbnailNotification(
                context,
                channelId,
                notificationId + 3,
                "Big Picture + Avatar Notification",
                "This is a notification showing a big picture and an auto-hiding avatar.",
                myBitmap
            )*/
        }, modifier = Modifier.padding(top = 16.dp)) {
            Text(text = "Big Picture + Big Icon Notification")
        }
    }

}
