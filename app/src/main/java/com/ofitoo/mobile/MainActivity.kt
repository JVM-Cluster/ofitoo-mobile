package com.ofitoo.mobile

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.ofitoo.mobile.ui.theme.OfitoomobileTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            OfitoomobileTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("LIFECYCLE", "onStart: ")
    }

    override fun onResume() {
        super.onResume()
        Log.d("LIFECYCLE", "onResume: ")
    }

    override fun onPause() {
        super.onPause()
        Log.d("LIFECYCLE", "onPause: ")
    }

    override fun onStop() {
        super.onStop()
        Log.d("LIFECYCLE", "onStop: ")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("LIFECYCLE", "onRestart: ")
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
    OfitoomobileTheme {
        Greeting("Android")
    }
}