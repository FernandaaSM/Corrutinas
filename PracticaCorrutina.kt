package com.example.corrutinas

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class PracticaCorrutina {

   
    fun corrutinas() {
        var count = 0
        //println("Cantidad de hilos a ejectutar: ")
        //val valor = readln().toInt()

        //hilo 1
        count = 0
        runBlocking {
            repeat(20) {
                launch {
                    delay(1000L)
                    println("$count")
                    count++
                }
            }
            println("Hilo 1")
        }
        println("Ya termino hilo 1")

        //hilo 2
        //count = 0
        runBlocking {
            repeat(20) {
                launch {
                    delay(1000L)
                    println("$count")
                    count++
                }
            }
            println("Hilo 2")
        }
        println("Ya termino hilo 2")

        //hilo 3
        //count = 0
        runBlocking {
            repeat(20) {
                launch {
                    delay(1000L)
                    println("$count")
                    count++
                }
            }
            println("Hilo 3")
        }
        println("Ya termino hilo 3")

        //hilo 4
        //count = 0
        runBlocking {
            repeat(20) {
                launch {
                    delay(1000L)
                    println("$count")
                    count++
                }
            }
            println("Hilo 4")
        }
        println("Ya termino hilo 4")

        //hilo 5
        //count = 0
        runBlocking {
            repeat(20) {
                launch {
                    delay(1000L)
                    println("$count")
                    count++
                }
            }
            println("Hilo 5")
        }
        println("Ya termino hilo 5")

        //hilo 6
        //count = 0
        runBlocking {
            repeat(20) {
                launch {
                    delay(1000L)
                    println("$count")
                    count++
                }
            }
            println("Hilo 6")
        }
        println("Ya termino hilo 6")

        //hilo 7
        //count = 0
        runBlocking {
            repeat(20) {
                launch {
                    delay(1000L)
                    println("$count")
                    count++
                }
            }
            println("Hilo 7")
        }
        println("Ya termino hilo 7")

        //hilo 8
        //count = 0
        runBlocking {
            repeat(20) {
                launch {
                    delay(1000L)
                    println("$count")
                    count++
                }
            }
            println("Hilo 8")
        }
        println("Ya termino hilo 8")

        //hilo 9
        //count = 0
        runBlocking {
            repeat(20) {
                launch {
                    delay(1000L)
                    println("$count")
                    count++
                }
            }
            println("Hilo 9")
        }
        println("Ya termino hilo 9")

        //hilo 10
        //count = 0
        runBlocking {
            repeat(20) {
                launch {
                    delay(1000L)
                    println("$count")
                    count++
                }
            }
            println("Hilo 10")
        }
        println("Ya termino hilo 10")



    }
}

fun main() {
    val PracticaCorrutina = PracticaCorrutina()
    PracticaCorrutina.corrutinas()
}