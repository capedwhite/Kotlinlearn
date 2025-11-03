package com.example.a37apractice.learning

fun main() {
    var age1 = ArrayList<Int>();
    age1.add(1);
    age1.add(1,3);
    age1.add(5);
    var age2 = arrayListOf<Int>(2,9,0);
    var names = arrayListOf<String>("samyam","ram","smarika");
    names.add("nischal");
    names.removeAt(0);
    var mixArraList = arrayListOf<Any>(4,"hello",4,6.8);
    println(names);
    println(age1);
    println(mixArraList);


}