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

        VentanaPrincipal vp = this;

        nuevoAlumnoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("NuevoAlumno");
                frame.setContentPane(new NuevoAlumno().getPanel());
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);

            }
        });
        nuevaAsignaturaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("NuevaAsignatura");
                frame.setContentPane(new NuevaAsignatura().getPanel());
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
        matricularAlumnoEnAsignaturaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("Matricular");
                frame.setContentPane(new Matricular(vp).getPanel());
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
        listadoDeAlumnosPorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("ListadoAlumnos");
                frame.setContentPane(new ListadoAlumnos().getPanel());
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
        listadoDeAsignaturasPorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("ListadoAsignaturas");
                frame.setContentPane(new ListadoAsignaturas().getPanel());
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
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
