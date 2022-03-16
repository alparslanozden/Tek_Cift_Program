package com.alparslan.kotlin_notes

import java.util.*

fun main(){

    val girdi= Scanner(System.`in`)

    while(true){

        println("Sayı giriniz: ")
        val sayi= girdi.nextInt()

        val sonuc= sayi % 2

        if(sonuc == 0){
            println("$sayi ÇİFT sayıdır")
        }
        if(sonuc == 1){
            println("$sayi TEK sayıdır")
        }


        println("Çıkmak için (1) - Devam etmek için diğer sayılar")

        val cikis= girdi.nextInt()

        if(cikis==1){
            println("Çıkış yapıldı")
            break
        }

    }



}