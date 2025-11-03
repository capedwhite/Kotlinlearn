package com.example.a37apractice.learning

fun main() {
    //immutable map
    val studentMarks = mapOf(
        "ram" to 45,
        "shyam" to 45,
        "hari" to 45,
        "gita" to 45,
    )

    println("Enter student name:");
    val input1: String = readln().lowercase();
    println(studentMarks[input1]);

//mutuable map
    val studentMark = mutableMapOf(
        "ram" to 45,
        "shyam" to 45,
        "hari" to 45,
        "gita" to 45,
    )
    studentMark["ram"]=60;
    studentMark.put("sarika",29);
    println("Enter student name:");
    val input: String = readln().lowercase();
    println(studentMark[input]);
}

