import Pachet.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;

public class ProiectFinalPOO {
    private JList list1;
    private JLabel problema;
    protected JPanel rootPanel;
    private JButton ajuta;
    private JButton verifica;
    private JButton btnAdauga;
    private JRadioButton btnvar1;
    private JRadioButton btnvar2;
    private JRadioButton btnvar3;
    private final ListaPersoane lista = ListaPersoane.getInstance(list1);
    private final File fila = new File("out.txt");

    public ProiectFinalPOO() {
        ajuta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int p = list1.getSelectedIndex();
                if (p!=-1){
                    FileWriter fp;
                    try{
                        fp = new FileWriter(fila,true);
                        fp.append("---------------------------------");
                        fp.append("\nNume: "+lista.getListaPersoane().get(p).getNume());
                        fp.append("\nPrenume: "+lista.getListaPersoane().get(p).getPrenume());
                        fp.append("\nNumar Matricol: "+lista.getListaPersoane().get(p).getNumarMatricol());
                        fp.append("\nVarsta: "+lista.getListaPersoane().get(p).getVarsta());
                        fp.append("\n---------------------------------\n");
                        fp.close();
                    }
                    catch
                    (Exception t){System.out.println("Eroare");}

                }
            }
        });
    }

    public static void main(String[] args) {
        //Desenam tot.
        JFrame frame = new JFrame();
        frame.setContentPane(new ProiectFinalPOO().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
