package com.sopt.gongbaek.presentation.ui.groupregister.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.sopt.gongbaek.ui.theme.GONGBAEKTheme

@Composable
fun SelectDayOfWeekRoute() {
}

@Composable
fun SelectDayOfWeekScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "모임 등록 > 요일 선택 화면"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ShowSelectDayOfWeekScreen() {
    GONGBAEKTheme {
        SelectDayOfWeekScreen()
    }
}