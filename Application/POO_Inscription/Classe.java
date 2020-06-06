import java.lang.reflect.Array;
import java.util.ArrayList;

public class Classe implements IInscription{

   //Auto généré
   protected static int gid=0;
    private int id;
    private String nom;
    private ArrayList<Etudiant>tabEtudiant;
    private ArrayList<Professeur>tabProfesseur;
 
    //Constructeur
    public Classe(){
       tabEtudiant = new ArrayList<>();
       tabProfesseur = new ArrayList<>();
       Classe.gid++;
       this.id=Classe.gid;

    }

    public Classe(String nom){
       this.nom=nom;
       tabEtudiant = new ArrayList<>();
       tabProfesseur = new ArrayList<>();
       Classe.gid++;
       this.id=Classe.gid;
   }


   //Getters and Setters
   public String getNom(){
      return nom;
   }

   //UC
   public void addEtudiant(Etudiant etudiant){
         tabEtudiant.add(etudiant);

   }

   public void addProfesseur(Professeur professeur){
         tabProfesseur.add(professeur);

   }

   public void listeEtudiant(){
      for(Etudiant e : tabEtudiant){
          System.out.println(e.affiche());
      }
      
  }

  public void listeProfesseur(){
   for(Professeur p : tabProfesseur){
       System.out.println(p.affiche());
   }
   
}
   

   //redefinition de la methode affiche()

    @Override
    public String affiche(){
       return "Id: "+this.id+" Nom : "+this.nom;
    }

}