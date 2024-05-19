//package ru.netology

fun main() {

    val result = calculateTransfer("Mastercard", 100_000, 500)
    println(result)
}

fun calculateTransfer(cardType: String = "Mir", amountPreviousTransfers: Int = 0, amountTransfer: Int): String {

    // лимиты на суммы перевода за сутки/месяц по картам
    val transferLimitDayCard = 150_000
    val transferLimitMonthCard = 600_000

    // лимиты на суммы перевода за сутки/месяц для VK Pay
    val transferLimitDayVk = 15_000
    val transferLimitMonthVk = 40_000


    val solution = when (cardType) {   // расчёт комиссии

        "Mastercard", "Maestro" -> if (amountPreviousTransfers + amountTransfer < 75_000 && amountTransfer > 300) 0.0 else amountTransfer * 0.006 + 20

        "Visa", "Mir" -> if (amountTransfer * 0.0075 > 35) amountTransfer * 0.0075 else 35

        "VK Pay" -> 0.0

        else -> 0.0

    }

    return when (cardType) { // "возврат" в зависимости от типа карты/счёта

        "VK Pay" -> if (amountTransfer > transferLimitDayVk ||
            amountTransfer + amountPreviousTransfers > transferLimitMonthVk
        ) ("\nОшибка: превышен лимит перевода средств за день/месяц.")
        else ("\nКомиссия составит: ${solution.toInt()} руб.")

        else -> if (amountTransfer > transferLimitDayCard ||
            amountTransfer + amountPreviousTransfers > transferLimitMonthCard
        ) ("\nОшибка: превышен лимит перевода средств за день/месяц.")
        else ("\nКомиссия составит: ${solution.toInt()} руб.")

    }


}
