package org.example.ru.kotiki.lessons.lesson17.homeworks

class Automat() {
    private val phone: String = "+7777777"
    private val owner: String = "Owner"
    private val pinCode: Int = 0
    var color: String = "red"
    val model: String = "model"
    private var isOn: Boolean = false
    private var isLOad: Boolean = false
    private val games: MutableList<String> = mutableListOf()
    private var joystick: Boolean = false
    private var balance: Double = 0.0
    private var isPaid: Boolean = false
    var cost: Double = 1.0

    // Методы

    fun on(): Boolean {
        if (!isOn) {
            isOn = true
            return true
        }
        return false
    }

    fun off(): Boolean {
        if (isOn) {
            if (isLOad) {
                return false
            }
            isOn = false
            return true
        }
        return false
    }

    fun loadOs(): Boolean {
        if (!isOn) {
            return false
        }
        if (!isLOad) {
            isLOad = true
            return true
        }
        return false
    }

    fun unloadOs(): Boolean {
        if (isOn && isLOad) {
            isLOad = false
            return true
        }
        return false
    }

    fun showGames(): List<String> {
        if (games.isEmpty()) {
        } else {
            games.forEach { game -> println("- $game") }
        }
        return games.toList()
    }

    fun startGame(gameName: String): Boolean {
        if (!isOn) {
            return false
        }
        if (!isLOad) {
            return false
        }
        if (!games.contains(gameName)) {
            return false
        }
        if (!isPaid) {
            return false
        }
        //start game
        return true
    }

    fun pay(): Boolean {
        if (!isPaid) {
            isPaid = true
            return true
        }
        return false
    }

    fun getCashWithPin(enteredPin: Int, amount: Double): Boolean {
        if (enteredPin != pinCode) {
            return false
        }
        if (amount > balance) {
            return false
        }

        balance -= amount
        return true
    }

    fun openSafeAndCash(): Boolean {
        if (balance > 0) {
            val am = balance
            balance = 0.0
            return true
        } else {
            return false
        }
    }
}