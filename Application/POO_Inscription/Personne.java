import java.time.LocalDate;

public abstract class Personne implements IInscription{

   //Auto généré
    protected static int gid=0;
    
    protected  int  id;
    protected  String nomComplet;
    protected  LocalDate dateNaiss;
    protected  int  age;

    public Personne (String nomComplet,
               LocalDate dateNaiss){
      Personne.gid++;
	   this.id=Personne.gid;
      this.nomComplet=nomComplet;
      this.dateNaiss=dateNaiss;
     //Initialisé ID
      this.age=calculAge();

    }

      public Personne (){
        //Initialisé ID
        Personne.gid++;
        this.id=Personne.gid;
    }

   //Getters and Setters


   //redefinition de la methode affiche()

    @Override
    public String affiche(){
       return "Id: "+id+" Nom et Prenom : "+nomComplet;
    }

   private int calculAge(){
      int ag = LocalDate.now().getYear() - this.dateNaiss.getYear();
      if (LocalDate.now().getMonthValue() < this.dateNaiss.getMonthValue() && LocalDate.now().getDayOfMonth() < this.dateNaiss.getDayOfMonth()) {
         ag--;
      }
      return ag;
   }

}