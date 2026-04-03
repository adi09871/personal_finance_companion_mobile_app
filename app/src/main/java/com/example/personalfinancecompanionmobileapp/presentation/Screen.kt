package com.example.personalfinancecompanionmobileapp.presentation

sealed class Screen(val route: String) {
    object Dashboard : Screen("dashboard_screen")
    object AddTransaction : Screen("add_transaction_screen")
    object History  : Screen("history_screen") }
