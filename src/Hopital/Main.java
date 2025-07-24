package Hopital;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        Patient p=new Patient("kanta","balise",23,"24S896","cholera");
        p.afficherInfos();
        String nom,prenom,numDossier, maladie;
        int age;
        Hopital h = new Hopital();
        System.out.println("Nom patient: ");
        nom=sc.nextLine();
        System.out.println("prenom patient: ");
        prenom = sc.nextLine();
        System.out.println(" num dossier: ");
        numDossier = sc.nextLine();
        System.out.println("age patient: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.println("maladie patient: ");
        maladie = sc.nextLine();
        h.AjouterPatient(new Patient(nom,prenom,age,numDossier,maladie));
        h.afficherTout();
        h.sauvegarde("file.txt");



    }
}

