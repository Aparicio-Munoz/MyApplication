package com.example.myapplication

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.example.myapplication.ui.screens.DetailScreen
import com.example.myapplication.ui.screens.HomeScreen
import com.example.myapplication.ui.screens.ProfileScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = HomeRoute
    ) {
        composable<HomeRoute> {
            HomeScreen(
                onNavigateToProfile = {
                    navController.navigate(ProfileRoute)
                },
                onNavigateToDetail = { itemId, title ->
                    navController.navigate(
                        DetailRoute(
                            itemId = itemId,
                            title = title
                        )
                    )
                }
            )
        }

        composable<ProfileRoute> {
            ProfileScreen(
                onBack = {
                    navController.popBackStack()
                }
            )
        }

        composable<DetailRoute> { backStackEntry ->
            val args: DetailRoute = backStackEntry.toRoute()

            DetailScreen(
                itemId = args.itemId,
                title = args.title,
                onBack = {
                    navController.popBackStack()
                }
            )
        }
    }
}
