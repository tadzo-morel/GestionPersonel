public class Main{
    public static void main(String[] args){

        Patient[] patients={
            new Patient("kamto","pierre",20, "2003","sida"),
                            
            new Patient("kamta","pierro",30, "2002","sida"),
                           
            new Patient("kamo","jouel",25, "2003","fievre"),
                           
            new Patient("kamto","pierre",20, "2005","grippe")
                           
        };

        Personnel[] p=new Personnel[5];
        p[0]=new Medecin("kamo", "pierre",20, "27","ginecologue") ;
        for(Patient P:patients)
        P.AfficherInfos();
    }
}