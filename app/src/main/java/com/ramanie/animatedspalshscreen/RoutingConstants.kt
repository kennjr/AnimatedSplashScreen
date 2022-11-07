package com.ramanie.animatedspalshscreen

enum class Routes(val route: String){
    SPLASH_SCREEN_TO_HOME_FRAG("splash_to_home"),
    HOME_FRAG_TO_SPLASH_SCREEN("home_to_splash"),

}

enum class Destinations(val destination: String){
    HOME_FRAGMENT("home_fragment"),
    SPLASH_FRAGMENT("splash_fragment")
}