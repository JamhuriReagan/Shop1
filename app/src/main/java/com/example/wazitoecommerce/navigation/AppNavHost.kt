package com.example.wazitoecommerce.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.firebasestorage.ui.theme.screens.splash.SplashScreen
import com.example.wazitoecommerce.ui.theme.screens.about.AboutScreen
import com.example.wazitoecommerce.ui.theme.screens.beauty.BeautyScreen
import com.example.wazitoecommerce.ui.theme.screens.clothing.ClothinScreen
import com.example.wazitoecommerce.ui.theme.screens.dashboard.DashboardScreen
import com.example.wazitoecommerce.ui.theme.screens.electronic.ElectronicScreen
import com.example.wazitoecommerce.ui.theme.screens.groceries.GroceriesScreen
import com.example.wazitoecommerce.ui.theme.screens.home.HomeScreen
import com.example.wazitoecommerce.ui.theme.screens.login.LoginScreen
import com.example.wazitoecommerce.ui.theme.screens.pharmacy.PharmacyScreen
import com.example.wazitoecommerce.ui.theme.screens.products.AddProductsScreen
import com.example.wazitoecommerce.ui.theme.screens.products.ViewProductsScreen
import com.example.wazitoecommerce.ui.theme.screens.services.ServicesScreen
import com.example.wazitoecommerce.ui.theme.screens.signup.SignupScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController:NavHostController = rememberNavController(),
    startDestination:String = ROUT_SPLASH
){
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier){
        composable(ROUT_HOME){
            HomeScreen(navController)
        }

        composable(ROUT_LOGIN){
            LoginScreen(navController)
        }

        composable(ROUT_SIGNUP){
            SignupScreen(navController)
        }

        composable(ROUT_DASHBOARD){
            DashboardScreen(navController)
        }

        composable(ROUT_ABOUT){
            AboutScreen(navController)
        }

        composable(ROUT_SPLASH){
            SplashScreen(navController)
        }

        composable(ROUT_SERVICES){
            ServicesScreen(navController)
        }

        composable(ROUT_CLOTHING){
            ClothinScreen(navController)
        }
        composable(ROUT_ELECTRONIC){
            ElectronicScreen(navController)
        }
        composable(ROUT_BEAUTY){
            BeautyScreen(navController)
        }
        composable(ROUT_PHARMACY){
            PharmacyScreen(navController)
        }
        composable(ROUT_GROCERIES){
            GroceriesScreen(navController)
        }
        composable(ROUT_ADDPRODUCT){
            AddProductsScreen(navController = navController)
        }
        composable(ROUT_VIEWRODUCT){
            ViewProductsScreen(navController = navController)
        }
    }
}