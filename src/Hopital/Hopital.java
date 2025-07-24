package Hopital;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
public class Hopital {

    public ArrayList<Patient> patients=new ArrayList<>();
    public ArrayList<Personnel> personnels=new ArrayList<>();
    public Hopital(){
        
    }

    public  void AjouterPatient(Patient e){
        patients.add(e);
    }
    public void AjouterPersonnel(Personnel p){
        personnels .add(p);

    }
    public void assignerMedecin(Medecin m){

        Medecin M=new Medecin(
                "Hum","henji",23,"32D23",2400,"dentiste"
        );

    }
    public void afficherTout(){
        for(Patient P:patients){
//            AjouterPatient(P);
            P.afficherInfos();
        }
        for(Personnel Ps:personnels){
            System.out.println(Ps.toString());
        }
    }
    public  void sauvegarde(String file){
            try ( BufferedWriter wr=new BufferedWriter(new FileWriter(file,true))){
                System.out.println("Affichage des patients: ");
                for (Patient p: patients) {
                    wr.write(p.toString());
                    wr.newLine();
                }
                System.out.println("Affichage du personnel");
                for (Personnel pe: personnels) {
                    wr.write(pe.toString());
                    wr.newLine();
                }
            }
            catch (IOException e){

            }
        }

    }


