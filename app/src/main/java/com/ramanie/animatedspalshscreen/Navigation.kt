package com.ramanie.animatedspalshscreen

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation(){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Destinations.SPLASH_FRAGMENT.destination, builder = {
        composable(Destinations.SPLASH_FRAGMENT.destination, content = {
            SplashFragment(navController = navController)
        })
        composable(Destinations.HOME_FRAGMENT.destination, content = {
            HomeFragment(navController = navController)
        })
    })
}