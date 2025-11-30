package com.example.a37apractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.a37apractice.ui.theme._37APracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
MainBody();
        }
    }
}

@Composable
fun MainBody(){
    Column (
modifier = Modifier.fillMaxSize()
    .background(color = Color.Gray),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top

        
    ) {
        Text(
            text = "hello", style = TextStyle(
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Italic,
                color = colorResource(id = R.color.green),
                fontSize = 30.sp,
                textAlign = TextAlign.Center,
                textDecoration = TextDecoration.Underline


            )
        );
        Row {
            Text(text = "Hello world");
            Text(text = "Android");
        }
        Row {
            Text(text = "............................", style = TextStyle(
                color = colorResource(id = R.color.pink)
            ))
        }
        }
    }


@Preview
@Composable
fun PreviewMain(){
    MainBody()
}