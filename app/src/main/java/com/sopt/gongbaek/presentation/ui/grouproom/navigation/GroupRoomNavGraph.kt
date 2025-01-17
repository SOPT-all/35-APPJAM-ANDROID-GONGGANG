package com.sopt.gongbaek.presentation.ui.grouproom.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.sopt.gongbaek.presentation.model.NavigationRoute
import com.sopt.gongbaek.presentation.ui.grouproom.screen.GroupRoomRoute

fun NavGraphBuilder.groupRoomNavGraph(
    navController: NavHostController
) {
    navigation(
        startDestination = NavigationRoute.GroupRoomNavGraphRoute.GROUP_ROOM,
        route = NavigationRoute.GroupRoomNavGraphRoute.GROUP_ROOM_NAV_GRAPH
    ) {
        composable(
            route = NavigationRoute.GroupRoomNavGraphRoute.GROUP_ROOM
        ) {
            GroupRoomRoute()
        }
    }
}
