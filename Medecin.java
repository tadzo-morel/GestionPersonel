public class Medecin extends Personnel{

    public String specialite;

    public Medecin(String nom,String prenom,int age, String matricule,String specialite){
        super( nom, prenom,age , matricule);
        this.specialite=specialite;
    }
    public void afficherRole(){
        super.AfficherInfos(); 
        System.out.println("je suis medecin Specialiste en ...");
    }
}