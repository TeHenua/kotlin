import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by 7FBD05 on 25/05/2017.
 */
public class VentanaPrincipal {
    private JLabel menúPrincipalLabel;
    private JButton nuevoAlumnoButton;
    private JButton nuevaAsignaturaButton;
    private JButton matricularAlumnoEnAsignaturaButton;
    private JButton listadoDeAlumnosPorButton;
    private JButton listadoDeAsignaturasPorButton;
    private JButton salirButton;
    private JPanel panel;

    public VentanaPrincipal() {
        nuevoAlumnoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        nuevaAsignaturaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        matricularAlumnoEnAsignaturaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        listadoDeAlumnosPorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        listadoDeAsignaturasPorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }


    public JPanel getPanel() {
        return panel;
    }
}
