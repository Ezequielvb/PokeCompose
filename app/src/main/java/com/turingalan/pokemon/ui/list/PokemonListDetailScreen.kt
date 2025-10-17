package com.turingalan.pokemon.ui.list

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.turingalan.pokemon.data.model.Pokemon

@Composable
fun PokemonListDetailScreen(
modifier: Modifier = Modifier,
viewModel: PokemonListViewModel = hiltViewModel()
){

    LazyColumn {
        items(
            items = pokemon
        ){
            Column {
                Image(
                    painterResource(pokemo),
                    contentDescription = name,
                    contentScale = ContentScale.Crop,

                    )
            }
        }
    }
}