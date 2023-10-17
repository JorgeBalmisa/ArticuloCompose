package com.example.articulocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.*
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.*
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.articulocompose.ui.theme.ArticuloComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArticuloComposeTheme {
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
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
private fun Articulo(titulo : String, encabezado : String, descripcion : String, modifier : Modifier = Modifier) {
    val image = painterResource(R.drawable.bg_compose_background)
    Column(modifier = modifier) {
        Image(
            painter = image,
            contentDescription = null
        )

        Text(
            text = titulo,
            fontSize = 88.sp,
            modifier = modifier.padding(16.dp),
            )
        Text(
            text = encabezado,
            fontSize = 24.sp,
            modifier = modifier.padding(16.dp),
        )
        Text(
            text = descripcion,
            fontSize = 24.sp,
            modifier = modifier.padding(16.dp),
        )
    }




}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ArticuloComposeTheme {
        Articulo(titulo = stringResource(R.string.articuloTitulo), encabezado = stringResource(R.string.articuloEncabezado),
            descripcion = stringResource(R.string.ArticuloDescripcion)
        )
    }
}