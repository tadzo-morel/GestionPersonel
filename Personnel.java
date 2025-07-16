public abstract class Personnel extends Personne {

    public String matricule;

    public  Personnel(String nom,String prenom,int age ,String matricule){
        super(nom,prenom,age);
        this.matricule=matricule;
    }
    public abstract void afficherRole();

}