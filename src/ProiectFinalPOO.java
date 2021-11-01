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
    private JRadioButton btninv;
    private JPanel panel1;
    private JTextField txtnume;
    private JTextField txtnrmatricol;
    private JTextField txtvarsta;
    private JButton btncancel;
    private JButton btnadaugare;
    private JLabel lblprenume;
    private JTextField txtprenume;
    private JLabel introdnp;
    private JLabel introdnrmat;
    private JLabel introdv;
    private final ListaPersoane lista = ListaPersoane.getInstance(list1);
    private final File fila = new File("out.txt");
    private final JRadioButton[] jButtons = {btnvar1, btnvar2, btnvar3};

    //Event buton AJUTA
    public ProiectFinalPOO() {
        ajuta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //count in caz ca nu avem nici un radio selectat
                int count = 0;
                for(JRadioButton btn : jButtons){
                    if(btn.isSelected()){
                        //Stergem Radiobutton-urile cand apasam pe buton
                        for(JRadioButton btn2 : jButtons){
                            btn2.setVisible(false);
                        }
                        int p = list1.getSelectedIndex();
                        //Daca avem element selectat in lista, scriem datele in log.
                        if (p!=-1){
                            FileWriter fp;
                            try{
                                fp = new FileWriter(fila,true);
                                fp.append("\n\n\nUtilizator online: ");
                                fp.append(Admins.adminOnline);
                                fp.append(lista.getListaPersoane().get(p).toString());
                                fp.append("Problema este: \n");
                                fp.append(IPersoana.rani_posibile[lista.getListaPersoane().get(p).getProblema()][0][0]);
                                fp.append("\nRaspunsul Utilizatorului: \n");
                                //Verificam care buton este selectat, pentru a adauga textul in log.
                                String selected = "";
                                for (JRadioButton buton : jButtons){
                                    if(buton.isSelected()){
                                        selected = IPersoana.rani_posibile[lista.getListaPersoane().get(p).getProblema()][1][0];
                                        if(IPersoana.rani_posibile[lista.getListaPersoane().get(p).getProblema()][1][1].equals("1")){
                                            selected += "  ( CORRECT) ";
                                        }
                                        else{
                                            selected += "  ( GRESIT )";
                                        }
                                    }
                                }
                                //Afisam mesajul si inchidem log-ul.
                                fp.append(selected);
                                fp.close();
                            }
                            catch
                            (Exception t){System.out.println("Eroare");}
                            //Stergem persoana care a fost ajutata, rescriem textele din window.
                            lista.getListaPersoane().remove(p);
                            lista.afiseazaPersoane(list1);
                            labelNume.setText("   Nume: ");
                            labelNrMatricol.setText("   Numar matricol: ");
                            labelVarsta.setText("   Varsta: ");
                            problema.setText("");
                            btnvar1.setText("");
                            btnvar2.setText("");
                            btnvar3.setText("");
                            btninv.setSelected(true);
                        }
                        break;
                    }
                    else{
                        count++;
                    }
                }
                //Daca nu avem radio selectat, afisam un warning option panel.
                if(count >= 3){
                    JOptionPane.showConfirmDialog(
                            null,
                            "Nu ati selectat nici un raspuns!",
                            "Warning",
                            JOptionPane.DEFAULT_OPTION,
                            JOptionPane.WARNING_MESSAGE
                    );
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
                if(!list1.isSelectionEmpty()){
                    for(JRadioButton btn : jButtons){
                        btn.setVisible(true);
                    }
                }
            }
        });
        //Facem visibil panel-ul pentru adaugare persoana.
        btnAdauga.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            introdnp.setVisible(true);
            introdnrmat.setVisible(true);
            introdv.setVisible(true);
            txtnume.setVisible(true);
            txtnrmatricol.setVisible(true);
            txtvarsta.setVisible(true);
            btncancel.setVisible(true);
            btnadaugare.setVisible(true);
            lblprenume.setVisible(true);
            txtprenume.setVisible(true);
            panel1.setVisible(true);

            }
        });
        //Facem invisibil panel-ul pentru adaugare persoana.
        btncancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                introdnp.setVisible(false);
                introdnrmat.setVisible(false);
                introdv.setVisible(false);
                txtnume.setVisible(false);
                txtnrmatricol.setVisible(false);
                txtvarsta.setVisible(false);
                btncancel.setVisible(false);
                btnadaugare.setVisible(false);
                lblprenume.setVisible(false);
                txtprenume.setVisible(false);
                panel1.setVisible(false);
            }
        });
        //Adaugare persoana noua in lista de persoane.
        btnadaugare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    lista.updateLista(new Persoana(
                            txtnume.getText(),
                            txtprenume.getText(),
                            txtnrmatricol.getText(),
                            Integer.parseInt(txtvarsta.getText())
                    ));
                    txtnume.setText("");
                    txtprenume.setText("");
                    txtvarsta.setText("");
                    txtnrmatricol.setText("");
                }
                //In cazul in care nu sunt corecte datele, afisam un warning modal box.
                catch(Exception ex){
                    JOptionPane.showConfirmDialog(
                            null,
                            "Datele introduse sunt incorecte sau insuficiente.",
                            "Warning",
                            JOptionPane.DEFAULT_OPTION,
                            JOptionPane.WARNING_MESSAGE
                    );
                }
                lista.afiseazaPersoane(list1);
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
