package com.example.a37apractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.a37apractice.ui.theme.LightBlue
import com.example.a37apractice.ui.theme.LightGreen
import com.example.a37apractice.ui.theme._37APracticeTheme

class CardActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
cloneCard()
        }
    }
}
@Composable
fun cloneCard() {
    Scaffold { padding ->
        Column(modifier = Modifier.padding(padding).background(color = LightGreen).fillMaxSize()) {
            Row(
                modifier = Modifier.fillMaxWidth().padding(10.dp),
                horizontalArrangement = Arrangement.End
            ) {
                Image(
                    painter = painterResource(R.drawable.img_11),
                    contentDescription = null,
                    modifier = Modifier.size(50.dp).clip(shape = CircleShape),

                    )

            }
            Column(modifier = Modifier.fillMaxWidth()) {

            }
            Text(
                text = "Card",
                modifier = Modifier.padding(horizontal = 10.dp),
                style = TextStyle(

                    fontSize = 50.sp,
                    color = Color.White,
                    fontWeight = FontWeight.SemiBold,
                )
            )
            Text(
                "Simple and easy to use app",
                Modifier.padding(horizontal = 10.dp),
                style = TextStyle(color = Color.White)
            )
            Spacer(modifier = Modifier.height(50.dp))
            Row(
                modifier = Modifier.fillMaxWidth().padding(horizontal = 10.dp)
                    .background(color = LightGreen)
            ) {
CardPre(Modifier.height(150.dp).weight(1f),R.drawable.book,"Text")
                Spacer(modifier = Modifier.width(10.dp))
                CardPre(Modifier.height(150.dp).weight(1f),R.drawable.img_14,"Address");

            }
            Spacer(modifier = Modifier.height(10.dp))
            Row(
                modifier = Modifier.fillMaxWidth().padding(horizontal = 10.dp)
                    .background(color = LightGreen)
            ) {
                CardPre(Modifier.height(150.dp).weight(1f),R.drawable.img_15,"Character")
                Spacer(modifier = Modifier.width(10.dp))
                CardPre(Modifier.height(150.dp).weight(1f),R.drawable.img_16,"Card");

            }
            Spacer(modifier = Modifier.height(10.dp))
            Row(
                modifier = Modifier.fillMaxWidth().padding(horizontal = 10.dp)
                    .background(color = LightGreen)
            ) {
                CardPre(Modifier.height(150.dp).weight(1f),R.drawable.img_17,"Passwords")
                Spacer(modifier = Modifier.width(10.dp))
                CardPre(Modifier.height(150.dp).weight(1f),R.drawable.img_18,"Logistics");

            }
            Spacer(modifier = Modifier.height(20.dp))

Card(    modifier = Modifier.height(120.dp).padding(horizontal = 10.dp).fillMaxWidth()) {
Row (Modifier.fillMaxSize().padding(10.dp)){
    Image(
        painter=painterResource(R.drawable.img_19),
        contentDescription = null,
        modifier = Modifier.size(50.dp),
    )
    Text (
        text="Settings",
        modifier=Modifier.padding(5.dp),
        style = TextStyle(fontSize = 20.sp)
    )
}
}

        }
    }
}
@Composable
fun CardPre(modifier: Modifier,image:Int,label:String) {
    Card(modifier = modifier) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(image),
                contentDescription = null,
                modifier = Modifier.size(90.dp)
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = label,
                style = TextStyle(
                    fontSize = 20.sp
                )
            )
        }
    }

}
@Preview
@Composable
fun Clone(){
    cloneCard()
}