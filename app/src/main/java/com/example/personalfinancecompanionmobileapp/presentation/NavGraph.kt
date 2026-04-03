package com.example.personalfinancecompanionmobileapp.presentation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun FinanceNavGraph (navController: NavHostController) {

    NavHost(
        navController = navController,
        startDestination = Screen.Dashboard.route
    ){
        composable(route = Screen.Dashboard.route) {
            DashboardScreen(navController = navController)
        }
        composable(route = Screen.AddTransaction.route) {
            AddTransactionScreen(navController = navController)
        }
        composable(route = Screen.History.route) {
         TransactionHistoryScreen(navController = navController)
        }

    }
}