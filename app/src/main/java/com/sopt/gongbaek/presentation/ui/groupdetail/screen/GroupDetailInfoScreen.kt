package com.sopt.gongbaek.presentation.ui.groupdetail.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sopt.gongbaek.R
import com.sopt.gongbaek.domain.model.GroupHost
import com.sopt.gongbaek.domain.type.GenderType
import com.sopt.gongbaek.presentation.util.extension.roundedBackgroundWithBorder
import com.sopt.gongbaek.presentation.util.formatEnterYearToString
import com.sopt.gongbaek.ui.theme.GONGBAEKTheme
import com.sopt.gongbaek.ui.theme.GongBaekTheme

@Composable
fun GroupDetailInfoScreen(
    groupIntroduction: String,
    groupMaxPeopleCount: Int,
    groupCurrentPeopleCount: Int
) {
    val groupHost = GroupHost(
        profileImg = 1,
        nickname = "로이임탄",
        gender = "MAN",
        major = "글로벌문화산/MICE 전공",
        enterYear = 2019,
        grade = 4,
        mbti = "ENFJ",
        introduction = "안녕하세요. 저는 19학번이고 컴퓨터예술학부 재학중입니다. 공강시간이 많아서 공강시간에 함께 카공하고 밥먹을 친구를 만나고 싶습니다. 사교성 매우 좋아서 금방 친해저요! 우리 공강친구해요~" +
            "안녕하세요. 저는 19학번이고 컴퓨터예술학부 재학중입니다. 공강시간이 많아서 공강시간에 함께 카공하고 밥먹을 친구를 만나고 싶습니다. 사교성 매우 좋아서 금방 친해저요! 우리 공강친구해요~" +
            "안녕하세요. 저는 19학번이고 컴퓨터예술학부 재학중입니다. 공강시간이 많아서 공강시간에 함께 카공하고 밥먹을 친구를 만나고 싶습니다. 사교성 매우 좋아서 금방 친해저요! 우리 공강친구해요~" +
            "안녕하세요. 저는 19학번이고 컴퓨터예술학부 재학중입니다. 공강시간이 많아서 공강시간에 함께 카공하고 밥먹을 친구를 만나고 싶습니다. 사교성 매우 좋아서 금방 친해저요! 우리 공강친구해요~" +
            "안녕하세요. 저는 19학번이고 컴퓨터예술학부 재학중입니다. 공강시간이 많아서 공강시간에 함께 카공하고 밥먹을 친구를 만나고 싶습니다. 사교성 매우 좋아서 금방 친해저요! 우리 공강친구해요~"
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = GongBaekTheme.colors.white)
    ) {
        LazyColumn(
            modifier = Modifier
                .weight(1f)
                .padding(top = 20.dp)
                .padding(horizontal = 16.dp)
        ) {
            item {
                Text(
                    text = stringResource(R.string.group_detail_group_introduction_title),
                    color = GongBaekTheme.colors.gray10,
                    style = GongBaekTheme.typography.body1.b16
                )
                Spacer(modifier = Modifier.height(10.dp))
                Box(
                    modifier = Modifier.roundedBackgroundWithBorder(
                        cornerRadius = 4.dp,
                        backgroundColor = GongBaekTheme.colors.gray01
                    )
                ) {
                    Text(
                        text = groupIntroduction,
                        modifier = Modifier.padding(16.dp),
                        color = GongBaekTheme.colors.gray08,
                        style = GongBaekTheme.typography.body2.r14
                    )
                }
                Spacer(modifier = Modifier.height(30.dp))
            }

            item {
                Column {
                    Text(
                        text = stringResource(R.string.group_detail_host_profile_title),
                        color = GongBaekTheme.colors.gray10,
                        style = GongBaekTheme.typography.body1.b16
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .roundedBackgroundWithBorder(
                                cornerRadius = 4.dp,
                                backgroundColor = GongBaekTheme.colors.gray01
                            )
                            .padding(10.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(R.drawable.ic_launcher_background),
                            contentDescription = null,
                            modifier = Modifier
                                .width((LocalConfiguration.current.screenWidthDp * 0.22).dp)
                                .aspectRatio(1f / 1f)
                                .clip(shape = RoundedCornerShape(2.dp))
                                .roundedBackgroundWithBorder(
                                    cornerRadius = 2.dp,
                                    backgroundColor = Color.Transparent,
                                    borderColor = GongBaekTheme.colors.gray02,
                                    borderWidth = 1.dp
                                )
                        )
                        Spacer(modifier = Modifier.width(10.dp))
                        Column {
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(4.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(
                                    text = groupHost.nickname,
                                    color = GongBaekTheme.colors.gray09,
                                    style = GongBaekTheme.typography.body1.b16
                                )
                                when (GenderType.toGenderType(groupHost.gender)) {
                                    GenderType.MAN -> Image(
                                        imageVector = ImageVector.vectorResource(R.drawable.ic_male_20),
                                        contentDescription = null
                                    )

                                    GenderType.WOMAN -> Image(
                                        imageVector = ImageVector.vectorResource(R.drawable.ic_female_20),
                                        contentDescription = null
                                    )
                                }
                            }
                            Spacer(modifier = Modifier.height(6.dp))
                            Box(
                                contentAlignment = Alignment.Center,
                                modifier = Modifier.roundedBackgroundWithBorder(
                                    cornerRadius = 4.dp,
                                    backgroundColor = GongBaekTheme.colors.gray09
                                )
                            ) {
                                Text(
                                    text = groupHost.major,
                                    modifier = Modifier.padding(horizontal = 6.dp, vertical = 1.dp),
                                    color = GongBaekTheme.colors.gray01,
                                    style = GongBaekTheme.typography.caption2.m12
                                )
                            }
                            Spacer(modifier = Modifier.height(6.dp))
                            Row(
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Box(
                                    contentAlignment = Alignment.Center,
                                    modifier = Modifier.roundedBackgroundWithBorder(
                                        cornerRadius = 4.dp,
                                        backgroundColor = GongBaekTheme.colors.white
                                    )
                                ) {
                                    Text(
                                        text = stringResource(R.string.group_detail_enter_year_grade_title),
                                        modifier = Modifier.padding(horizontal = 6.dp, vertical = 1.dp),
                                        color = GongBaekTheme.colors.mainOrange,
                                        style = GongBaekTheme.typography.caption2.m12
                                    )
                                }
                                Spacer(modifier = Modifier.width(6.dp))
                                Text(
                                    text = stringResource(R.string.group_detail_enter_year_grade, formatEnterYearToString(groupHost.enterYear), groupHost.grade),
                                    color = GongBaekTheme.colors.gray08,
                                    style = GongBaekTheme.typography.caption2.m12
                                )

                                Spacer(modifier = Modifier.width(12.dp))

                                Box(
                                    contentAlignment = Alignment.Center,
                                    modifier = Modifier.roundedBackgroundWithBorder(
                                        cornerRadius = 4.dp,
                                        backgroundColor = GongBaekTheme.colors.white
                                    )
                                ) {
                                    Text(
                                        text = stringResource(R.string.group_detail_mbti_title),
                                        modifier = Modifier.padding(horizontal = 6.dp, vertical = 1.dp),
                                        color = GongBaekTheme.colors.mainOrange,
                                        style = GongBaekTheme.typography.caption2.m12
                                    )
                                }
                                Spacer(modifier = Modifier.width(6.dp))
                                Text(
                                    text = groupHost.mbti,
                                    color = GongBaekTheme.colors.gray08,
                                    style = GongBaekTheme.typography.caption2.m12
                                )
                            }
                        }
                    }
                }
                Spacer(modifier = Modifier.height(10.dp))
            }

            item {
                Box(
                    modifier = Modifier.roundedBackgroundWithBorder(
                        cornerRadius = 4.dp,
                        backgroundColor = GongBaekTheme.colors.gray01
                    )
                ) {
                    Text(
                        text = groupHost.introduction,
                        modifier = Modifier.padding(16.dp),
                        color = GongBaekTheme.colors.gray08,
                        style = GongBaekTheme.typography.body2.r14
                    )
                }
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 12.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .roundedBackgroundWithBorder(
                        cornerRadius = 6.dp,
                        backgroundColor = GongBaekTheme.colors.gray09
                    ),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = stringResource(R.string.group_detail_people_counter, groupCurrentPeopleCount, groupMaxPeopleCount),
                    modifier = Modifier.padding(vertical = 16.dp),
                    color = GongBaekTheme.colors.gray01,
                    style = GongBaekTheme.typography.title2.sb18
                )
            }
            Box(
                modifier = Modifier
                    .weight(2.3f)
                    .roundedBackgroundWithBorder(
                        cornerRadius = 6.dp,
                        backgroundColor = GongBaekTheme.colors.mainOrange
                    ),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = stringResource(R.string.group_detail_button_apply),
                    modifier = Modifier.padding(vertical = 16.dp),
                    color = GongBaekTheme.colors.white,
                    style = GongBaekTheme.typography.title2.sb18
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GroupDetailInfoScreenPreview() {
    GONGBAEKTheme {
        GroupDetailInfoScreen(
            groupIntroduction = "복학하고 친구가 없어서 화요일마다 간단하게 점심 먹을 친구들 구해봐요~ 친구 없는 저를 살려주세요 OTL",
            groupCurrentPeopleCount = 2,
            groupMaxPeopleCount = 4
        )
    }
}
