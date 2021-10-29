import Pachet.*;

import javax.swing.*;
import java.awt.*;


public class ProiectFinalPOO {
    private JButton raspuns3;
    private JButton raspuns2;
    private JList list1;
    private JLabel problema;
    protected JPanel rootPanel;
    private JButton ajuta;
    private JButton verifica;
    private JRadioButton raspuns1RadioButton;

    private final ListaPersoane lista = ListaPersoane.getInstance(list1);

    public static void main(String[] args) {
        //Desenam tot.
        JFrame frame = new JFrame();
        frame.setContentPane(new ProiectFinalPOO().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
