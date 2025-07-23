package Hopital;

public class Infirmier extends Personnel {

    public String service;

    public Infirmier(String nom,String prenom,int age,String matricule,double salaireDeBase,String service){
        super(nom,prenom,age,matricule,salaireDeBase);
        this.service=service;
    }

    public double calculerSalaire() {
        return salaireDeBase+500;
    }
}
