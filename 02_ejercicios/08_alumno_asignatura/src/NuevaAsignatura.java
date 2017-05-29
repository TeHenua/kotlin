import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by 7FBD05 on 29/05/2017.
 */
public class NuevaAsignatura {
    private JPanel panel;
    private JLabel menúPrincipalLabel;
    private JTextField nombreTextField;
    private JTextField horasSemanalesTextField;
    private JButton guardarButton;

    public NuevaAsignatura() {
        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = nombreTextField.getText();
                int horas = Integer.parseInt(horasSemanalesTextField.getText());
                Asignatura a = new Asignatura(nombre,horas);
                boolean ok = a.guardarAsignatura();
                if (ok)
                    JOptionPane.showMessageDialog(panel,"Asignatura guardada correctamente");
            }
        });
    }

    public JPanel getPanel() {
        return panel;
    }
}
