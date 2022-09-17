package com.example.aluvery.ui.components

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aluvery.R
import com.example.aluvery.data.model.Product
import java.math.BigDecimal

@Composable
fun ProductsSection() {
    Column(Modifier.padding(start = 16.dp, end = 16.dp, top = 16.dp)) {
        Text(text = "Produtos",
            modifier = Modifier.padding(bottom = 16.dp),
            fontSize = 20.sp,
            fontWeight = FontWeight.Normal
        )
        Row(modifier = Modifier
            .fillMaxWidth()
            .horizontalScroll(rememberScrollState()),
            horizontalArrangement = Arrangement.spacedBy(16.dp)) {
            ProductItem(
                Product(
                    name = "Pizza",
                    price = BigDecimal(14.99),
                    image = R.drawable.pizza
                )
            )
            ProductItem(
                Product(
                    name = "Burger",
                    price = BigDecimal(20.99),
                    image = R.drawable.burger
                )
            )
            ProductItem(
                Product(
                    name = "Fries",
                    price = BigDecimal(4.99),
                    image = R.drawable.fries
                )
            )
        }
    }
}

@Preview(showBackground = true, widthDp = 1000)
@Composable
fun ProductsSectionPreview() {
    ProductsSection()
}
