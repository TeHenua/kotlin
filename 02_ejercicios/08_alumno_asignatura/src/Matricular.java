import javax.swing.*;
import javax.swing.event.ListDataListener;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Created by 7FBD05 on 25/05/2017.
 */
public class Matricular {
    private JPanel panel;
    private JLabel menúPrincipalLabel;
    private JComboBox alumnoComboBox;
    private JComboBox asignaturaComboBox;
    private JButton guardarButton;

    public Matricular(VentanaPrincipal ventanaPrincipal) {
        this.ventanaPrincipal = ventanaPrincipal;
    }

    private VentanaPrincipal ventanaPrincipal;

    public JPanel getPanel() {
        return panel;
    }

    public JComboBox getAlumnoComboBox() {
        return alumnoComboBox;
    }

    public void setAlumnoComboBox(JComboBox alumnoComboBox) {
        this.alumnoComboBox = alumnoComboBox;
    }

    public JComboBox getAsignaturaComboBox() {
        return asignaturaComboBox;
    }

    public void setAsignaturaComboBox(JComboBox asignaturaComboBox) {
        this.asignaturaComboBox = asignaturaComboBox;
    }

    public void llenarAlumnoComboBox(ArrayList<Alumno> alumnos) {
        for (Alumno a :alumnos){
          alumnoComboBox.addItem(a.getNombre()+" "+a.getApellidos());
        }
    }

    public void llenarAsignaturaComboBox(ArrayList<Asignatura> asignaturas) {
        for (Asignatura a : asignaturas){
            asignaturaComboBox.addItem(a.getNombre());
        }
    }

}
