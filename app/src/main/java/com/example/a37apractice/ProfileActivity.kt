package com.example.a37apractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.a37apractice.ui.theme.LightBlue
import com.example.a37apractice.ui.theme._37APracticeTheme


class ProfileActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

profilebody()
        }
    }
}

@Composable
fun profilebody() {
    Scaffold { padding ->
        Column(
            modifier = Modifier.fillMaxSize()

                .background(color = Color.White),

            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {


            Row(
                modifier = Modifier.fillMaxWidth()
                    .padding(10.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically

            )
            {
                Icon(
                    painter = painterResource(id = R.drawable.baseline_arrow_back_ios_24),
                    contentDescription = null,

                    )
                Text(
                    text = "Instagram", style = TextStyle(
                        fontSize = 20.sp,
                        fontWeight = FontWeight.SemiBold,
                        textAlign = TextAlign.Center
                    )
                )
                Image(
                    painter = painterResource(id = R.drawable.img),
                    contentDescription = null,

                    modifier = Modifier.size(50.dp),
                )
                Icon(
                    painter = painterResource(id = R.drawable.baseline_more_horiz_24),
                    contentDescription = null
                )

            }
            Row(
                modifier = Modifier.fillMaxWidth()
                    .padding(10.dp),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically,

                ) {
                Image(
                    painter = painterResource(id = R.drawable.logo),

                    contentDescription = null,
                    modifier = Modifier.size(80.dp)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop

                )
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,

                    ) {
                    Text(
                        text = "349", style = TextStyle(
                            fontSize = 20.sp,
                            fontWeight = FontWeight.SemiBold

                        )

                    )

                    Text(
                        text = "Posts", style = TextStyle(
                            fontSize = 17.sp,

                            )
                    )
                }
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,

                    ) {
                    Text(
                        text = "90k", style = TextStyle(
                            fontSize = 20.sp,
                            fontWeight = FontWeight.SemiBold

                        )

                    )

                    Text(
                        text = "Followers", style = TextStyle(
                            fontSize = 17.sp,

                            )
                    )
                }
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,

                    ) {
                    Text(
                        text = "20", style = TextStyle(
                            fontSize = 20.sp,
                            fontWeight = FontWeight.SemiBold

                        )

                    )

                    Text(
                        text = "Following", style = TextStyle(
                            fontSize = 17.sp,

                            )
                    )
                }

            }
            Column(
                modifier = Modifier.padding(horizontal = 20.dp),
                horizontalAlignment = Alignment.Start,


                ) {

                Text(
                    text = "Instagram", style = TextStyle(
                        fontSize = 17.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
                Text(
                    text = "Bringing you closer to the people and things you love",
                    style = TextStyle(
                        fontSize = 17.sp

                    )
                )
                Text(
                    text = "Help.instagram.com", style = TextStyle(
                        fontSize = 17.sp,
                        color = Color.Blue

                    )
                )
                Text(

                    text = buildAnnotatedString {

                        withStyle(
                            style = SpanStyle(
                                fontSize = 17.sp,
                                color = Color.Black
                            )
                        ) {
                            append("followed by ")
                        }

                        withStyle(
                            style = SpanStyle(
                                fontSize = 17.sp,
                                fontWeight = FontWeight.Bold,

                                )
                        ) {
                            append("Username1 ")
                        }

                        withStyle(
                            style = SpanStyle(
                                fontSize = 17.sp,
                                color = Color.Black
                            )
                        ) {
                            append("and ")
                        }

                        withStyle(
                            style = SpanStyle(
                                fontSize = 17.sp,
                                color = Color.Black,
                                fontWeight = FontWeight.Bold
                            )
                        ) {
                            append("Username2")
                        }

                    },

                )
            }
            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.SpaceAround
            ) {
                OutlinedButton(


                    onClick={println("Button clicked")},
                        modifier = Modifier.fillMaxWidth()
                    .padding(5.dp),
                    shape=RoundedCornerShape(0.dp)

                ){Text(text="Button")}
                Row(
                    modifier = Modifier.fillMaxWidth().padding(horizontal=5.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Button(
                        onClick = { println("button clicked")},
                        modifier=Modifier,
                        shape=RoundedCornerShape(5.dp),
                  colors= ButtonDefaults.buttonColors(
                      containerColor= LightBlue,
                      contentColor=Color.White
                  )


                    ) { Text(text = "Follow") }
                    OutlinedButton(
                        onClick = { println("button clicked")
                        },
                                modifier=Modifier.padding().width(130.dp),
                        shape=RoundedCornerShape(5.dp),
                    ) { Text(text = "Message") }
                    OutlinedButton(
                        onClick = { println("button clicked")
                        },modifier=Modifier.padding().width(90.dp),
                        shape=RoundedCornerShape(5.dp),
                    ) { Text(text = "Email") }
                    OutlinedButton(
                        onClick = { println("button clicked") },
                                modifier=Modifier.padding().width(40.dp),

                        shape=RoundedCornerShape(5.dp),
                    ) { Icon(
                        painter = painterResource(id =R.drawable.baseline_keyboard_arrow_down_24),
                                contentDescription = null,
                        modifier = Modifier.width(20.dp)
                    ) }
                }
                Row(
                    modifier=Modifier.fillMaxWidth().padding(vertical=8.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ){
                    Column(
                        modifier=Modifier,
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally

                    ) {
                        Image(
                            painter = painterResource(R.drawable.img_1),
                            contentDescription = null,
                            modifier = Modifier.size(65.dp)
                                .border(
                                    width = 2.dp,
                                    color = Color.LightGray,
                                    shape = CircleShape
                                )
                                .padding(4.dp)
                                .clip(shape = CircleShape),
                            contentScale = ContentScale.Crop
                        )
                        Text(
                            text="story 1",
                            style = TextStyle(
                                fontSize = 14.sp

                            )
                        )
                    }
                    Column(
                        modifier=Modifier,
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally

                    ) {
                        Image(
                            painter = painterResource(R.drawable.img_2),
                            contentDescription = null,
                            modifier = Modifier.size(65.dp)
                                .border(
                                    width = 2.dp,
                                    color = Color.LightGray,
                                    shape = CircleShape
                                )
                                .padding(4.dp)
                                .clip(shape = CircleShape),
                            contentScale = ContentScale.Crop

                        )
                        Text(
                            text="story 2",
                            style = TextStyle(
                                fontSize = 14.sp

                            )
                        )
                    }
                    Column(
                        modifier=Modifier,
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally

                    ) {
                        Image(
                            painter = painterResource(R.drawable.img_3),
                            contentDescription = null,
                            modifier = Modifier.size(65.dp)
                                .border(
                                    width = 2.dp,
                                    color = Color.LightGray,
                                    shape = CircleShape
                                )
                                .padding(4.dp)
                                .clip(shape = CircleShape),
                            contentScale = ContentScale.Crop
                        )
                        Text(
                            text="story 3",
                            style = TextStyle(
                                fontSize = 14.sp

                            )
                        )
                    }
                    Column(
                        modifier=Modifier,
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally

                    ) {
                        Image(
                            painter = painterResource(R.drawable.img_4),
                            contentDescription = null,
                            modifier = Modifier.size(65.dp)
                                .border(
                                    width = 2.dp,
                                    color = Color.LightGray,
                                    shape = CircleShape
                                )
                                .padding(4.dp)
                                .clip(shape = CircleShape),
                            contentScale = ContentScale.Crop
                        )
                        Text(
                            text="story 4",
                            style = TextStyle(
                                fontSize = 14.sp

                            )
                        )
                    }
                    Column(
                        modifier=Modifier,
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally

                    ) {
                        Image(
                            painter = painterResource(R.drawable.img_5),
                            contentDescription = null,
                            modifier = Modifier.size(65.dp)
                                .border(
                                    width = 2.dp,
                                    color = Color.LightGray,
                                    shape = CircleShape
                                )
                                .padding(4.dp)
                                .clip(shape = CircleShape),
                            contentScale = ContentScale.Crop
                        )
                        Text(
                            text="story 5",
                            style = TextStyle(
                                fontSize = 14.sp

                            )
                        )
                    }
                }
            }

        }
    }
}
@Preview
@Composable
fun Mainpreview(){
    profilebody()
}