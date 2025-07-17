package Hopital;

public abstract class Medecin extends Personnel{

   public String specialite;
   public static double nbrePatients;
   public  double salaire=salaireDeBase+1000*nbrePatients;

   public Medecin(String nom,String prenom,int age,String matricule,double salaireDeBase,String specialite){
        super(nom,prenom,age,matricule,salaireDeBase);
        this.specialite=specialite;
        nbrePatients++;
    }

    public double calculerSalaire(){
        return salaire;
    }
    public String toString(){
        return "nom: "+this.getNom()+" Prenom: "+this.getPrenom()+" age: "+this.getAge();
    }

    public void AfficherContrat(){
       System.out.println("Contract"+specialite);
    }
}
