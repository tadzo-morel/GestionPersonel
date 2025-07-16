public class Personne {

    private String nom;
    private String prenom;
    private int age;
    public Personne(String nom,String prenom,int age){
        this.nom=nom;
        this.prenom=prenom;
        this.age=age;
    }
    public void AfficherInfos(){
        System.out.println("Nom: "+nom+" Prenom: "+prenom+" age:  "+age);
    }
}
