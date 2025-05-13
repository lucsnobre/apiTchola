package br.senai.sp.jandira.rickandmortyapi.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.rickandmortyapi.R


@Composable
fun HomeScreen(modifier: Modifier = Modifier){
    Box(
        modifier = Modifier.fillMaxSize()
    ){}
    Image(
        painter = painterResource(R.drawable.vete),
        contentDescription = "Ricky and Morty background",
        contentScale = ContentScale.Crop
    )
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xaa000000))
    ){}
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(32.dp)
    ){
        Text(
            text = "Ricky & Morty",
            color = Color.White,
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold
        )
        OutlinedTextField(
            value = "",
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth(),
            trailingIcon = {
                IconButton(onClick = {}) {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "",
                        tint = Color.White
                    )
                }
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun HomeScreenPreview(){
    HomeScreen()
}