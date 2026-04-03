package com.example.personalfinancecompanionmobileapp.data


import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "transactions_table")
data class TransactionEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val title: String,
    val amount: Double,
    val type: String, // "INCOME" ya "EXPENSE"
    val category: String,
    val dateMillis: Long,
    val note: String = ""
)