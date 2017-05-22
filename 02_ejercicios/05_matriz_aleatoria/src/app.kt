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
    var matriz :Array<Array<Int>>

    for (i in 1..c){
        for (j in 1..f){
            /*val even: IntArray = intArrayOf(2, 4, 6)
            val odd: IntArray = intArrayOf(1, 3, 5)
            val lala: Array<IntArray> = arrayOf(even, odd)*/
        }
    }
}