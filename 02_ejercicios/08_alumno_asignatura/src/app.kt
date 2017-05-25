import java.sql.Connection
import java.sql.DriverManager
import java.sql.SQLException
import javax.swing.JFrame

/**
 * Created by 7FBD05 on 25/05/2017.
 */
fun main(args: Array<String>) {


    val frame = JFrame("VentanaPrincipal")
    frame.contentPane = VentanaPrincipal().panel
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.pack()
    frame.isVisible = true

    var conexion: Connection? = null

    try {
        val controlador = "org.sqlite.JDBC"
        val cadenaconex = "jdbc:sqlite:escuela.sqlite"

        Class.forName(controlador)
        conexion = DriverManager.getConnection(cadenaconex)
    } catch (ex: ClassNotFoundException) {
        println("No se ha podido cargar el driver JDBC")
    } catch (ex: SQLException) {
        println("Error de conexión")
    }


}