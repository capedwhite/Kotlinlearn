package com.example.a37apractice.learning
//mutable list
fun main(){
    val lst = mutableListOf<Any>("hello",1,2,3,true);
    println("first value of list ${lst[0]}");
    lst.add(1,8);
    println(lst);
    lst.remove("true");
    println(lst.size);

    //immutable list
    val list2 = listOf<String>("new","ram","hello");
    for(i in list2.indices){
        println(list2[i]);
    }
}
