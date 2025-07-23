package Hopital;

public class Patient extends Personne {
    public String numeroDossier;
    public String maladie;
    public Patient(String nom, String prenom, int age, String numeroDossier, String maladie){
        super(nom,prenom,age);
        this.numeroDossier=numeroDossier;
        this.maladie=maladie;
    }
    public void afficherInfos(){
        System.out.println(super.toString());
        System.out.println("numero Dossier: "+numeroDossier+" maladie: "+maladie);
    }

}
