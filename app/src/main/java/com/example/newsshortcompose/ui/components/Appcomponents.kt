package com.example.newsshortcompose.ui.components

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.newsshortcompose.ui.navigation.Routes
import com.example.newsshortcompose.ui.screens.HomeScreen

@Composable
fun AppNavigationGraph(){
val navController= rememberNavController()
    NavHost(navController = navController, startDestination = Routes.HOME_SCREEN){
        composable(Routes.HOME_SCREEN){
            HomeScreen()


        }
    }
}


