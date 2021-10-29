package Pachet;
import java.util.Random;

public interface IPersoana {
    Random R = new Random();
    //aici scriem intrebarile si raspunsurile. Raspunsurile o sa le amestecam cand le adaugam la butoane, cumva.
    String[][] rani_posibile =
            {
                    {
                        "Intrebare exemplusaaaaaaaaaaaaaaaaa",
                        "Raspuns corectaaaaaaaaaaaaaaaa",
                        "Raspuns gresit",
                        "Raspuns gresit"

                    },
                    {
                        "Intrebare exemplu 2",
                        "Raspuns corect",
                        "Raspuns gresit",
                        "Raspuns gresit"

                    }
            };

    String getNume();
    String getPrenume();
    String getNumarMatricol();
    int getVarsta();
    String toString();
    void scrieMesaj();
    void adaugaOptiuniAjutor();
}
