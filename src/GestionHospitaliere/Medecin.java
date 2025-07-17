package GestionHospitaliere;

public class Medecin extends Personnel {

    public String specialite;

    public Medecin(String nom, String prenom, int age, String matricule, String specialite) {
        super(nom,prenom,age,matricule);
        this.specialite=specialite;
    }
    public void AfficherRole(){
        System.out.println("je suis Medecin specialiser en "+specialite);
    }
}
