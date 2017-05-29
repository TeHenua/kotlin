import java.sql.Connection
import java.sql.DriverManager
import java.sql.SQLException

/**
 * Created by 7FBD05 on 29/05/2017.
 */
class Asignatura(nombre:String, horas:Int){
    val nombre = nombre
    val horas = horas
    val alumnos = arrayListOf<Alumno>()
    fun añadirAlumno(alumno: Alumno){
        alumnos.add(alumno)
    }

    fun guardarAsignatura() :Boolean{
        var conexion: Connection? = null

        try {
            val controlador = "org.sqlite.JDBC"
            val cadenaconex = "jdbc:sqlite:escuela.sqlite"
            Class.forName(controlador)
            /*val ps = DriverManager.getConnection(cadenaconex)!!.
                    prepareStatement("INSERT INTO ALUMNOS(NOMBRE,APELLIDOS,EMAIL) VALUES(${alumno.nombre}," +
                    "${alumno.apellidos},${alumno.email})")*/
            val ps = DriverManager.getConnection(cadenaconex)!!
                    .prepareStatement("INSERT INTO ASIGNATURAS(NOMBRE,HORASSEMANALES) VALUES(?,?)")
            ps.setString(1,nombre)
            ps.setInt(2,horas)
            ps.execute()

        } catch (ex: ClassNotFoundException) {
            println("No se ha podido cargar el driver JDBC")
            return false
        } catch (ex: SQLException) {
            println("Error de conexión $ex")
            return false
        }
        return true
    }
}