import java.time.LocalDate;
import java.util.ArrayList;

public class Professeur extends Personne {


    private String matiere;
    private ArrayList<Classe> classes;

    //Propriété navigationnelle
     
   
    //Constructeur
       //Par defaut
           public Professeur(){
          }
      //Surcharge du Contructeur
         //Creer un Objet puis de l'initialiser
          public Professeur(String nomComplet,
               LocalDate dateNaiss,String matiere){
            //Initialisation de la personne
              super(nomComplet,dateNaiss);
             this.matiere=matiere;
          }

          public void affecter(Classe c){
            this.classes.add(c);
         }
   //Getters and Setters
      
   //redefinition de la methode affiche()

    @Override
    public String affiche(){
    //super signifie personne
    //this signifie etudiant
       return super.affiche() +" matiere : "+matiere;
    }

}