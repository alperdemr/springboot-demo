package com.example.demo.dto

import com.example.demo.model.Customer
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import org.hibernate.annotations.GenericGenerator
import java.math.BigDecimal
import java.time.LocalDateTime

data class AccountDto(
        val id:String?,
        val balance:BigDecimal?,
        val createdAt:LocalDateTime?,
        val customer:AccountCustomerDto,
        val transactions:Set<TransactionDto>?


)
