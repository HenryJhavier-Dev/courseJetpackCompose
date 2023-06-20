package com.henryjhavierdev.jeckpackcomposeinsta

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.henryjhavierdev.jeckpackcomposeinsta.login.ui.LoginBody
import com.henryjhavierdev.jeckpackcomposeinsta.login.ui.LoginFooter
import com.henryjhavierdev.jeckpackcomposeinsta.login.ui.LoginHeader
import com.henryjhavierdev.jeckpackcomposeinsta.ui.theme.JeckpackComposeInstaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JeckpackComposeInstaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LoginScreen()
                }
            }
        }
    }
}

@Composable
fun LoginScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
    ) {
        LoginHeader(Modifier.align(Alignment.TopEnd))
        LoginBody(Modifier.align(Alignment.Center))
        LoginFooter(Modifier.align(Alignment.BottomCenter))
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JeckpackComposeInstaTheme {
        LoginScreen()
    }
}