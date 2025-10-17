package com.turingalan.pokemon.data

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.turingalan.pokemon.ui.Route
import com.turingalan.pokemon.ui.list.PokemonListDetailScreen

@Composable
fun NavegationWrapper(){
    val navController = rememberNavController(),
    val startDestination = Route.List
    Scaffold(

    ){ innerPadding ->
        val contentModifier = Modifier.padding(innerPadding)
        NavHost(navController = navController, startDestination = startDestination) {
            @composable<Route.List> {
                PokemonListDetailScreen(modifier = contentModifier)
            }
        }
    }
}