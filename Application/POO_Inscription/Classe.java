public class Classe implements IInscription{

   //Auto généré
   protected static int gid=0;
    private int id;
    private String nom;
    private Etudiant[] tabEtudiant;
    private Professeur[] tabProfesseur;

   
      final int TAILLE=10;
  
     private int nbreEtudiant=0;
     private int nbreProfesseur=0;
 
    //Constructeur
    public Classe(){
       tabEtudiant = new Etudiant[TAILLE];
       tabProfesseur = new Professeur[TAILLE];
       Classe.gid++;
       this.id=Classe.gid;

    }

    public Classe(String nom){
       this.nom=nom;
       tabEtudiant = new Etudiant[10];
       tabProfesseur = new Professeur[10];
       Classe.gid++;
       this.id=Classe.gid;
   }


   //Getters and Setters
   public String getNom(){
      return nom;
   }

   //UC
   public void addEtudiant(Etudiant etudiant){
      if(nbreEtudiant<TAILLE){
         tabEtudiant[nbreEtudiant]=etudiant;
         nbreEtudiant++;
     }else{
         System.out.println("Tableau Rempli");
     }
   }

   public void addProfesseur(Professeur professeur){
      if(nbreEtudiant<TAILLE){
         tabProfesseur[nbreProfesseur]=professeur;
         nbreProfesseur++;
     }else{
         System.out.println("Tableau Rempli");
     }
   }

   public void listeEtudiant(){
      for(int i=0;i<nbreEtudiant;i++){
          System.out.println(tabEtudiant[i].affiche());
      }
      
  }
   

   //redefinition de la methode affiche()

    @Override
    public String affiche(){
       return "Id: "+this.id+" Nom : "+this.nom;
    }

}