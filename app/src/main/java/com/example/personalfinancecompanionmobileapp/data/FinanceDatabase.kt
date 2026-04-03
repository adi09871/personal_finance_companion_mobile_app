package com.example.personalfinancecompanionmobileapp.data


import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [TransactionEntity::class], version = 1, exportSchema = false)
abstract class FinanceDatabase : RoomDatabase() {

    // Ensure karein ki yahan brackets () lage hain
    abstract fun transactionDao(): TransactionDao
}