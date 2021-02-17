package com.example.newkotlin

fun main(){
    //If statement with strings and other data types
    var name = "Thom"

    if (name == "Thom"){
        println("Welcome back")
    }else{
        println("Where are you?")
    }

    var isRainy = true
    if (isRainy)
        println("It's raining a lot")

    //If statement
    var heightPerson1 = 170
    var heightPerson2 = 190

    if (heightPerson1 > heightPerson2) {
        println("Use raw force")
    }else if(heightPerson1 == heightPerson2){
        println("Use your power technique 911")
    }
    else{
        println("Use technique")
    }

    val age = 20

    if (age >= 30)
        println("You can own a house")
    if(age >= 21){
        println("Now you may drink in Kenya")
    }else if(age >= 18){
        println("You may vote now")
    }else if(age >= 16){
        println("You may drive now")
    }else{
        println("You are too young")
    }


    //Assignment operators(+=, -=, *=, /=, %=)
    var myNum = 5
    myNum += 3
    myNum *= 3
    println("myNum is $myNum")

    //Increment and Decrement operators(++, --)
    myNum ++
   // myNum += 3
    println("myNum is $myNum")
    println("myNum is ${myNum++}")
    println("myNum is ${++myNum}")
    println("myNum is ${--myNum}")


    //Comparison operators (==, !=, <, <=, >=)
    val isEqual = 5==5
    println("isEqual is $isEqual" )

    val  isNotEqual = 5!=5
    //String interpolation
    println("isNotEqual is $isNotEqual")
    println("is5Greater3 ${5 > 3}")
    println("is-5Less3 ${-5 < 3}")
    println("is5LowerEqual3 ${5 <= 3}")
    println("is5GreaterEqual3 ${5 >= 3}")


    //Arithmetic operators (+,-,*,/,%)
    var result = 5 + 3
   // val  a = 5
    val  a = 5.0
    val b = 3
    // result =a/b
   // result *= 2
    //result = 15%2
    var resultDouble : Double = a / b
    print(resultDouble)


     //DataTypes bool, char and string
    //Booleans - type Boolean is used to represent logical values. It can have 2 possible values true or false
    var isSunny: Boolean = true
    isSunny = false

    //Characters
    val letterChar = 'A'
    val digitalChar = '$'

    //Strings
    val  myStr = "Hi Thomas"
    var firstCharInStr = myStr[0]
    var lastCharInStr = myStr[myStr.length - 1]

   // print("First char " + firstCharInStr + ".")
    print(" Last char " + lastCharInStr + ".")

    //DataTypes of Numbers
    //Type string
    val myName = "Jane"
    //type int - 32bits memory
    //Type inference finds out the type from context
    var myAge = 30

    //Integer TYPES: Byte(8 bit), Short (16 bit), Int(32 bit), Long(64 bit)
    val myByte: Byte = 13
    val myShort: Short = 125
    val myInt: Int = 123123123
    val myLong: Long = 34_123_987_985_456_246

    //Floating Point number Types: Float (32 bit), Double(64 bit)
    val myFloat: Float = 13.43F
    val myDouble: Double = 3.14159283464755883939

    print(" Hello " + myName)


//    //Mutable and immutable variables
//   // var myName = "Jane"
//    val myName = "Jane"
//    print("Hello " + myName)
}