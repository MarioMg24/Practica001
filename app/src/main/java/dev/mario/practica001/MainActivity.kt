package dev.mario.practica001

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.mario.practica001.ui.theme.Practica001Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Saludo()
        }
    }
}
@Composable
fun Saludo(){
    Column(
        modifier = Modifier.padding(vertical = 50.dp, horizontal = 16.dp)
    ) {
        Text(
            text = "hola",

        )
        Text(
            text = "Mi nombre es Goku",

        )
    }
}
