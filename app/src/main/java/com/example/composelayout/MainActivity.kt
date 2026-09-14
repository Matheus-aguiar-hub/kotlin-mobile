package com.example.composelayout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composelayout.ui.theme.ComposeLayoutTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeLayoutTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    LayoutScreen(modifier = Modifier.padding(innerPadding))
//                    Box(modifier = Modifier
//                        .padding(innerPadding) //ajusta o espaçamento do text
//                        .background(Color.Cyan) //adiciona cor no text
//                        //o .size fará com que eu possa ajustar os campos em que a cor Cyan
//                        //irá ficar com base no tamanho definido no width e height.
//                        .size(
//                            width = 200.dp,
//                            height = 400.dp
//                        ),
//                        contentAlignment = Alignment.Center //centraliza a mensagem e a cor
//                                                            //definida no campo Text
//                    ){
//                        Text("Aula Android")
//                        Text(
//                            text = "Com Jetpack Compose!",
//                            modifier = Modifier.align(Alignment.BottomCenter)
//                        )
//                    }
                }
            }
        }
    }
}

@Composable
fun LayoutScreen(modifier: Modifier) {
    Column(
        modifier = Modifier.background(
            color = Color.Yellow
        )
    ) {
        Text("Texto 1")
        Text("Texto 2")
        Text("Texto 3")

        //Textos alinhados em linhas
        Row(
            modifier = Modifier.background(
                color = Color.Blue
            )
        ) {
            Text("Texto 4")
            Text("Texto 5")
            Text("Texto 6")

            //Textos aliados em colunas
            Column(
                modifier = Modifier.background(
                    color = Color.Green
                )
            ) {
                Text("Texto 7")
                Text("Texto 8")
                Text("Texto 9")
            }
        }
    }
}

//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    ComposeLayoutTheme {
//        Greeting("Android")
//    }
//}