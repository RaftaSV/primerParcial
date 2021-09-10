package com.desarrollo.unab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       // colores()
       // comida()
        bucleFor()
    }

    private fun colores() {
        var color1 = "rojo"
        var color2 = "verde"
        var color3 = "amarillo"
        var color4 = "azul"
        var color5 = "negro"

        var colorComparar = "rosado"

        if (color1 == colorComparar) {

            println("El color introducido es rojo")

        } else if (color2 == colorComparar) {

            println("El color introducido es verde")

        } else if (color3 == colorComparar) {

            println("El color introducido es amarillo")

        } else if (color4 == colorComparar) {

            println("El color introducido es azul")

        } else if (color5 == colorComparar) {

            println("El color introducido es negro")

        } else {
            println("el color ingresado $colorComparar no se encuenta en la lista")
            println("lista: $color1 $color2 $color3 $color4 $color5")
        }


    }

    private fun comida() {

        val tipoDeComida = "enchiladas"

        when (tipoDeComida) {
            "pupusas","enchiladas" -> {
                println("Las $tipoDeComida es un platillo tipico de El Salvador")
            }
            "tacos" -> {
                println("los $tipoDeComida es un platillo tipico de Mexico")
            }
            "baleadas" -> {
                println("Las $tipoDeComida es un platillo tipico de Honduras")
            }
            "pizzas" -> {
                println("Las $tipoDeComida un platillo tipico de Italia")
            }
            "gallo pinto" -> {
            println("$tipoDeComida un platillo tipico de Costa Rica")
            }
            else -> {
                println("Se desconoce de donde es originario el paltillo $tipoDeComida ")
            }
        }

    }
    private fun bucleFor(){

        println("bucle que aumenta de uno en uno hasta 10")
        for (x in 1..10){
            println("Mostrando $x")

        }
        println("bucle que aumenta de dos en dos hasta 20")
        for (x in 2..20 step 2){
            println("Mostrando $x")

        }

        println("bucle que disminuye de uno en uno de 10  hasta 0")
        for (x in 10 downTo 0){
            println("Mostrando $x")

        }

        println("bucle que disminuye de 3 en 3 de 3  hasta 3")
        for (x in 30 downTo -1 step 3){
            println("Mostrando $x")

        }
    }
}