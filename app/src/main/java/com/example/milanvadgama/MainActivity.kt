package com.example.milanvadgama
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
//import androidx.compose.foundation.ScrollableColumn
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                HeartRateTracker()
            }
        }
    }
}

@Composable
fun HeartRateTracker() {
    var heartRate by remember { mutableStateOf("") }
    var dateTime by remember { mutableStateOf("") }
    var heartRateHistory by remember { mutableStateOf(listOf<String>()) }

    Column(
        modifier = Modifier.padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedTextField(
            value = heartRate,
            onValueChange = { heartRate = it },
            label = { Text("Heart Rate") },
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.LightGray)
        )

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = dateTime,
            onValueChange = { dateTime = it },
            label = { Text("Date/Time") },
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.LightGray)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(
                onClick = { /* Load button click action */ },
                enabled = heartRateHistory.isNotEmpty()
            ) {
                Text("Load")

            }


            Spacer(modifier = Modifier.width(16.dp))

            Button(
                onClick = { /* Save button click action */ }
            ) {
                Text("Save")
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text("Heart Rate History:")
        /*ScrollableColumn {
            heartRateHistory.forEach {
                Text(it)
            }
        }*/

        Spacer(modifier = Modifier.height(400.dp))

        Text(text ="Student Name: Jon Doe")
        Text(text ="College ID: 12345")
    }
}
