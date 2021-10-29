package Pachet;

import javax.swing.*;
import java.util.ArrayList;
//Lista de persoane cred ca o putem face clasa de tip singleton
public class ListaPersoane {
    //Lista cu obiecte tip presoana
    private final ArrayList<Persoana> persoane = new ArrayList<>();
    //Aici sunt adaugate toate datele ce sunt scrise in lista.
    public static DefaultListModel modelPersoane = new DefaultListModel();
    //Lista de persoane este o claasa de tip Singleton.
    private static  ListaPersoane instance;

    //Getter pentru arraylist.
    public ArrayList<Persoana> getListaPersoane(){
        return this.persoane;
    }

    //Afisam toate persoanele existente in lista.
    public void afiseazaPersoane(JList j){
        modelPersoane.clear();
        j.setModel(modelPersoane);
        for (int i = 0; i < this.getListaPersoane().size(); i++) {
            modelPersoane.addElement(this.getListaPersoane().get(i).getNume() + "  " + this.getListaPersoane().get(i).getPrenume());
        }
    }

    //Metoda getInstance pentru clasa ListaPersoane, de tip Singleton.
    public static ListaPersoane getInstance(JList j){
        if(null == instance){
            instance = new ListaPersoane(j);
        }
        return instance;
    }

    //Adaugam persoana noua in lista
    public void updateLista(Persoana p){
        this.getListaPersoane().add(p);
    }

    //Constructor Lista de persoane.
    public ListaPersoane(JList j){
        //Adaugam cateva persoane random
        for (int i = 0; i < 8; i++) {
            this.getListaPersoane().add(new Persoana());
        }
        //Afisam
        this.afiseazaPersoane(j);
    }
}
