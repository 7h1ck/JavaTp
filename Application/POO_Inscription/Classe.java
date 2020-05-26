import java.util.ArrayList;

public class Classe implements IInscription{

   //Auto généré
    private int id;
    private String nom;
    private ArrayList<Etudiant> tabEtudiant;
    public Classe(){

    }
    public Classe(String nom){
      this.nom = nom;
   }
   //Getters and Setters
   public void setNom(String nom){
      this.nom = nom;
   }
   public ArrayList<Etudiant> getTabEtudiant(){
      return this.tabEtudiant;
   }
   public void addEtudiant(Etudiant etudiant){
      this.tabEtudiant.add(etudiant);
   }
   public String getNom(){
      return nom;
   }
   //redefinition de la methode affiche()

    @Override
    public String affiche(){
       return "Id: "+id+" Nom : "+nom+"\n";
    }

}