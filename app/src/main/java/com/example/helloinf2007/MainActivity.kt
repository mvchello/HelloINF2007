package com.example.helloinf2007

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.helloinf2007.ui.theme.HelloINF2007Theme
import androidx.compose.foundation.layout.Column
import android.util.Log
//import java.text.SimpleDateFormat
//import java.util.*
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //val currentDate = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(Date())
        //val logMessage = "OnCreate function is created at $currentDate"
        // Get the current date and time
        val currentDateTime = LocalDateTime.now()

        // Define a custom date and time format
        val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")

        // Format the current  date and time using the formatter
        val formattedDateTime = currentDateTime.format(formatter)

        val logMessage = "OnCreate function is created at $formattedDateTime"

        Log.d("MainActivity", logMessage) // This is the Log.d() call
        setContent {
            HelloINF2007Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column {
                        Greeting("INF2007")
                        From("Michael")
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HelloINF2007Theme {
        Greeting("Android")
    }
}

@Composable
fun From(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "From $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun FromPreview() {
    HelloINF2007Theme {
        From("Michael")
    }
}