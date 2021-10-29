import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    private JPanel loginPanel;
    private JTextField parolaUtilizator;
    private JTextField numeUtilizator;
    private JButton access;
    private JButton cancel;
    private static final JFrame frame = new JFrame();
    private final Admins log = Admins.getInstance();

    public Login() {
        //Verificam date pentru acces.
        access.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                log.checkForAccess(numeUtilizator.getText(), parolaUtilizator.getText(), frame);
            }
        });
        //Stergem textele din input-uri.
        cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                log.deleteTexts(numeUtilizator, parolaUtilizator);
            }
        });
    }

    public static void main(String[] args) {
        //Desenam tot.
        frame.setContentPane(new Login().loginPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        //Afisare fereastra in mijlcul ecranului.
        frame.setLocationRelativeTo(null);
    }
}
