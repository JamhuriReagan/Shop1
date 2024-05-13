package com.example.wazitoecommerce.ui.theme.screens.groceries

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.R

@Composable
fun GroceriesScreen(navController: NavHostController) {

    val mContext = LocalContext.current

    Column(modifier = Modifier.fillMaxSize()
        .paint(
            painterResource(id = R.drawable.back4),
            contentScale = ContentScale.FillBounds
        )) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            contentAlignment = Alignment.BottomStart
        ) {
            Image(painter = painterResource(id = R.drawable.gro1),
                contentDescription ="madola",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
            Column {
                Text(
                    text = "FRESH GROCERIES",
                    fontSize = 35.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    textAlign = TextAlign.Center
                )

                Text(
                    text = "quality",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    textAlign = TextAlign.Center
                )
            }

            Spacer(modifier = Modifier.height(20.dp))
        }
        //end of Box
        Column(modifier = Modifier
            .verticalScroll(rememberScrollState())
            .padding(start = 20.dp)
        ) {

            //Row 1
            Row (){
                Column {
                    Card(
                        modifier = Modifier
                            .height(140.dp)
                            .width(150.dp)
                    ) {
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.skuma),
                                contentDescription = "oven",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )

                        }
                    }

                    Spacer(modifier = Modifier.height(2.dp))

                    Text(
                        text = "kales",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                    )

                    Text(
                        text = "Ksh.100",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )

                    OutlinedButton(
                        onClick = {
                            val simToolKitLaunchIntent =
                                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                            simToolKitLaunchIntent?.let { mContext.startActivity(it)}
                        },
                        shape = RoundedCornerShape(5.dp),
                        border = BorderStroke(1.dp, Color.Black)

                    ) {
                        Text(
                            text = "Buy",
                            color = Color.Black
                        )
                    }


                }

                Spacer(modifier = Modifier.width(50.dp))

                Column {
                    Card(
                        modifier = Modifier
                            .height(140.dp)
                            .width(150.dp)
                    ) {
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.cabbage),
                                contentDescription = "car",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )

                        }
                    }

                    Spacer(modifier = Modifier.height(2.dp))

                    Text(
                        text = "cabbage",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                    )

                    Text(
                        text = "Ksh.200",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )

                    OutlinedButton(
                        onClick = {
                            val simToolKitLaunchIntent =
                                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                            simToolKitLaunchIntent?.let { mContext.startActivity(it)}
                        },
                        shape = RoundedCornerShape(5.dp),
                        border = BorderStroke(1.dp, Color.Black)

                    ) {
                        Text(
                            text = "Buy",
                            color = Color.Black
                        )
                    }


                }

            }
            //End of Row 1

            Spacer(modifier = Modifier.height(20.dp))

            //Row 1
            Row (){
                Column {
                    Card(
                        modifier = Modifier
                            .height(140.dp)
                            .width(150.dp)
                    ) {
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.banana),
                                contentDescription = "car",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )

                        }
                    }

                    Spacer(modifier = Modifier.height(2.dp))

                    Text(
                        text = "Banana",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                    )

                    Text(
                        text = "Ksh.600",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )

                    OutlinedButton(
                        onClick = {
                            val simToolKitLaunchIntent =
                                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                            simToolKitLaunchIntent?.let { mContext.startActivity(it)}
                        },
                        shape = RoundedCornerShape(5.dp),
                        border = BorderStroke(1.dp, Color.Black)

                    ) {
                        Text(
                            text = "Buy",
                            color = Color.Black
                        )
                    }


                }

                Spacer(modifier = Modifier.width(50.dp))

                Column {
                    Card(
                        modifier = Modifier
                            .height(140.dp)
                            .width(150.dp)
                    ) {
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.apple),
                                contentDescription = "car",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )

                        }
                    }

                    Spacer(modifier = Modifier.height(2.dp))

                    Text(
                        text = "Apple",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                    )

                    Text(
                        text = "Ksh.150",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )

                    OutlinedButton(
                        onClick = {
                            val simToolKitLaunchIntent =
                                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                            simToolKitLaunchIntent?.let { mContext.startActivity(it)}
                        },
                        shape = RoundedCornerShape(5.dp),
                        border = BorderStroke(1.dp, Color.Black)

                    ) {
                        Text(
                            text = "Buy",
                            color = Color.Black
                        )
                    }


                }

            }
            //End of Row 1

            Spacer(modifier = Modifier.height(20.dp))

            //Row 1
            Row (){
                Column {
                    Card(
                        modifier = Modifier
                            .height(140.dp)
                            .width(150.dp)
                    ) {
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            val mContext= LocalContext.current
                            Image(
                                painter = painterResource(id = R.drawable.dragon),
                                contentDescription = "car",
                                modifier = Modifier
                                    .fillMaxSize()
                                    .clickable {
                                        Toast.makeText(mContext,"Clicked on main image",
                                            Toast.LENGTH_LONG).show()
                                    },

                                contentScale = ContentScale.FillBounds
                            )

                        }
                    }

                    Spacer(modifier = Modifier.height(2.dp))

                    Text(
                        text = "White Dragon Fruit",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                    )

                    Text(
                        text = "Ksh.1150",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )

                    OutlinedButton(
                        onClick = {
                            val simToolKitLaunchIntent =
                                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                            simToolKitLaunchIntent?.let { mContext.startActivity(it)}
                        },
                        shape = RoundedCornerShape(5.dp),
                        border = BorderStroke(1.dp, Color.Black)

                    ) {
                        Text(
                            text = "Buy",
                            color = Color.Black
                        )
                    }


                }

                Spacer(modifier = Modifier.width(50.dp))

                Column {
                    Card(
                        modifier = Modifier
                            .height(140.dp)
                            .width(150.dp)
                    ) {
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.dragon2),
                                contentDescription = "car",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )

                        }
                    }

                    Spacer(modifier = Modifier.height(2.dp))

                    Text(
                        text = "Red Dragon Fruit",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                    )

                    Text(
                        text = "Ksh.1500",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )

                    OutlinedButton(
                        onClick = {
                            val simToolKitLaunchIntent =
                                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                            simToolKitLaunchIntent?.let { mContext.startActivity(it)}
                        },
                        shape = RoundedCornerShape(5.dp),
                        border = BorderStroke(1.dp, Color.Black)

                    ) {
                        Text(
                            text = "Buy",
                            color = Color.Black
                        )
                    }


                }

            }
            //End of Row 1

            Spacer(modifier = Modifier.height(20.dp))

            //Row 1
            Row (){
                Column {
                    Card(
                        modifier = Modifier
                            .height(140.dp)
                            .width(150.dp)
                    ) {
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.mangoes),
                                contentDescription = "car",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )

                        }
                    }

                    Spacer(modifier = Modifier.height(2.dp))

                    Text(
                        text = "Apple mangoes",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                    )

                    Text(
                        text = "Ksh.200",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )

                    OutlinedButton(
                        onClick = {
                            val simToolKitLaunchIntent =
                                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                            simToolKitLaunchIntent?.let { mContext.startActivity(it)}
                        },
                        shape = RoundedCornerShape(5.dp),
                        border = BorderStroke(1.dp, Color.Black)

                    ) {
                        Text(
                            text = "Buy",
                            color = Color.Black
                        )
                    }


                }

                Spacer(modifier = Modifier.width(50.dp))

                Column {
                    Card(
                        modifier = Modifier
                            .height(140.dp)
                            .width(150.dp)
                    ) {
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.malenge),
                                contentDescription = "car",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )

                        }
                    }

                    Spacer(modifier = Modifier.height(2.dp))

                    Text(
                        text = "Malenge",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                    )

                    Text(
                        text = "Ksh.1000",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )

                    OutlinedButton(
                        onClick = {
                            val simToolKitLaunchIntent =
                                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                            simToolKitLaunchIntent?.let { mContext.startActivity(it)}
                        },
                        shape = RoundedCornerShape(5.dp),
                        border = BorderStroke(1.dp, Color.Black)

                    ) {
                        Text(
                            text = "Buy",
                            color = Color.Black
                        )
                    }


                }

            }
            //End of Row 1
        }


    }

}

@Preview
@Composable
fun GroceriesScreenPreview() {
    GroceriesScreen(rememberNavController())
}