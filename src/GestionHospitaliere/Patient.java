package GestionHospitaliere;

public class Patient extends Personne{
    public String numeroDossier;
    public String maladie;
    public Patient(String nom,String prenom,int age,String numeroDossier,String maladie){
        super(nom,prenom,age);
        this.numeroDossier=numeroDossier;
        this.maladie=maladie;
    }
    @Override
    public void AfficherInfos() {
        super.AfficherInfos();
        System.out.println("numero dossier: "+numeroDossier+" maladie: "+maladie);
    }
}
