import java.util.*
import javax.swing.JOptionPane

/**
 * Created by 7FBD05 on 22/05/2017.
 */
/*Pide al usuario dos valores (filas y columnas). Úsalos para generar una matriz de números enteros aleatorios de tamaño FxC.

Cuando esté creada:

Muéstra la matriz en pantalla.
Crea un array con el tamaño suficiente para almacenar todos los valores de la matriz y copia en él los datos.
Muestra el array.
Muestra el array eliminando los valores repetidos.*/

fun main(args: Array<String>) {
    val f = JOptionPane.showInputDialog("Introduce las filas").toInt()
    val c = JOptionPane.showInputDialog("Introduce las columnas").toInt()
    var matriz :Array<IntArray> =  Array(f) { IntArray(c) }
    val r = Random()

    for (i in 0..f-1){
        for (j in 0..c-1){
            matriz[i][j]= r.nextInt()
        }
    }

    println("MATRIZ")
    for (i in matriz){
        for (j in matriz[i.size]){  //mal
            print("$j  ")
        }
        println()
    }

    println("MATRIZ SIN REPETICIONES")
    val setMatriz = hashSetOf(matriz)

    for (item in setMatriz){
        println(item)
    }
}