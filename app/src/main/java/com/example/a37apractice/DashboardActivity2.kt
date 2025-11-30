package com.example.a37apractice

import android.app.Activity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.a37apractice.ui.theme._37APracticeTheme

class DashboardActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
Dashboardbody()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Dashboardbody(){
val context = LocalContext.current
    val activity = context as Activity

    val email = activity.intent.getStringExtra("email")
    val password = activity.intent.getStringExtra("password")
    data class NavItem(val label:String,val icon:Int)
    var selectedIndex by remember { mutableStateOf(0) }
    val navList = listOf(
        NavItem(label = "Home", icon = R.drawable.baseline_home_24),
        NavItem(label = "Search", icon = R.drawable.baseline_search_24),
        NavItem(label = "Notification", icon = R.drawable.baseline_account_circle_24),
        NavItem(label = "Home", icon = R.drawable.baseline_settings_24)
    )
    Scaffold(
        topBar ={
            TopAppBar(
               title={Text("Ecommerce")},
                actions = {
                    IconButton(onClick = {
                        activity.finish()
                    }) {
                        Icon(
                            painter= painterResource(id=R.drawable.baseline_menu_24),
                            contentDescription=null
                        )
                    }
                    IconButton(onClick = {}) {
                        Icon(
                            painter= painterResource(id=R.drawable.baseline_help_24),
                            contentDescription=null
                        )
                    }
                    IconButton(onClick = {}) {
                        Icon(
                            painter= painterResource(id=R.drawable.baseline_settings_24),
                            contentDescription=null
                        )
                    }
                }

               )
        },
        bottomBar = {
            NavigationBar {
                navList.forEachIndexed { index,item->
         NavigationBarItem(
             icon= {
                 Icon(
                     painter = painterResource(item.icon),
                     contentDescription = null
                 )
             },
              label={
                  Text(item.label)
              },
             selected = selectedIndex==index,
             onClick = {
                 selectedIndex = index
             }



         )
                }
            }
        }
    ) { padding ->
        Box  (
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
        ){
       when(selectedIndex){
           0->HomeScreen()
           1->ProfileScreen()
           2->SearchScreen()
       }
        }
    }
}
@Preview
@Composable
fun previewFun(){
    Dashboardbody()
}