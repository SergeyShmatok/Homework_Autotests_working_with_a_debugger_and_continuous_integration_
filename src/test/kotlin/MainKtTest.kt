//package ru.netology

import org.junit.Assert.*
import org.junit.Test

class MainKtTest {

    @Test
    fun calculateTransfer_Mastercard() {
        val cardType = "Mastercard"
        val amountPreviousTransfers = 100_000
        val amountTransfer = 299

        val result = calculateTransfer(cardType, amountPreviousTransfers, amountTransfer)
        println(result)
        assertEquals("\nКомиссия составит: " + 21 + " руб.", result)
    }

    @Test
    fun calculateTransfer_Mastercard_no_commission() {
        val cardType = "Mastercard"
        val amountPreviousTransfers = 0
        val amountTransfer = 500

        val result = calculateTransfer(cardType, amountPreviousTransfers, amountTransfer)
        println(result)
        assertEquals("\nКомиссия составит: " + 0 + " руб.", result)
    }

//--------------------------------------------------------

    @Test
    fun calculateTransfer_Maestro() {
        val cardType = "Maestro"
        val amountPreviousTransfers = 100_000
        val amountTransfer = 299

        val result = calculateTransfer(cardType, amountPreviousTransfers, amountTransfer)
        println(result)
        assertEquals("\nКомиссия составит: " + 21 + " руб.", result)
    }

    @Test
    fun calculateTransfer_Maestro_no_commission() {
        val cardType = "Maestro"
        val amountPreviousTransfers = 0
        val amountTransfer = 500

        val result = calculateTransfer(cardType, amountPreviousTransfers, amountTransfer)
        println(result)
        assertEquals("\nКомиссия составит: " + 0 + " руб.", result)
    }

//--------------------------------------------------------

    @Test
    fun calculateTransfer_Visa_more_than_35() {
        val cardType = "Visa"
        val amountPreviousTransfers = 0
        val amountTransfer = 50_000

        val result = calculateTransfer(cardType, amountPreviousTransfers, amountTransfer)
        println(result)
        assertEquals("\nКомиссия составит: " + 375 + " руб.", result)
    }

    @Test
    fun calculateTransfer_Visa_less_than_35() {
        val cardType = "Visa"
        val amountPreviousTransfers = 0
        val amountTransfer = 4_500

        val result = calculateTransfer(cardType, amountPreviousTransfers, amountTransfer)
        println(result)
        assertEquals("\nКомиссия составит: " + 35 + " руб.", result)
    }

//--------------------------------------------------------

    @Test
    fun calculateTransfer_Mir_more_than_35() {
        val cardType = "Mir"
        val amountPreviousTransfers = 0
        val amountTransfer = 50_000

        val result = calculateTransfer(cardType, amountPreviousTransfers, amountTransfer)
        println(result)
        assertEquals("\nКомиссия составит: " + 375 + " руб.", result)
    }

    @Test
    fun calculateTransfer_Mir_less_than_35() {
        val cardType = "Mir"
        val amountPreviousTransfers = 0
        val amountTransfer = 4_500

        val result = calculateTransfer(cardType, amountPreviousTransfers, amountTransfer)
        println(result)
        assertEquals("\nКомиссия составит: " + 35 + " руб.", result)
    }

//--------------------------------------------------------

    @Test
    fun calculateTransfer_VK_Pay() {
        val cardType = "VK Pay"
        val amountPreviousTransfers = 0
        val amountTransfer = 5000

        val result = calculateTransfer(cardType, amountPreviousTransfers, amountTransfer)
        println(result)
        assertEquals("\nКомиссия составит: " + 0 + " руб.", result)
    }


    @Test
    fun calculateTransfer_VK_Pay_LimitExceededForDay() {
        val cardType = "VK Pay"
        val amountPreviousTransfers = 1_000
        val amountTransfer = 200_000

        val result = calculateTransfer(cardType, amountPreviousTransfers, amountTransfer)
        println(result)
        assertEquals("\nОшибка: превышен лимит перевода средств за день/месяц.", result)
    }

    @Test
    fun calculateTransfer_VK_Pay_LimitExceededForMonth() {
        val cardType = "VK Pay"
        val amountPreviousTransfers = 650_000
        val amountTransfer = 1_000

        val result = calculateTransfer(cardType, amountPreviousTransfers, amountTransfer)
        println(result)
        assertEquals("\nОшибка: превышен лимит перевода средств за день/месяц.", result)
    }


//--------------------------------------------------------

    @Test
    fun calculateTransfer_Else() {
        val cardType = ""
        val amountPreviousTransfers = 0
        val amountTransfer = 50_000

        val result = calculateTransfer(cardType, amountPreviousTransfers, amountTransfer)
        println(result)
        assertEquals("\nКомиссия составит: " + 0 + " руб.", result)
    }

//---------------------------------------------------------

    @Test
    fun calculateTransfer_Card_LimitExceededForDay() {
        val cardType = ""
        val amountPreviousTransfers = 1_000
        val amountTransfer = 200_000

        val result = calculateTransfer(cardType, amountPreviousTransfers, amountTransfer)
        println(result)
        assertEquals("\nОшибка: превышен лимит перевода средств за день/месяц.", result)
    }

    @Test
    fun calculateTransfer_Card_LimitExceededForMonth() {
        val cardType = ""
        val amountPreviousTransfers = 650_000
        val amountTransfer = 1_000

        val result = calculateTransfer(cardType, amountPreviousTransfers, amountTransfer)
        println(result)
        assertEquals("\nОшибка: превышен лимит перевода средств за день/месяц.", result)
    }


}

