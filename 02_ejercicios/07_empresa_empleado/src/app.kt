import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader
import javax.swing.JOptionPane

/**
 * Created by 7FBD05 on 25/05/2017.
 */

data class Empresa(
        val nombre: String,
        val añoFundacion: String
){
    val empleados = ArrayList<Empleado>()
    fun añadirEmpleado(empleado: Empleado){
        empleados.add(empleado)
    }
}

data class Empleado(
        val nombre: String,
        val apellidos: String,
        val fechaNacimiento: String,
        val fechaContrato: String
)


fun main(args: Array<String>) {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val empresas = hashMapOf<String,Empresa>()

    do {
        println("Elige una opción:\n" +
                "1.- Crear nueva empresa\n" +
                "2.- Añadir empleado a empresa ya existente\n" +
                "3.- Listado de empresas\n" +
                "4.- Listado detallado de empresas y empleados\n" +
                "5.- Salir")
        val opcion = br.readLine().toInt()
        when(opcion){
            1 ->{
                println("Introduce un nombre")
                val nombre = br.readLine()
                println("Introduce año fundación")
                val año = br.readLine()
                val empresa = Empresa(nombre,año)
                empresas.put(nombre,empresa)
            }
            2 ->{
                println("Elige una empresa")
                for (e in empresas){
                    println("${e.key}")
                }
                val empresaSelect = br.readLine()
                println("Introduce el nombre")
                val nombre = br.readLine()
                println("Introduce los apellidos")
                val apellidos = br.readLine()
                println("Introduce la fecha de nacimiento")
                val fechaNac = br.readLine()
                println("Introduce la fecha de contrato")
                val fechaCon = br.readLine()
                val e = Empleado(nombre,apellidos,fechaNac,fechaCon)
                empresas.get(empresaSelect)!!.añadirEmpleado(e)
            }
            3 ->for (e in empresas){
                    println(e)
            }
            4 ->for (e in empresas){
                println(e)
                for (emple in empresas.get(e.key)!!.empleados ){
                    println(emple)
                }
            }
            else -> println("Agur")
        }
        println("¿Quieres continuar?")
        val contStr = br.readLine()
        val continuar: Boolean = contStr=="s"
    }while (continuar)
}