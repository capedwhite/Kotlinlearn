package com.example.a37apractice.learning

fun main(){
    fun add(a:Int,b:Int) :Int {
        return a+b;
    }
    fun subtract(a:Int,b:Int){
        println("the subtraction is ${a-b}");
    }
    fun multiply() {
        println("multiplication if 5 with 5 is ${5 * 5}");
    }
    fun division():Int{
        return 6/7;
    }

   println("the sum of numbers is  ${add(5,6)}");
    subtract(6,7);
    multiply()
    division()
}