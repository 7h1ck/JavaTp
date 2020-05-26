import java.time.LocalDate;
public abstract class Personne implements IInscription{

   //Auto généré
    protected static int gid=0;
   
    protected  String nomComplet;
    protected  LocalDate dateNaiss;
    protected  int  age;
    protected  int  id;

    public Personne (String nomComplet,
               LocalDate dateNaiss){
	id++;
	this.id=Personne.gid;
      this.nomComplet=nomComplet;
      this.dateNaiss=dateNaiss.now();
     //Initialisé ID
       this.age=calculAge();

    }

      public Personne (){
        //Initialisé ID
        this.id=Personne.gid;
    }

   //Getters and Setters



   //redefinition de la methode affiche()

    @Override
    public String affiche(){
       return "Id: "+id+" Nom et Prenom : "+nomComplet;
    }

   private int calculAge(){
      return 0;
   }

}