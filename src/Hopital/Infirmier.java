package Hopital;

public abstract class Infirmier extends Personnel {
    public String service;
    public double salaire=salaireDeBase+500;
    public Infirmier(String nom,String prenom,int age,String matricule,double salaireDeBase,String service){
        super(nom,prenom,age,matricule,salaireDeBase);
        this.service=service;
    }

}
