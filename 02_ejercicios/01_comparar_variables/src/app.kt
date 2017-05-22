import java.security.SecureRandom
import java.util.*

/**
 * Created by 7FBD05 on 22/05/2017.
 */

/*Escribe un programa que cree al azar tres variables enteras y las compare entre sí, sacando en pantalla cual de ellas
es la mayor, la siguiente más grande y la menor.
Hay que tener en cuenta si son iguales, nunca se sabe.*/

fun main(args: Array<String>) {
    val r = Random()

    val datos = listOf(r.nextInt(),r.nextInt(),r.nextInt())
    var mayor : Int = Int.MAX_VALUE
    var menor : Int = Int.MIN_VALUE
    var medio =0

    for (n in datos){
        if (n>=mayor){
            mayor=n
        }else if (n<=menor){
            menor = n
        }else{
            medio = n
        }
    }

    println("Ordenados de mayor a menor: $mayor > $medio > $menor ")
}


