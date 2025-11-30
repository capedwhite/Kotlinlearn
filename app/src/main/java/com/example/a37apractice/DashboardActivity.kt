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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.a37apractice.ui.theme._37APracticeTheme

class DashboardActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
Clonebody()
        }
    }
}
@Composable
fun Clonebody() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(16.dp)

    ) {
Row(
    modifier=Modifier,
    horizontalArrangement = Arrangement.spacedBy(80.dp)
) {

    Text(
        text = "Recently played",
        color = Color.White,
        fontSize = 22.sp,
        fontWeight = FontWeight.Bold
    )
    Row(
modifier=Modifier,
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ){
        Icon(
            painter = painterResource(id = R.drawable.baseline_access_time_24),
            contentDescription = null,
            tint = Color.White,
            modifier = Modifier.size(25.dp)
        )
        Icon(
            painter = painterResource(id = R.drawable.baseline_more_horiz_24),
            contentDescription = null,
            tint = Color.White,
            modifier = Modifier.size(25.dp)
        )
        Icon(
                painter = painterResource(id = R.drawable.baseline_arrow_back_ios_24),
        contentDescription = null,
        tint = Color.White,
        modifier = Modifier.size(25.dp)
        )


    }
}
        Spacer(modifier = Modifier.height(12.dp))

        // RECENTLY PLAYED ROW
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(18.dp)
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Image(
                    painter = painterResource(id = R.drawable.lana),
                    contentDescription = null,
                    modifier = Modifier
                        .size(90.dp)
                        .clip(CircleShape)
                        .background(Color.DarkGray)
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = "lana del rey",
                    color = Color.White,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium
                )
            }

        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(id = R.drawable.img_11),
                contentDescription = null,
                modifier = Modifier
                    .size(90.dp)
                    .clip(CircleShape)
                    .background(Color.DarkGray)
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Billie Elish",
                color = Color.White,
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium
            )
        }

}
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.img_6),
                contentDescription = null,
                modifier = Modifier
                    .size(90.dp)
            )
            Spacer(modifier = Modifier.height(28.dp).width(10.dp))

            // YOUR 2021 IN REVIEW
            Text(
                text = "Your 2021 in review",
                color = Color.White,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
        }
        Spacer(modifier = Modifier.height(8.dp))

        // CARDS IN A ROW
        Row(
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalAlignment = Alignment.Top,
            modifier = Modifier.fillMaxWidth()
                .height(180.dp)
        ) {
            Column(
                modifier = Modifier
                    .background(Color.Black),
                        horizontalAlignment = Alignment.CenterHorizontally

            ) {

                Image(
                    painter = painterResource(id = R.drawable.img_7),
                    contentDescription = null,
                            modifier= Modifier.size(160.dp)

                )

                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    text = "Your top songs 2021",
                    color = Color.White,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold
                )
            }
            Column(
                modifier = Modifier

                    .background(Color.Black),
                horizontalAlignment = Alignment.CenterHorizontally


            ) {

                Image(
                    painter = painterResource(id = R.drawable.img_7),
                    contentDescription = null,
                    modifier= Modifier.size(160.dp)
                )
                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    text = "your artist revealed",
                    color = Color.White,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }

        Spacer(modifier = Modifier.height(10.dp))

        // EDITOR'S PICKS
        Text(
            text = "Editor's picks",
            color = Color.White,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(10.dp))

        Row(
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            modifier = Modifier.fillMaxWidth(),

            verticalAlignment = Alignment.Top,

        ) {
            Column(
                modifier = Modifier


                    .background(Color.Black),

                verticalArrangement = Arrangement.Top
            ) {

                Image(
                    painter = painterResource(id = R.drawable.img_9),
                    contentDescription = null,
                    modifier=Modifier.size(160.dp)
                )
                Text(
                    text = "Mitski, Tame Impala, Glass Animals, Charli XCX",
                    color = Color.White,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.width(160.dp)
                )
            }
            Column(
                modifier = Modifier


                    .background(Color.Black),

                verticalArrangement = Arrangement.Top
            ) {

                Image(
                    painter = painterResource(id = R.drawable.img_11),
                    contentDescription = null,
                            modifier=Modifier.size(160.dp),

                )
                Text(
                    text = "Ed Sheeran, Big Sean, Juice WRLD, Post Malone",
                    color = Color.White,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.width(160.dp)
                )
            }
        }
    }

}

@Preview
@Composable
fun Clonepreview(){
    Clonebody()
}