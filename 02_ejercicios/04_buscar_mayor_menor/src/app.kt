import java.util.*

/**
 * Created by 7FBD05 on 22/05/2017.
 */

/*Crea un array de 10 posiciones con números aleatorios.

Escribe y pon a prueba estas funciones:

visualizar(): muestra el array en pantalla.
buscarMayor(): muestra el número más alto que haya en el array.
buscarMenor(): muestra el número más pequeño que haya en el array.
existe(n): devuelve true si el valor buscado existe en el array.
Notas:

Las funciones deben recibir el array como parámetro.
Investiga a ver si en Kotlin hay métodos predefinidos que nos ayuden con estas tareas.*/

fun main(args: Array<String>) {
    val r = Random()
    val numeros = arrayOf(r.nextInt(),r.nextInt(),r.nextInt(),r.nextInt(),r.nextInt(),r.nextInt(),r.nextInt(),
            r.nextInt(),r.nextInt(),r.nextInt())

    fun visualizar(){
        for (n in numeros){
            println(n)
        }
    }

    fun buscarMayor(){
        println("Mayor ${numeros.max()}")
    }

    fun buscarMenor(){
        println("Menor ${numeros.min()}")
    }

    fun existe(n:Int):Boolean{
        return numeros.contains(n)
    }

    visualizar()
    buscarMayor()
    buscarMenor()
    if (existe(1916458521)) println("Existe el número") else println("No existe")
}
