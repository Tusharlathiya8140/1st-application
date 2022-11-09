package com.example.my1stapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.my1stapplication.ui.theme.My1stApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            My1stApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Tushar")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello my name is $name i make 1st app on 11/8/22" , fontSize = 40.sp)
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    My1stApplicationTheme {
        Greeting("Tushar")
    }
}