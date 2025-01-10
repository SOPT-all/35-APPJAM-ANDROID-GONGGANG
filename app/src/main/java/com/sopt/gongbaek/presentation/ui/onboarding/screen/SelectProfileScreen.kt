package com.sopt.gongbaek.presentation.ui.onboarding.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sopt.gongbaek.presentation.util.extension.clickableWithoutRipple
import com.sopt.gongbaek.presentation.util.extension.roundedBackgroundWithBorder
import com.sopt.gongbaek.ui.theme.GONGBAEKTheme
import com.sopt.gongbaek.ui.theme.GongBaekTheme

@Composable
fun SelectProfileRoute(
    navigateNickname: () -> Unit,
) {
    SelectProfileScreen(
        navigateNickname = navigateNickname
    )
}

@Composable
fun SelectProfileScreen(
    navigateNickname: () -> Unit,
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "프로필 선택 화면"
            )
            Spacer(modifier = Modifier.height(10.dp))
            Box(
                modifier = Modifier
                    .roundedBackgroundWithBorder(
                        cornerRadius = 8.dp,
                        backgroundColor = GongBaekTheme.colors.subOrange,
                        borderWidth = 1.dp,
                        borderColor = GongBaekTheme.colors.mainOrange
                    )
                    .clickableWithoutRipple(
                        onClick = navigateNickname
                    )
            ) {
                Text(
                    text = "채우기로 이동",
                    modifier = Modifier.padding(10.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ShowSelectProfileScreen() {
    GONGBAEKTheme {
        SelectProfileScreen(
            navigateNickname = {}
        )
    }
}
