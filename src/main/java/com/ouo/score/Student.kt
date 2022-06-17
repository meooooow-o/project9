package com.ouo.score

class Student(var name:String, var english:Int, var math:Int) {
    /*init {
        println("Testing")
    }*/
    fun print(){
        println("$name\t$english\t$math\tAverage:${getAverage()}")
    }
    fun getAverage() = (english + math)/2
}

fun main() {
    val stu = Student("Jack", 55, 87)
    stu.print()
}