package Hopital;
public   class Administrateur extends Personnel{

    public  final  int prime =500;

    public Administrateur(String nom,String prenom,int age,String matricule,double salaireDeBase){
        super(nom,prenom,age,matricule,salaireDeBase);
    }

    public double calculerSalaire(){
        return salaireDeBase+prime;
    }

}
