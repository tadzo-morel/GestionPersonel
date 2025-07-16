public class Infirmier extends Personnel{

    public String service;

    public Infirmier(String nom,String prenom,int age ,String matricule,String service){
        super( nom,prenom,age , matricule);
        this.service=service;
    }
    public void afficherRole(){
        // super.afficherRole();
        System.out.println("je suis infirmier dans le service...");
    }
}