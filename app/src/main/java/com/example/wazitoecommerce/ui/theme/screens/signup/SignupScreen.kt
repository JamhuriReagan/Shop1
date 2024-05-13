package com.example.wazitoecommerce.ui.theme.screens.signup

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.R
import com.example.wazitoecommerce.data.AuthViewModel
import com.example.wazitoecommerce.navigation.ROUT_DASHBOARD
import com.example.wazitoecommerce.navigation.ROUT_LOGIN

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignupScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .paint(
                painterResource(id = R.drawable.back5),
                contentScale = ContentScale.FillBounds
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        androidx.compose.material3.Text(
            text = "shop With Us",
            fontSize = 60.sp,
            fontWeight = FontWeight.ExtraBold,
            fontFamily = FontFamily.Cursive
        )
        Spacer(modifier = Modifier.height(30.dp))

        var name by remember { mutableStateOf("") }
        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }

        androidx.compose.material3.Text(
            text = "Username",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        androidx.compose.material3.OutlinedTextField(
            value = name,
            onValueChange = { name = it },
            label = { androidx.compose.material3.Text(text = "Enter name") },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp),
            shape = RoundedCornerShape(20.dp),
            trailingIcon = {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = "",
                    tint = Color.Black
                )
            }
        )

        Spacer(modifier = Modifier.height(10.dp))

        androidx.compose.material3.Text(
            text = "Email Address",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        androidx.compose.material3.OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { androidx.compose.material3.Text(text = "Enter email") },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp),
            shape = RoundedCornerShape(20.dp),
            trailingIcon = {
                Icon(imageVector = Icons.Default.Email, contentDescription = "", tint = Color.Black)
            }
        )

        Spacer(modifier = Modifier.height(10.dp))

        androidx.compose.material3.Text(
            text = "Password",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
        androidx.compose.material3.OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { androidx.compose.material3.Text(text = "Enter password") },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password
            ),
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp),
            shape = RoundedCornerShape(20.dp),
            trailingIcon = {
                Icon(imageVector = Icons.Default.Lock, contentDescription = "", tint = Color.Black)
            }
        )

        Spacer(modifier = Modifier.height(10.dp))

        val context = LocalContext.current
        val authViewModel = AuthViewModel(navController, context)
        androidx.compose.material3.Button(
            onClick = {
                navController.navigate(ROUT_DASHBOARD)
                authViewModel.signup(name, email, password)
            },
            colors = ButtonDefaults.buttonColors(Color.LightGray),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp),
            shape = RoundedCornerShape(20.dp),
        ) {
            androidx.compose.material3.Text(text = "Create")
        }

        Spacer(modifier = Modifier.height(10.dp))

        androidx.compose.material3.Button(
            onClick = {
                navController.navigate(ROUT_LOGIN)
            },
            colors = ButtonDefaults.buttonColors(Color.LightGray),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp),
            shape = RoundedCornerShape(20.dp),
        ) {
            androidx.compose.material3.Text(text = "Login instead")
        }
        Spacer(modifier = Modifier.height(10.dp))

        androidx.compose.material3.Text(text = "Continue as guest",
            fontSize = 20.sp,
            textDecoration = TextDecoration.Underline,
            modifier = Modifier.clickable {
                navController.navigate(ROUT_DASHBOARD)

            })


    }
}

@Preview
@Composable
fun SignupScreenPreview() {
    SignupScreen(rememberNavController())
}