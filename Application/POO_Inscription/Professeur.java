import java.time.LocalDate;

public class Professeur extends Personne {


    private String tuteur;
    private int annee;

    //Propriété navigationnelle
     
   
    //Constructeur
       //Par defaut
           public Professeur(){
          }
      //Surcharge du Contructeur
         //Creer un Objet puis de l'initialiser
          public Professeur(String nomComplet,
               int dateNaiss,String tuteur,int annee ){
            //Initialisation de la personne
              super(nomComplet,dateNaiss);
             this.tuteur=tuteur;
             this.annee=annee;
          }

   //Getters and Setters
      
   //redefinition de la methode affiche()

    @Override
    public String affiche(){
    //super signifie personne
    //this signifie etudiant
       return super.affiche() +" Tuteur : "+tuteur 
                     +" Annee "+annee;
    }

}