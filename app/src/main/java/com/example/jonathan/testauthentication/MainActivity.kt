package com.example.jonathan.testauthentication

import android.os.Bundle
import android.widget.Toast
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
                        val authCheckMessage: String = if (username == "myusername") {
                            if (password == "mypassword") {
                                "Correct username and password"
                                // TODO: Continue to next screen
                            } else {
                                "Incorrect password"
                            }
                        } else {
                            if (password == "mypassword") {
                                "Incorrect username"
                            } else {
                                "Incorrect username and password"
                            }
                        }

                        Toast.makeText(this, authCheckMessage, Toast.LENGTH_LONG).show()
                    }
                )
            }
        }
    }
}
