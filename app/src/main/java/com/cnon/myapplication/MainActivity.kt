package com.cnon.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        var array1 = arrayOf(65,43,6,1,89,6,7,9,54,90)

        var array2 = Array<Int>(20){0}

        System.arraycopy(array1,3,array2,3,7)
        // birinci dizi, kopyalamaya nereden başlayacağı, ikinci dizi, ikinci diziye nereden başlanacağı, kaç eleman kopyalanacağı


        for(i in 0..(array2.size-1))
        {
            println("Array2 index: $i value: ${array2[i]}")

        }


        Arrays.sort(array2)


        for(i in 0..(array2.size-1))
        {
            println("Array2 index: $i value: ${array2[i]}")

        }


        println("Array1 Array2 ye eşit mi?:  ${Arrays.equals(array1,array2) }")

       // var dizi = arrayOf("ahmet","mehmet","hacer","fatma","jale")
        var dizi = arrayListOf("ahmet","mehmet","hacer","fatma","jale")

        for (i in dizi) println(i)

        dizi.add("Murtaza")
        dizi.add("Selim")
        dizi.add(2,"Ortega")


        for (i in dizi) println(i)

        dizi.remove("fatma") // fatma yı siler
        for (i in dizi) println(i)

        println("Dizinin boyutu: "+dizi.size)

        println("Dizinin ikinci elemanı: "+dizi.get(2))



}
}