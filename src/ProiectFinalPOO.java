import Pachet.*;

import javax.swing.*;
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
    private JLabel labelNume;
    private JLabel labelNrMatricol;
    private JLabel labelVarsta;
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
                        fp.append("\n\nUtilizator online: ");
                        fp.append(Admins.adminOnline);
                        fp.append(lista.getListaPersoane().get(p).toString());
                        fp.append("Intrebarea este: ");
                        fp.append(IPersoana.rani_posibile[lista.getListaPersoane().get(p).getProblema()][0][0]);
                        fp.close();
                    }
                    catch
                    (Exception t){System.out.println("Eroare");}

                }
            }
        });
        verifica.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int prob = list1.getSelectedIndex();
                //Avem lista, vedem ce element este selectat, Scriem mesajul - in JLabel-ul problema
                if(prob != -1){
                    lista.getListaPersoane().get(prob).scrieMesaj(problema, btnvar1, btnvar2, btnvar3,  labelNume, labelNrMatricol, labelVarsta);
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
