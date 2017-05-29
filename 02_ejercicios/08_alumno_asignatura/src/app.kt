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




}

