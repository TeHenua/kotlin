import java.sql.Connection
import java.sql.DriverManager
import java.sql.SQLException

/**
 * Created by 7FBD05 on 25/05/2017.
 */
fun main(args: Array<String>) {
    var conexion: Connection? = null

    try {
        val controlador = "org.sqlite.JDBC"
        val cadenaconex = "jdbc:sqlite:alumnos.sqlite"

        Class.forName(controlador)
        conexion = DriverManager.getConnection(cadenaconex)
    } catch (ex: ClassNotFoundException) {
        println("No se ha podido cargar el driver JDBC")
    } catch (ex: SQLException) {
        println("Error de conexión")
    }

    val alumnos = ArrayList<Alumno>()

    try {
        val st = conexion?.createStatement()
        val rs = st?.executeQuery("SELECT * FROM ALUMNOS")

        while (rs!!.next()){
            val a = Alumno(
                    rs.getString("NOMBRE"),
                    rs.getString("APELLIDOS"),
                    rs.getString("DNI"),
                    rs.getString("TELEFONO")
            )
            alumnos.add(a)
        }

    } catch (ex: SQLException) {
        println("Error al recuperar los datos")
    }

    for (a in alumnos){
        println(a)
    }

    conexion?.close()
}

data class Alumno(
        val nombre:String,
        val apellidos:String,
        val dni:String,
        val telefono:String
)