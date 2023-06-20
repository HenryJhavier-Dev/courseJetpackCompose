package com.henryjhavierdev.jeckpackcomposeinsta.login.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.henryjhavierdev.jeckpackcomposeinsta.R

@Composable
fun LoginBody(modifier: Modifier) {

    var email by rememberSaveable { mutableStateOf("") }
    var pass by rememberSaveable { mutableStateOf("") }
    var isLoginEnable by rememberSaveable { mutableStateOf(false) }

    Column(modifier = modifier) {
        ImageLogo(Modifier.align(Alignment.CenterHorizontally))
        LoginEmail(email, Modifier.padding(top = 16.dp)) { email = it }
        LoginPass(pass, Modifier.padding(top = 16.dp)) { pass = it }
        ForgotPassword(
            Modifier
                .align(Alignment.End)
                .padding(top = 16.dp)
        )
        LoginButton(isLoginEnable, Modifier.fillMaxWidth())
        LoginDivider()
        LoginSocialMedia()
    }
}

@Composable
fun ImageLogo(modifier: Modifier) {
    Image(
        modifier = modifier,
        painter = painterResource(id = R.drawable.insta),
        contentDescription = "Logo"
    )
}

@Composable
fun LoginButton(isLoginEnable: Boolean, modifier: Modifier) {
    Button(onClick = {}, enabled = isLoginEnable, modifier = modifier) {
        Text(text = "Log In")
    }
}

@Composable
fun LoginSocialMedia() {
    Row(
        Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {

        Image(
            painter = painterResource(id = R.drawable.fb),
            contentDescription = "Social Media Login",
            Modifier.size(24.dp)
        )

        Text(
            text = "Continue as Henry",
            fontSize = 14.sp,
            color = Color.Blue,
            modifier = Modifier.padding(8.dp)
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginEmail(email: String, modifier: Modifier, onTextChange: (String) -> Unit) {

    TextField(
        value = email, onValueChange = onTextChange,
        modifier = modifier.fillMaxWidth(),
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginPass(email: String, modifier: Modifier, onTextChange: (String) -> Unit) {
    TextField(
        modifier = modifier.fillMaxWidth(),
        value = email,
        onValueChange = onTextChange
    )
}

@Composable
fun ForgotPassword(modifier: Modifier) {
    Text(
        text = "Forgot password?",
        fontSize = 12.sp,
        fontWeight = FontWeight.Bold,
        color = Color.Blue,
        modifier = modifier,
    )
}


@Composable
fun LoginDivider() {
    Row(
        Modifier
            .fillMaxWidth()
            .padding(top = 16.dp), verticalAlignment = Alignment.CenterVertically
    ) {
        Divider(
            Modifier
                .background(Color(0xFFF9F9F9))
                .height(1.dp)
                .weight(1f)
        )
        Text(
            text = "Or",
            Modifier.padding(horizontal = 6.dp),
            fontSize = 12.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFFB5B5B5)
        )

        Divider(
            Modifier
                .background(Color(0xFFF9F9F9))
                .height(1.dp)
                .weight(1f)
        )
    }

}

