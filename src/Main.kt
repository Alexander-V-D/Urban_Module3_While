import java.lang.Math.pow

fun main() {

}

//Функция к задаче 1
fun printFactorial() {
    println("Введите число: ")
    val input = readln().toInt()
    var factorial = 1
    var count = 1
    do {
        factorial *= count
        count++
    }
    while (count <= input)
    println("Ответ к задаче 1: $factorial")
}

//Функция к задаче 2
fun printCandyPrices(price: Double) {
    var count = 1
    println("Ответ к задаче 2:")
    do {
        println("Цена $count кг конфет: ${count * price}")
        count++
    } while (count <= 10)
}

//Функция к задаче 3
fun printNumbersBetween(a: Int, b: Int) {
    var count = a
    println("Ответ к задаче 3:")
    do {
        println(count)
        count++
    } while (count <= b)
    println("Количество выведенных чисел: ${b - a + 1}")
}

//Функция к задаче 4
fun printNumberByDigit(number: Int) {
    var count = number.toString().length
    println("Ответ к задаче 4:")
    do {
        println(number.toString()[count - 1])
        count--
    } while (count > 0)
}

//Функция к задаче 5
fun printNumbersBetween1And20() {
    var number = 1
    println("Ответ к задаче 5:")
    do {
        if (number % 2 == 0 && number % 4 != 0) println(number)
        if (number % 4 == 0) println(number * 2)
        number++
    } while (number < 20)
}

//Функция к задаче 6
fun printFinalDeposit() {
    var deposit = 350.0
    var count = 1
    do {
        deposit *= 1.07
        count++
    } while (count <= 9)
    println("Ответ к задаче 6: $deposit")
}