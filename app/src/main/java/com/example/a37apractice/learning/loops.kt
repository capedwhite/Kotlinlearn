package com.example.a37apractice.learning

fun main() {
    println("Please enter 3 numbers! : ")
    var number1: Int = readLine()!!.toInt()
    var number2: Int = readLine()!!.toInt()
    var number3: Int = readLine()!!.toInt()
    var LargestNumber: Int
    if (number1 >= number2) {
        if (number1 >= number3) {
            LargestNumber = number1
        } else {
            LargestNumber = number3
        }
    } else {
        if (number2 >= number3) {
            LargestNumber = number2
        } else {
            LargestNumber = number3
        }
    }
    println(LargestNumber);
    print("Please enter a day number of week :")
    var dayNumber:Int = readLine()!!.toInt();
    var day:String;
    when(dayNumber)
    {
        1 -> day = "Sunday"
        2 -> day = "Monday"
        3 -> day = "Tuesday"
        4 -> day = "Wednesday"
        5 -> day = "Thursday"
        6 -> day = "Friday"
        7 -> day = "Saturday"
        else -> day = "Invalid day choice"
    }
    println(day)
}