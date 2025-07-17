package Hopital;

public  abstract class Administrateur extends Personnel{
    public double salaire=salaireDeBase+500;
    public Administrateur(String nom,String prenom,int age,String matricule,double salaireDeBase,double salaire){
        super(nom,prenom,age,matricule,salaireDeBase);
        this.salaire=salaire;
    }
}
