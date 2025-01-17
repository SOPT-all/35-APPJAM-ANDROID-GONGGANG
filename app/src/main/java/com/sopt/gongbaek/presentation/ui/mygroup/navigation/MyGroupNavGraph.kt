package com.sopt.gongbaek.presentation.ui.mygroup.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.sopt.gongbaek.presentation.model.NavigationRoute
import com.sopt.gongbaek.presentation.ui.groupdetail.navigation.navigateGroupDetailNavGraph
import com.sopt.gongbaek.presentation.ui.grouproom.navigation.navigateGroupRoomNavGraph
import com.sopt.gongbaek.presentation.ui.mygroup.screen.MyGroupRoute

fun NavGraphBuilder.myGroupNavGraph(
    navController: NavHostController
) {
    navigation(
        startDestination = NavigationRoute.MyGroupNavGraphRoute.MY_GROUP,
        route = NavigationRoute.MainBottomNavBarTabRoute.MY_GROUP_TAB
    ) {
        composable(
            route = NavigationRoute.MyGroupNavGraphRoute.MY_GROUP
        ) {
            MyGroupRoute(
                navigateGroupDetail = { navController.navigateGroupDetailNavGraph() },
                navigateGroupRoom = { navController.navigateGroupRoomNavGraph() }
            )
        }
    }
}
