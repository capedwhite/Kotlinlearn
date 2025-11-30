package com.example.a37apractice

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.a37apractice.ui.theme.Black
import com.example.a37apractice.ui.theme.LightBlue
import com.example.a37apractice.ui.theme._37APracticeTheme
import com.example.a37apractice.ui.theme.blue
import com.example.a37apractice.ui.theme.grey
import com.example.a37apractice.ui.theme.lighteal

class LoginPage : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
Loginpage()
        }
    }
}
@Composable
fun Loginpage(){
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var visibility by remember { mutableStateOf(false) }
val context = LocalContext.current
    val activity = context as Activity

    val sharedPreferences = context.getSharedPreferences(
        "User",
        Context.MODE_PRIVATE
    )

    val localEmail: String? = sharedPreferences.getString("email", "")
    val localPassword: String? = sharedPreferences.getString("password", "")

    Scaffold { padding ->
    Column(modifier= Modifier.fillMaxSize().padding(padding)
        .background(color= Color.White)) {
        Spacer(modifier = Modifier.height(60.dp))
        Text(
            text = "Sign In",
            style = TextStyle(
                textAlign = TextAlign.Center,
                fontSize = 40.sp,
                color = LightBlue,
                fontWeight = FontWeight.SemiBold,
            ),
            modifier = Modifier.fillMaxWidth()
        )
        Text(
            text = "This is a website that provides knowledge about random days and quizz",
            style = TextStyle(
                textAlign = TextAlign.Center,
                color = Black.copy(0.4f)

            ),
            modifier = Modifier.padding(vertical = 20.dp, horizontal = 15.dp)
        )

        Row(
            modifier = Modifier.fillMaxWidth().padding(horizontal = 10.dp)

        ) {
            MediaCard(
                Modifier.height(70.dp).weight(1f),
                R.drawable.img_12, "Facebook"
            )
            Spacer(modifier = Modifier.width(10.dp));
            MediaCard(Modifier.height(70.dp).weight(1f), R.drawable.img_13, "Gmail")
        }
        Row(
            modifier = Modifier.padding(vertical = 20.dp, horizontal = 10.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            HorizontalDivider(
                modifier = Modifier.weight(1f)
            )
            Text("OR", Modifier.padding(horizontal = 10.dp))
            HorizontalDivider(
                modifier = Modifier.weight(1f)
            )
        }
        OutlinedTextField(
            value = email,
            onValueChange = { data ->
                email = data
            },
            shape = RoundedCornerShape(20.dp),
            placeholder = {
                Text("abcd@gmail.com")
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 15.dp),
            colors = TextFieldDefaults.colors(
                focusedContainerColor = lighteal,
                unfocusedContainerColor = grey,
                focusedIndicatorColor = blue,
                unfocusedIndicatorColor = Color.Transparent
            )

        )
        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(
            value = password,
            onValueChange = { data ->
                password = data
            },
            trailingIcon = {
                IconButton(onClick = {
                    visibility = !visibility
                }) {
                    Icon(
                        painter = if (visibility)
                            painterResource(R.drawable.baseline_visibility_24)
                        else
                            painterResource(R.drawable.baseline_visibility_off_24),
                        contentDescription = null
                    )
                }

            },
            visualTransformation = if (visibility) VisualTransformation.None else PasswordVisualTransformation(),
            shape = RoundedCornerShape(15.dp),
            placeholder = {
                Text("********")
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 15.dp),
            colors = TextFieldDefaults.colors(
                focusedContainerColor = lighteal,
                unfocusedContainerColor = grey,
                focusedIndicatorColor = blue,
                unfocusedIndicatorColor = Color.Transparent
            )

        )

        Text(
            "Forget password",
            style = TextStyle(
                textAlign = TextAlign.End
            ),
            modifier = Modifier
                .fillMaxWidth()
                .clickable {

                }
                .padding(vertical = 15.dp, horizontal = 15.dp)
        )

        Button(
            onClick = {

                if (localEmail?.trim() == email.trim() && localPassword?.trim() == password.trim()) {
                    val intent = Intent(

                        context, DashboardActivity2::class.java

                    )
                    intent.putExtra("email" ,email)
                    intent.putExtra("password",password)

                    context.startActivity(intent)
                    activity.finish()
                } else {
                    Toast.makeText(context,
                        "invalid login",
                        Toast.LENGTH_SHORT).show()
                }
            },
            colors = ButtonDefaults.buttonColors(
                containerColor = LightBlue,       // Background color
                contentColor = Color.White         // Text & icon color
            ),
            elevation = ButtonDefaults.buttonElevation(
                defaultElevation = 10.dp

            ),
            modifier = Modifier
                .fillMaxWidth().height(60.dp)
                .padding(horizontal = 15.dp),

            shape = RoundedCornerShape(10.dp),

            ) {
            Text("Log In")
        }
Spacer(modifier=Modifier.height(10.dp))
        Text(buildAnnotatedString {
            append("Don't have account?")

            withStyle(SpanStyle(color = LightBlue)) {
                append("Sign  up")
            }


        },
            modifier = Modifier.padding(10.dp)
                .clickable{
                    val intent =Intent(
                        context, RegistrationActivity::class.java
                    )
                    context.startActivity(intent)

                }


            )


    }
    }
}


@Composable
fun MediaCard(modifier: Modifier,image:Int,label: String){
    Card(
        modifier=modifier
        ){
        Row( modifier=Modifier.fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center){
            Image(
painter = painterResource(image),
                contentDescription = "null",
                modifier= Modifier.size(25.dp)
            )
            Spacer(modifier= Modifier.width(10.dp))
Text(
    text=label,
    style = TextStyle(
        fontSize = 20.sp
    )
)
        }

    }
}
@Preview
@Composable
fun preview(){
    Loginpage()
}

