package com.example.aluvery.ui.components


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aluvery.R
import com.example.aluvery.data.model.Product
import com.example.aluvery.ui.theme.Purple500
import com.example.aluvery.ui.theme.Teal200
import com.example.aluvery.utils.ext.toBrazilianCurrency
import java.math.BigDecimal

@Composable
fun ProductItem(product: Product) {
    Surface(elevation = 4.dp, shape = RoundedCornerShape(15.dp)) {
        Column(Modifier
            .width(200.dp)
            .heightIn(min = 250.dp, max = 300.dp)
            .background(Color.White)
        ) {
            val imageSize = 100.dp
            Box(Modifier
                .fillMaxWidth()
                .height(100.dp)
                .background(brush = Brush.horizontalGradient(colors = listOf(Purple500, Teal200)))
            ) {
                Image(
                    modifier = Modifier
                        .size(imageSize)
                        .offset(y = imageSize.div(2))
                        .clip(CircleShape)
                        .align(Alignment.Center),
                    painter = painterResource(id = product.image),
                    contentDescription = null,
                    contentScale = ContentScale.Crop
                )
            }
            Spacer(Modifier.height(imageSize.div(2)))
            Column(Modifier.padding(16.dp)) {
                Text(
                    text = product.name,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )
                Text(
                    text = product.price.toBrazilianCurrency(),
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
        }
    }
}

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

@Preview
@Composable
private fun ProductItemPreview() {
    ProductItem(
        Product(
            name = LoremIpsum(50).values.first(),
            price = BigDecimal(14.99),
            image = R.drawable.ic_launcher_background
        )
    )
}

@Preview(showBackground = true, widthDp = 1000)
@Composable
fun ProductsSectionPreview() {
    ProductsSection()
}
