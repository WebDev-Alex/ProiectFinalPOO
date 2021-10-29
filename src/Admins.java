import javax.swing.*;

public class Admins {
    //Clasa de tip Singleton.
    private static Admins instance;
    //Lista de admini.
    private final String[][] admini = {
            {"Admin", "1234"},
            {"Alex", "9393"},
            {"Raul", "7777"},
            {"Emanuel", "6262"}
    };

    //Getter pentru lista de admini.
    public String[][] getAdmins(){
        return this.admini;
    }

    //Stergem textele din input-uri.
    public void deleteTexts(JTextField t, JTextField p){
        t.setText("");
        p.setText("");
    }

    //Metoda getInstance pentru clasa admini, de tip Singleton.
    public static Admins getInstance(){
        if(null == instance){
            instance = new Admins();
        }
        return instance;
    }

    //Verificam daca utilizatorul are acces la fereastra.
    public void checkForAccess(String name, String pass, JFrame fr){
        //Verificam daca exista admin cu numele si parola introduse.
        for (int i = 0; i < this.getAdmins().length; i++) {
            //Daca exista admin, afisam fereastra principala.
            if(this.getAdmins()[i][0].equals(name) && this.getAdmins()[i][1].equals(pass)){
                fr.setContentPane(new ProiectFinalPOO().rootPanel);
                fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                fr.pack();
                fr.setVisible(true);
                break;
            }
            //Daca numele si parola nu se potrivesc cu nici un element din lista de admini, aruncam un warning.
            if(i == this.getAdmins().length-1){
                JOptionPane.showConfirmDialog(
                        null,
                        "Numele de Utilizator sau Parola sunt incorecte.",
                        "Warning",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.WARNING_MESSAGE
                );
            }
        }
    }
}
