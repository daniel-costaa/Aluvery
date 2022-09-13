package com.example.aluvery.ui.components


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.aluvery.R


@Preview
@Composable
fun ProductItem() {
    Column {
        Box(Modifier
            .width(50.dp)
            .height(50.dp)
            .background(Color.Blue)
        )
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = null
        )
        Text(text = "Lorem ipsum is place")
        Text(text = "R$ 14,99")
    }
}
