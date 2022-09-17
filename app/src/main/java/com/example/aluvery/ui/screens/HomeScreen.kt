package com.example.aluvery.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.aluvery.ui.components.ProductsSection
import com.example.aluvery.ui.components.sampleProducts
import com.example.aluvery.ui.theme.AluveryTheme

@Composable
fun HomeScreen() {
    Column(Modifier.verticalScroll(rememberScrollState())) {
        ProductsSection("Salgados", sampleProducts)
        ProductsSection("Doces", sampleProducts)
        ProductsSection("Comidas", sampleProducts)
        ProductsSection("Teste", sampleProducts)
    }
}

@Preview(showSystemUi = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}
