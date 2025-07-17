package Hopital;

public abstract class Personnel extends Personne implements Employable {
    public String matricule;
    public double salaireDeBase;
    public Personnel(String nom,String prenom,int age,String matricule,double salaireDeBase){
        super(nom,prenom,age);
        this.matricule=matricule;
        this.salaireDeBase=salaireDeBase;
    }
    public abstract double calculerSalaire();

}
