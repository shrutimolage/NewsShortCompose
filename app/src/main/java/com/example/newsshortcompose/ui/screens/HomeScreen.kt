package com.example.newsshortcompose.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.newsshortcompose.ui.viewmodel.NewsViewModel

const val TAG="HomeScreen"


@Composable
fun HomeScreen(newsViewModel: NewsViewModel= hiltViewModel()){

    Surface(modifier = Modifier.fillMaxSize()) {


    }


}