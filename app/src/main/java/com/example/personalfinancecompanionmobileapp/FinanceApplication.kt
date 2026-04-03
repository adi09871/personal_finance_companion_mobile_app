package com.example.personalfinancecompanionmobileapp

import android.app.Application
import androidx.room.Room

class FinanceApplication : Application(){
    val database : FinanceDatabase by lazy {

        Room.databaseBuilder(
            this,
            FinanceDatabase::class.java,
            "finance_database"
        ).build()

    }


}