package com.example.recipeapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter

@Composable
fun CategoryDetailScreen(category: Category) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "${category.idCategory}. ${category.strCategory}",
            textAlign = TextAlign.Center
        )
        Image(
            painter = rememberAsyncImagePainter(category.strCategoryThumb),
            contentDescription = null,
            modifier = Modifier
                .aspectRatio(1f)
                .padding(bottom = 10.dp)  // Add padding between image and text
                .fillMaxSize(fraction = 0.5f)  // Adjust the fraction to reduce image size
        )

        Text(
            text = category.strCategoryDescription ?: "No description available",
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .padding(10.dp),
            style = TextStyle(fontSize = 16.sp) // Ensure a readable font size
        )

    }
}