package com.henryjhavierdev.jeckpackcomposeinsta.login.ui

import android.app.Activity
import androidx.compose.foundation.clickable
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext

@Composable
fun LoginHeader(modifier: Modifier){
    val activity = LocalContext.current as Activity

    Icon(imageVector = Icons.Default.Close,
        contentDescription = "Default close",
        modifier = modifier.clickable {
            activity.finish()
        }
    )
}