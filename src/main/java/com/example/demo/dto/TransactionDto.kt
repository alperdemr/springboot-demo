package com.example.demo.dto

import com.example.demo.model.Account
import com.example.demo.model.TransactionType
import jakarta.persistence.CascadeType
import jakarta.persistence.FetchType
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import java.math.BigDecimal
import java.time.LocalDateTime

data class TransactionDto(
        val id:String?,

        val transactionType: TransactionType? = TransactionType.INITIAL,
        val amount: BigDecimal?,
        val transactionDate: LocalDateTime?,


)
