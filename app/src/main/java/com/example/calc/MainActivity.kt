package com.example.calc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Delete
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import com.example.calc.ui.theme.CalcTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel: MainViewModel by viewModels()
        setContent {
            CalcTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = Color.White) {
                    Box(modifier = Modifier.fillMaxSize())
                    {

                            Row(modifier = Modifier.align(Alignment.TopEnd))
                            {
                                Text(
                                    viewModel.str.value.toString(),
                                    fontSize = 7.em,
                                    textAlign = TextAlign.End
                                )
                            }

                            Row(modifier = Modifier.align(Alignment.BottomCenter)) {
                                Column {

                                    FloatingActionButton(onClick = {
                                        /*TODO*/
                                        viewModel.Clear()
                                    }

                                    ) {
                                        Text(text = "AC", color = Color.White, fontSize = 6.em)

                                    }
                                    FloatingActionButton(onClick = {
                                        /*TODO*/
                                        viewModel.Helper("7")
                                    }

                                    ) {
                                        Text(text = " 7 ", color = Color.White, fontSize = 6.em)
                                    }
                                    FloatingActionButton(onClick = {
                                        /*TODO*/
                                        viewModel.Helper("4")
                                    }

                                    ) {
                                        Text(text = " 4 ", color = Color.White, fontSize = 6.em)
                                    }
                                    FloatingActionButton(onClick = {
                                        /*TODO*/
                                        viewModel.Helper("1")
                                    }

                                    ) {
                                        Text(text = " 1 ", color = Color.White, fontSize = 6.em)
                                    }
                                    FloatingActionButton(onClick = {
                                        /*TODO*/
                                    }

                                    ) {
                                        Text(text = "    ", color = Color.White, fontSize = 6.em)
                                    }

                                }
                                Column {

                                    FloatingActionButton(onClick = {
                                        /*TODO*/
                                        viewModel.Rub()
                                    }

                                    ) {
                                        Icon(
                                            imageVector = Icons.Default.Delete,
                                            tint = Color.White,
                                            contentDescription ="Add",
                                            modifier = Modifier.size(40.dp)
                                        )
                                    }
                                    FloatingActionButton(onClick = {
                                        /*TODO*/
                                        viewModel.Helper("8")
                                    }

                                    ) {
                                        Text(text = " 8 ", color = Color.White, fontSize = 6.em)
                                    }
                                    FloatingActionButton(onClick = {
                                        /*TODO*/
                                        viewModel.Helper("5")
                                    }

                                    ) {
                                        Text(text = " 5 ", color = Color.White, fontSize = 6.em)
                                    }
                                    FloatingActionButton(onClick = {
                                        /*TODO*/
                                        viewModel.Helper("2")
                                    }

                                    ) {
                                        Text(text = " 2 ", color = Color.White, fontSize = 6.em)
                                    }
                                    FloatingActionButton(onClick = {
                                        /*TODO*/
                                        viewModel.Helper("0")
                                    }

                                    ) {
                                        Text(text = " 0 ", color = Color.White, fontSize = 6.em)
                                    }

                                }
                                Column {

                                    FloatingActionButton(onClick = {
                                        /*TODO*/
                                    }

                                    ) {
                                        Text(text = "     ", color = Color.White, fontSize = 6.em)
                                    }
                                    FloatingActionButton(onClick = {
                                        /*TODO*/
                                        viewModel.Helper("9")
                                    }

                                    ) {
                                        Text(text = " 9 ", color = Color.White, fontSize = 6.em)
                                    }
                                    FloatingActionButton(onClick = {
                                        /*TODO*/
                                        viewModel.Helper("6")
                                    }

                                    ) {
                                        Text(text = " 6 ", color = Color.White, fontSize = 6.em)
                                    }
                                    FloatingActionButton(onClick = {
                                        /*TODO*/
                                        viewModel.Helper("3")
                                    }

                                    ) {
                                        Text(text = " 3 ", color = Color.White, fontSize = 6.em)
                                    }
                                    FloatingActionButton(onClick = {
                                        /*TODO*/
                                    }

                                    ) {
                                        Text(text = "     ", color = Color.White, fontSize = 6.em)
                                    }

                                }
                                Column {

                                    FloatingActionButton(onClick = {
                                        /*TODO*/
                                        viewModel.Helper("/")
                                    }

                                    ) {
                                        Text(text = "  /  ", color = Color.White, fontSize = 6.em)
                                    }
                                    FloatingActionButton(onClick = {
                                        /*TODO*/
                                        viewModel.Helper("*")
                                    }

                                    ) {
                                        Text(text = "  X  ", color = Color.White, fontSize = 6.em)
                                    }
                                    FloatingActionButton(onClick = {
                                        /*TODO*/
                                        viewModel.Helper("-")
                                    }

                                    ) {
                                        Text(text = "  -  ", color = Color.White, fontSize = 6.em)
                                    }
                                    FloatingActionButton(onClick = {
                                        /*TODO*/
                                        viewModel.Helper("+")
                                    }

                                    ) {
                                        Text(text = "  +  ", color = Color.White, fontSize = 6.em)
                                    }
                                    FloatingActionButton(onClick = {
                                        /*TODO*/
                                        viewModel.Evaluate()
                                    }

                                    ) {
                                        Text(text = " = ", color = Color.White, fontSize = 8.em)
                                    }

                                }

                        }
                    }
                }
            }
        }
    }
}
