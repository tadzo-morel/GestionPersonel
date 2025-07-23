package Hopital;

import java.util.ArrayList;

public  class Medecin extends Personnel{

   public String specialite;
   public ArrayList<Patient> patients=new ArrayList<>();
//   public double nbrePatients;
//   public  double salaire=salaireDeBase+1000*nbrePatients;

   public Medecin(String nom,String prenom,int age,String matricule,double salaireDeBase,String specialite){
        super(nom,prenom,age,matricule,salaireDeBase);
        this.specialite=specialite;
    }

    public double calculerSalaire(){
        return salaireDeBase+(1000*patients.size());
    }
    public void afficherContrat(){
        System.out.println("votre contrat"+super.toString()+" "+specialite);
    }
}
