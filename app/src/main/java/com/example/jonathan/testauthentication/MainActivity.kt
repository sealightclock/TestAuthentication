package com.example.jonathan.testauthentication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.jonathan.testauthentication.ui.theme.TestAuthenticationTheme
import com.example.jonathan.testauthentication.view.PasswordAuthenticationScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            TestAuthenticationTheme {
                PasswordAuthenticationScreen(
                    onAuthenticate = { username, password ->
                        // TODO
                    }
                )
            }
        }
    }
}
