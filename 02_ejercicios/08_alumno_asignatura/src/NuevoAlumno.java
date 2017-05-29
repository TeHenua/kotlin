import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by 7FBD05 on 25/05/2017.
 */
public class NuevoAlumno {
    private JPanel panel;
    private JLabel menúPrincipalLabel;
    private JTextField nombreTextField;
    private JTextField apellidosTextField;
    private JTextField emailTextField;
    private JButton guardarButton;

    public NuevoAlumno() {
        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = nombreTextField.getText();
                String apellidos = apellidosTextField.getText();
                String email = emailTextField.getText();
                Alumno a = new Alumno(nombre,apellidos,email);
                boolean ok = a.guardarAlumno();
                if (ok)
                    JOptionPane.showMessageDialog(panel,"Guardado correctamente");
            }
        });
    }

    public JPanel getPanel() {
        return panel;
    }
}
