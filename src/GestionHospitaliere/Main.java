package GestionHospitaliere;

public class Main {

    public static void main(String[] args) {
        Patient[] patients = {
                new Patient("kamga", "paul", 23, "23S45", "cholera"),

        new Patient("kamga", "paulin", 25, "23S46", "cholera"),

        new Patient("kamta", "pauline", 43, "23S47", "Paludisme"),

        new Patient("kamta", "pauline", 43, "23S47", "Paludisme"),

        new Patient("keuno", "Natalie", 43, "23S49", "Paludisme")


        };
        Personnel[] personnels = new Personnel[5];
        personnels[0] = new Medecin("Host", "Emanuel", 43, "23R45", "ginecologue");
        personnels[1] = new Infirmier("wanta", "margarite", 26, "25R84", "assitant Medecin");
        personnels[2] = new Medecin("Kenfack", "robert", 45, "234F87", "Dantiste");
        personnels[3] = new Medecin("Kenfack", "Justin", 55, "234G87", "Dantiste");
        personnels[4] = new Medecin("Kenfack", "Moredo", 47, "234P87", "Petiatre");
        for (Patient P:patients) {
            P.AfficherInfos();
            System.out.println("*************************************************************************");
        }

        for (Personnel Ps:personnels) {
            Ps.AfficherInfos();
            Ps.AfficherRole();
            System.out.println("*************************************************************************");
        }
    }

}
