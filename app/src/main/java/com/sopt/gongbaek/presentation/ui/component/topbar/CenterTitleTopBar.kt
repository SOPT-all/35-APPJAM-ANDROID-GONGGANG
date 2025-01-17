package com.sopt.gongbaek.presentation.ui.component.topbar

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import com.sopt.gongbaek.R
import com.sopt.gongbaek.presentation.util.extension.clickableWithoutRipple
import com.sopt.gongbaek.ui.theme.GongBaekTheme

@Composable
fun CenterTitleTopBar(
    @StringRes centerTitleResId: Int,
    modifier: Modifier = Modifier,
    @DrawableRes leadingIconResId: Int? = null,
    @DrawableRes trailingIconResId: Int? = null,
    onLeadingIconClick: () -> Unit = {},
    onTrailingIconClick: () -> Unit = {},
    textColor: androidx.compose.ui.graphics.Color = GongBaekTheme.colors.gray08,
    textStyle: androidx.compose.ui.text.TextStyle = GongBaekTheme.typography.title2.m18
) {
    Box(
        modifier = modifier
            .aspectRatio(7.5f)
            .fillMaxWidth()
    ) {
        Text(
            text = stringResource(centerTitleResId),
            color = textColor,
            style = textStyle,
            modifier = Modifier.align(Alignment.Center)
        )

        if (leadingIconResId != null) {
            Icon(
                imageVector = ImageVector.vectorResource(leadingIconResId),
                contentDescription = null,
                tint = GongBaekTheme.colors.gray04,
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .clickableWithoutRipple {
                        onLeadingIconClick()
                    }
            )
        }

        if (trailingIconResId != null) {
            Icon(
                imageVector = ImageVector.vectorResource(trailingIconResId),
                contentDescription = null,
                tint = GongBaekTheme.colors.gray04,
                modifier = Modifier
                    .align(Alignment.CenterEnd)
                    .clickableWithoutRipple {
                        onTrailingIconClick()
                    }
            )
        }
    }
}

@Preview
@Composable
private fun PreviewCenterTitleTopBar() {
    Column(
        modifier = Modifier.background(color = GongBaekTheme.colors.white)
    ) {
        CenterTitleTopBar(
            centerTitleResId = R.string.topbar_search,
            trailingIconResId = R.drawable.ic_x_48,
            textColor = GongBaekTheme.colors.gray10,
            textStyle = GongBaekTheme.typography.body1.sb16
        )
        CenterTitleTopBar(centerTitleResId = R.string.topbar_group)
        CenterTitleTopBar(centerTitleResId = R.string.topbar_my_group)
    }
}
