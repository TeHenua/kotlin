import java.sql.Connection
import java.sql.DriverManager
import java.sql.ResultSet
import java.sql.SQLException

/**
 * Created by 7FBD05 on 29/05/2017.
 */
class Alumno(nombre: String, apellidos: String, email: String) {
    val nombre = nombre
    val apellidos = apellidos
    val email = email
    val asignaturas = arrayListOf<Asignatura>()
    fun añadirAsignatura(asignatura: Asignatura){
        asignaturas.add(asignatura)
    }
    fun guardarAlumno() :Boolean{
        var conexion: Connection? = null

        try {
            val controlador = "org.sqlite.JDBC"
            val cadenaconex = "jdbc:sqlite:escuela.sqlite"
            Class.forName(controlador)
            /*val ps = DriverManager.getConnection(cadenaconex)!!.
                    prepareStatement("INSERT INTO ALUMNOS(NOMBRE,APELLIDOS,EMAIL) VALUES(${alumno.nombre}," +
                    "${alumno.apellidos},${alumno.email})")*/
            val ps = DriverManager.getConnection(cadenaconex)!!.prepareStatement("INSERT INTO ALUMNOS(NOMBRE,APELLIDOS,EMAIL) VALUES(?,?,?)")
            ps.setString(1,nombre)
            ps.setString(2,apellidos)
            ps.setString(3,email)
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

    fun listarAlumnos() :Array<Alumno>{
        var conexion: Connection? = null

        try {
            val controlador = "org.sqlite.JDBC"
            val cadenaconex = "jdbc:sqlite:escuela.sqlite"
            Class.forName(controlador)

            val con = DriverManager.getConnection(cadenaconex)
                    val st = con.createStatement()

            val rs : ResultSet = st.executeQuery("SELECT * FROM ALUMNOS")

            while(rs.next()) {

                rs.getInt()

            }


        } catch (ex: ClassNotFoundException) {
            println("No se ha podido cargar el driver JDBC")
        } catch (ex: SQLException) {
            println("Error de conexión $ex")
        }
        return
    }
}