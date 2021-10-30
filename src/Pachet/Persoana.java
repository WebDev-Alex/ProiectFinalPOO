package Pachet;

import javax.swing.*;

public class Persoana implements IPersoana{
    public static String user_name;
    private String nume;
    private String prenume;
    private String numarMatricol;
    private int varsta;
    int problema = IPersoana.R.nextInt(IPersoana.rani_posibile.length);

    public Persoana(){
        this.setNume("Persoana");
        this.setPrenume("Necunoscuta");
        this.setNumarMatricol("000000");
        this.setVarsta(21);
    }

    public Persoana(String n, String p){
        this.setNume(n);
        this.setPrenume(p);
        this.setNumarMatricol("000000");
        this.setVarsta(21);
    }

    public Persoana(String numeP, String prenumeP, String nrMatricolP, int varstaP){
        this.setNume(numeP);
        this.setPrenume(prenumeP);
        this.setNumarMatricol(nrMatricolP);
        this.setVarsta(varstaP);
    }

    //Getters pentru variabilele private.
    public String getNume(){
        return this.nume;
    }

    public String getPrenume(){
        return this.prenume;
    }

    public String getNumarMatricol(){
        return this.numarMatricol;
    }

    public int getVarsta(){
        return this.varsta;
    }

    //Setters pentru variabilele private
    public void setNume(String n){
        this.nume = n;
    }

    public void setPrenume(String pn){
        this.prenume = pn;
    }

    public void setNumarMatricol(String m){
        this.numarMatricol = m;
    }

    public void setVarsta(int v){
        this.varsta = v;
    }

    public void setUser(String name){
        user_name = name;
    }

    //Scriem mesajul de ajutor intr-un label.
    public void scrieMesaj(JLabel mesaj){
        //Aici alegem o rana la intamplare, in functie de variabila problema si adaugam optiuni la butoane.;
        mesaj.setText(IPersoana.rani_posibile[problema][0][0]);
        adaugaOptiuniAjutor();
    }

    //Adaugam butoanele(textele in 3 butoane existente)
    public void adaugaOptiuniAjutor(){

    }

    //Pentru mai tarziu, cand stocam datele.
    public String toString(){
        StringBuffer str = new StringBuffer();
        str.append("\n---------------\n");
        str.append("Detalii Persoana:\n");
        str.append("Nume: ");
        str.append(this.getNume());
        str.append("  ");
        str.append(this.getPrenume());
        str.append("\nVarsta: ");
        str.append(this.getVarsta());
        str.append("\n---------------\n");
        return str.toString();
    }
}
