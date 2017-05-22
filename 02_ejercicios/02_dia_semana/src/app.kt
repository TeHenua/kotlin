import javax.swing.JOptionPane

/**
 * Created by 7FBD05 on 22/05/2017.
 */

/*Pedir al usuario un número comprendido entre el 1 y el 7 e imprimir el día de la semana al que hace referencia.

Por ejemplo, si introducen el 1, se visualizará Lunes.

Utilizad la clase JOptionPane para pedir datos y mostrar los resultados.*/

fun main(args: Array<String>) {

    val t:Int = JOptionPane.showInputDialog("Introduce un número entre 1 y 7").toInt()
    when(t){
        1 -> println("Lunes")
        2 -> println("Martes")
        3 -> println("Miercoles")
        4 -> println("Jueves")
        5 -> println("Viernes")
        6 -> println("Sabado")
        7 -> println("Domingo")
        else -> println("Error")
    }
}