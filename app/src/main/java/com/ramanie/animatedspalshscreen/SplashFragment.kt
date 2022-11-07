package com.ramanie.animatedspalshscreen

import android.view.animation.OvershootInterpolator
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import kotlinx.coroutines.delay

@Composable
fun SplashFragment(navController: NavController){
    // since we wanna scale our img for the animation we're gon use the line below
    val scale = remember{
        // the Animatable() is a class that allows us to interpolate animation values
        Animatable(0f)
    }
    LaunchedEffect(key1 = true, block = {
        scale.animateTo(targetValue = 0.3f, animationSpec = (tween(durationMillis = 500, easing = {
            // the it rep.s the fraction of the animation that's already been played
            OvershootInterpolator(2f).getInterpolation(it)
        })))
        delay(3000L)
        navController.navigate(Destinations.HOME_FRAGMENT.destination)
    })

    Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize()) {
        Image(painter = painterResource(id = R.drawable.ic_baseline_local_police_24),
            contentDescription = stringResource(id = R.string.splash_screen_logo_content_description),
            // we're applying the scale to the image
            modifier = Modifier.scale(scale.value))
    }


    // inversiones financieras - financial investments
    // flujo de efectivo - cashflow
    // investments - inversiones
    // cashstream

    //laesencia deinvertir        the essence of investing
    //esencia de inversión        investment essence
    //laesencia dela inversión    the essence of investing
    // esenciales de inversión    investment essentials
    // investiré preciso   investing is a must
    // invertires esencial
    // investir é essencial
    // invertir es crítico

}