package com.example.personalfinancecompanionmobileapp

import android.app.Application
import androidx.room.Room
import com.example.personalfinancecompanionmobileapp.data.FinanceDatabase // Ensure this import is correct

class FinanceApplication : Application() {

    // Yahan ': FinanceDatabase' likhna bahut zaroori hai!
    val database: FinanceDatabase by lazy {
        Room.databaseBuilder(
            this,
            FinanceDatabase::class.java,
            "finance_database"
        ).build()
    }
}