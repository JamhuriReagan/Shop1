package com.example.wazitoecommerce.ui.theme.screens.dashboard

import android.content.Intent
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.R
import com.example.wazitoecommerce.navigation.ROUT_BEAUTY
import com.example.wazitoecommerce.navigation.ROUT_CLOTHING
import com.example.wazitoecommerce.navigation.ROUT_ELECTRONIC
import com.example.wazitoecommerce.navigation.ROUT_GROCERIES
import com.example.wazitoecommerce.navigation.ROUT_HOME
import com.example.wazitoecommerce.navigation.ROUT_PHARMACY
import com.example.wazitoecommerce.navigation.ROUT_VIEWRODUCT
import com.example.wazitoecommerce.ui.theme.lBlue


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardScreen(navController: NavHostController){
   Column (modifier = Modifier
      .fillMaxSize()
      .paint(
           painterResource(id = R.drawable.back4),
   contentScale = ContentScale.FillBounds
   )
   ){
      //TOP APP BAR
      TopAppBar(title = { Text(text = "World Shopies")}
      )
      //END OF TOP APP BAR
      Spacer(modifier = Modifier.height(20.dp))

      Row(modifier = Modifier.padding(start=20.dp)) {
         Column {
            Text(text = "WORLD",
               fontSize = 30.sp,
               color = lBlue,


            )
            Text(text = "shop from A to Z",
               fontSize = 15.sp)
         }
         Spacer(modifier = Modifier.width(100.dp))

         Image(painter = painterResource(id =R.drawable.shop3),
            contentDescription ="serv" ,
            modifier = Modifier.size(80.dp))
      }
      //end of raw
      Spacer(modifier = Modifier.height(30.dp))

      Column (modifier = Modifier.padding(start = 20.dp)){
         //ROW 1
         Row {
            Card(modifier = Modifier.size(width = 150.dp, height = 100.dp)
               .clickable { navController.navigate(ROUT_ELECTRONIC) }) {
               Column {
                  Box (modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
                     Image(painter = painterResource(id =R.drawable.electronics),
                        contentDescription ="serv" ,
                        modifier = Modifier.size(50.dp))
                  }
                  Text(text = "electronics", fontSize = 15.sp,
                     modifier = Modifier.fillMaxWidth(),
                     textAlign = TextAlign.Center)
               }

               Spacer(modifier = Modifier.height(20.dp))
            }
            Spacer(modifier = Modifier.width(20.dp))
            //end of card 1
            Card(
               modifier = Modifier
                  .clickable {
                     navController.navigate(ROUT_CLOTHING)
                  }
                  .size(width = 150.dp, height = 100.dp)
            ) {
               Column {
                  Box (modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
                     Image(painter = painterResource(id =R.drawable.clothing),
                        contentDescription ="serv" ,
                        modifier = Modifier.size(50.dp))
                  }
                  Text(text = "Clothing", fontSize = 15.sp,
                     modifier = Modifier.fillMaxWidth(),
                     textAlign = TextAlign.Center)
               }


            }

         }
         //END OF ROW 1
         Spacer(modifier = Modifier.height(20.dp))

         //ROW 1
         Row {
            val mContext= LocalContext.current
            Card(modifier = Modifier.size(width = 150.dp, height = 100.dp)
               .clickable {
                  navController.navigate(ROUT_VIEWRODUCT)
               }) {
               Column {
                  Box (modifier = Modifier
                     .fillMaxWidth()
                     .clickable {
                        Toast.makeText(mContext,"Clicked on main image", Toast.LENGTH_LONG).show() },
                     contentAlignment = Alignment.Center){
                     Image(painter = painterResource(id = R.drawable.home),
                        contentDescription ="serv" ,
                        modifier = Modifier.size(50.dp))
                  }
                  Text(text = "View More Products", fontSize = 15.sp,
                     modifier = Modifier.fillMaxWidth(),
                     textAlign = TextAlign.Center)
               }


            }
            Spacer(modifier = Modifier.width(20.dp))
            //end of card 1
            Card(modifier = Modifier
               .size(width = 150.dp, height = 100.dp)
               .clickable {
                  navController.navigate(ROUT_BEAUTY)
               }) {
               Column {
                  Box (modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
                     Image(painter = painterResource(id = R.drawable.beauty),
                        contentDescription ="serv" ,
                        modifier = Modifier.size(50.dp))
                  }
                  Text(text = "Beauty", fontSize = 15.sp,
                     modifier = Modifier.fillMaxWidth(),
                     textAlign = TextAlign.Center)
               }


            }

         }
         //END OF ROW 1
         Spacer(modifier = Modifier.height(20.dp))
         Row {
            val mContext= LocalContext.current
            Card(modifier = Modifier
               .size(width = 150.dp, height = 100.dp)
               .clickable {
                  navController.navigate(ROUT_PHARMACY)
               }) {
               Column {
                  Box (modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
                     Image(painter = painterResource(id = R.drawable.pharm),
                        contentDescription ="serv" ,
                        modifier = Modifier.size(50.dp)

                         )
                  }
                  Text(text = "Pharmacy", fontSize = 15.sp,
                     modifier = Modifier.fillMaxWidth(),
                     textAlign = TextAlign.Center)
               }


            }
            Spacer(modifier = Modifier
               .width(20.dp)
               )
            //end of card 1
            Card(modifier = Modifier
               .size(width = 150.dp, height = 100.dp)
               .clickable {
                  navController.navigate(ROUT_GROCERIES)
               }
            ) {
               Column {
                  Box (modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
                     Image(painter = painterResource(id =R.drawable.groc),
                        contentDescription ="serv" ,
                        modifier = Modifier.size(50.dp)
                           )
                  }
                  Text(text = "Groceries", fontSize = 15.sp,
                     modifier = Modifier.fillMaxWidth(),
                     textAlign = TextAlign.Center)
               }


            }

         }

      }








   }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DashboardScreen(){
   DashboardScreen(rememberNavController())
}