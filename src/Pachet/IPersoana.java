package Pachet;
import javax.swing.*;
import java.util.Random;

public interface IPersoana {
    Random R = new Random();
    //aici scriem intrebarile si raspunsurile. Raspunsurile o sa le amestecam cand le adaugam la butoane, cumva.
    String[][][] rani_posibile =
            {
                    {
                            {"Persoana a suferit o fractura la brat. Imobilizarea bratului se face:", "0"},
                            {"a) in dreptul osului fracturat;", "0"},
                            {"b) cuprinzand osul fracturat si articulatia;", "1"},
                            {"c) cuprinzand osl fracturat si cele doua articulatii.", "0"}

                    } ,
                    {
                            {"Persoana a suferit un accident, in urma caruia a rezultat o fractura de coloana. In acest caz se va folosi:", "0"},
                            {"a) orice mijloc de transport;", "0"},
                            {"b) autoturisme;", "0"},
                            {"c) mijloace de transport cu platforma.", "1"}

                    },
                    {
                            {"Persoana a pierdut mult sange in urma unui accident. Aceasta trebuie asezata:", "0"},
                            {"a) cu fata in sus;", "0"},
                            {"b) cu picioarele mai sus decat nivelul corpului;", "1"},
                            {"c) cu fata in jos", "0"}

                    },
                    {
                            {"Persoana a suferit multiple arsuri pe corp si membre. Cum procedati in acest caz?", "0"},
                            {"a) trebuie sa fie spalate, bandajate si apoi transportate la cea mai apropiata unitate sanitara;", "0"},
                            {"b) dupa stingerea flacarilor acestea trebuie dezbracate rapid de haine;", "0"},
                            {"c) trebuie sa fie transportate urgent la o unitate medicala", "1"}

                    },
                    {
                            {"Persoana a suferit o plaga, insotita de hemoragii arteriale. Unde trebuie aplicat garoul de cauciuc in acest caz?", "0"},
                            {"a) peste plaga;", "0"},
                            {"b) deasupra plagii;", "1"},
                            {"c) sub plaga", "0"}

                    },
                    {
                            {"Persoana a suferit o fractura deschisa la degete. Putem recunoaste acest lucru cand:", "0"},
                            {"a) pielea este strapunsa in zona fracturii;", "1"},
                            {"b) persoana nu se poate misca;", "0"},
                            {"c) zona accidentata este tumefiata", "0"}

                    },
                    {
                            {"Persoana a suferit o fractura. Cum se face mobilizarea fracturii fara atele?", "0"},
                            {"a) cu esarfe;", "1"},
                            {"b) cu pansamente sterile;", "0"},
                            {"c) cu un garou", "0"}

                    },
                    {
                            {"Persoana a suferit un stop cardio-respirator. Daca dupa resuscitare aceasta isi recapata pulsul, este necesar sa:", "0"},
                            {"a) aplicati un bandaj toracic;", "0"},
                            {"b) incetati compresiile exterioare ale pieptului;", "1"},
                            {"c) continuati compresiile exterioare ale pieptului", "0"}

                    },
                    {
                            {"Persoana a suferit o fractura. Pentru evitarea complicatiilor, este necesar sa:", "0"},
                            {"a) sa imobilizati zona fracturata;", "1"},
                            {"b) sa sterilizati si sa pansati zona fracturata;", "0"},
                            {"c) sa aplicati un garou de cauciuc deasupra fracturii", "0"}

                    },
                    {
                            {"Persoana a suferit o hemoragie arteriala in urma unui accident. Se aplica garoul. Biletul care se prinde pe garou trebuie sa contina:", "0"},
                            {"a) pozitia in care a fost gasita victima;", "0"},
                            {"b) ora si minutul aplicarii garoului;", "1"},
                            {"c) datele de stare civila ale persoanei", "0"}

                    },
                    {
                            {"Persoana a suferit un accident. Ce poate determina stopul respirator in acest caz:", "0"},
                            {"a) pierderea intensa de sange;", "0"},
                            {"b) astuparea cailor respiratorii;", "1"},
                            {"c) multiple fracturi ale membrelor", "0"}

                    },
                    {
                            {"Persoana are caile respiratorii blocate in urma unui accident. Cum se pot debloca acestea?",  "0"},
                            {"a) la locul accidentului prin interventii specifice;",  "1"},
                            {"b) numai in unitati medicale, folosindu-se instrumente speciale;",  "0"},
                            {"c) indiferent unde, daca victima suporta aceasta interventie",  "0"}

                    },
                    {
                            {"Persoana a suferit un accident in urma caruia a rezultat o plaga. Se aplica un pansament. Ce trebuie sa contina acesta?", "0"},
                            {"a) o compresa de tifon steril;", "1"},
                            {"b) o compresa de orice tip;", "0"},
                            {"c) o compresa de vata sterila", "0"}

                    },
                    {
                            {"Persoana are o hemoragie la brat. Cum se va opri aceasta?", "0"},
                            {"a) prin legarea stransa sub rana;", "0"},
                            {"b) prin legarea stransa deasupra ranii;", "1"},
                            {"c) prin legarea stransa in dreptul ranii", "0"}

                    },
                    {
                            {"Persoana a suferit un accident. Ce pozitie de asteptare este indicata pana la transportul victimei la spital?", "0"},
                            {"a) o pozitie comoda pentru transport;", "0"},
                            {"b) o pozitie in functie de leziunile pe care victima le prezinta;", "1"},
                            {"c) o pozitie cat mai confortabila", "0"}

                    },
                    {
                            {"Persoana are hemoragie externa. Cum trebuie asezata aceasta?", "0"},
                            {"a) indiferent de pozitia ranii fata de planul corpului;", "0"},
                            {"b) astfel incat rana care sangereaza sa fie mai sus decat planul corpului;", "1"},
                            {"c) astfel incat rana care sangereaza sa fie mai jos decat planul corpului", "0"}

                    },
                    {
                            {"Persoana a suferit un accident. Aceasta prezinta corpi straini in interiorul plagilor. Cum se va proceda corect?", "0"},
                            {"a) corpii straini nu se extrag din plagi, intrucat pot aparea complicatii;", "1"},
                            {"b) se va incerca indepartarea acestora prin spalarea plagii cu apa curata;", "0"},
                            {"c) se va incerca extragerea acestora din plagi", "0"}

                    },
                    {
                            {"Persoana a suferit fracturi la membrele superioare. Pentru imobilizarea fracturilor:", "0"},
                            {"a) cu o batista;", "0"},
                            {"b) in acest caz nu se intervine;", "0"},
                            {"c) cu ajutorul atelelor", "1"}

                    },
                    {
                            {"Persoana a suferit un accident. Dezinfectarea plagilor ce necesita a fi pansate se face cu:", "0"},
                            {"a) cu ser fiziologic;", "0"},
                            {"b) cu apa oxigenata sau cu iod;", "1"},
                            {"c) cu apa potabila", "0"}

                    },
                    {
                            {"Persoana a suferit o entorsa. Cum procedati?", "0"},
                            {"a) aplicati un bandaj elastic strans;", "1"},
                            {"b) interziceti victimei sa se sprijine pe glezna respecitva;", "0"},
                            {"c) nu interveniti si asteptati ca victima sa fie transportata la spital", "0"}

                    }
            };

    String[] prenume_default = {
            "Andrei",
            "Gabriel",
            "Ionut",
            "Stefan",
            "Alexandru",
            "Maria",
            "Alexandra",
            "Elena",
            "Ioana",
            "Iulia",
            "Gabriela",
            "Ana-Maria",
            "Marian",
            "Paul",
            "Constantin",
            "Daniel",
            "Dani",
            "Mihaela",
            "Pavel",
            "Raul",
            "Codruta",
            "Cosmin"
    };
    String[] nume_default = {
            "Popa",
            "Popescu",
            "Radu",
            "Ionescu",
            "Dumitru",
            "Stoica",
            "Stan",
            "Gheorghe",
            "Rusu",
            "Munteanu",
            "Matei",
            "Constantin",
            "Serban",
            "Ursu",
            "Hulpe"
    };

    String getNume();
    String getPrenume();
    String getNumarMatricol();
    int getVarsta();
    String toString();
    void scrieMesaj(JLabel mesaj, JRadioButton r1, JRadioButton r2, JRadioButton r3, JLabel ln, JLabel lv, JLabel lnm);
    void adaugaOptiuniAjutor(JRadioButton r1, JRadioButton r2, JRadioButton r3, JLabel ln, JLabel lv, JLabel lnm);
}
