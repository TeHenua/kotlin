import javax.swing.JOptionPane

/**
 * Created by 7FBD05 on 22/05/2017.
 */
/*Escribe un programa en el que pidamos al usuario un número y nos muestre los números primos entre 1 y ese número (incluido).

Para conseguirlo, tendrá que llamar a una función esPrimo() que nos diga si, en efecto, lo es.*/

fun main(args: Array<String>) {
    fun esPrimo(n: Int): Boolean {
        var con =0
        for (i in n downTo 1){
            if (n%i==0){
                con++
            }
        }
        return !(con>2)
    }

    val t = JOptionPane.showInputDialog("Introduce un número").toInt()
    println("Números primos entre 1 y $t")
    for (i in 1..t){
        if (esPrimo(i)) println(i)
    }
}