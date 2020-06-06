import java.time.LocalDate;
import java.util.Scanner;

public class Main {


public static void main(final String[] args) {
String choix;
     final Scanner clavier=new Scanner(System.in);
     final Service service =new Service();

     //Declaration des variable 
     String libelle;
     Classe classe;
     String nomComplet;
     String tuteur;
     int annee;
     int jour;
     int mois;
     int idClasse;
     LocalDate dateNaiss;
     Etudiant etudiant;
     Professeur professeur;
     final String sms = "Entrer l ID de la classe";

    do {

        System.out.println("1-Creer Classe");
        System.out.println("2-Afficher Classes ");
        System.out.println("3-Inscrire etudiant");
        System.out.println("4-Affecter professeur ");
        System.out.println("5-Afficher les etudiants d\'une classe");
        System.out.println("6-Afficher les professeurs d\'une classe");      
        System.out.println("7-Lister tous les etudiants");
        System.out.println("8-Quitter");
        System.out.println("Faites votre choix");
        choix=clavier.nextLine();
        switch(choix){
            case "1":
            System.out.println("Entrer le libelle de la Classe");
               libelle =clavier.nextLine();
               classe=new Classe(libelle);
               service.creerClasse(classe);
            break;

            case "2":

            service.listerClasses();
            break;

            case "3":
            // Inscription
            System.out.println("Entrer le nom complet ");
               nomComplet =clavier.nextLine();
               System.out.println("Entrer le tuteur");
               tuteur = clavier.nextLine();
               System.out.println("Entrer l annee d Etude");
               clavier.nextInt();
               System.out.println("Entrer le jour de naissance");
               jour =clavier.nextInt();
               System.out.println("Entrer le mois de naissance");
               mois =clavier.nextInt();
               System.out.println("Entrer le Anne de naissance");
               annee =clavier.nextInt();
               dateNaiss = LocalDate.of(annee, mois, jour);
               etudiant = new Etudiant(nomComplet,dateNaiss,tuteur,annee);
               service.ajouterPersonne(etudiant);

            // Affectation
            service.listerClasses();
            System.out.println("Entrer l ID de la classe ");
              idClasse =clavier.nextInt();
              service.affecterPersonne(etudiant,idClasse-1);
            break;
            case "4":
            // Afectation Professeur
            // Affectation
            System.out.println("1 -Nouveau prof\n2 -Prof existant");
            final String opt = clavier.nextLine();
            if (opt.equals("1")){
              System.out.println("Entrer le nom complet ");
                 nomComplet =clavier.nextLine();
                 System.out.println("Entrer la matiere");
                 final String matiere =clavier.nextLine();
                 System.out.println("Entrer l annee d Etude");
                 clavier.nextInt();
                 System.out.println("Entrer le jour de naissance");
                 jour =clavier.nextInt();
                 System.out.println("Entrer le mois de naissance");
                 mois =clavier.nextInt();
                 System.out.println("Entrer le Anne de naissance");
                 annee =clavier.nextInt();
                 dateNaiss = LocalDate.of(annee, mois, jour);
                 professeur = new Professeur(nomComplet,dateNaiss,matiere,annee);
              service.ajouterPersonne(professeur);
            service.listerClasses();
            System.out.println(sms);
            idClasse =clavier.nextInt();
          service.affecterPersonne(professeur,idClasse-1);
              
            } else {
              // Afectation Professeur par id
              service.listerProfesseurs();
              System.out.println("Entre Id de la prof");
              final int id =clavier.nextInt();
              service.listerClasses();
            System.out.println(sms);
            idClasse =clavier.nextInt();
            professeur = (Professeur)service.getTabPersonne().get(id-1);
            service.affecterPersonne(professeur,idClasse-1);
              service.affecterPersonne(professeur,id-1);             
            }
            

            break;

            case "5":
            service.listerClasses();
            System.out.println(sms);
            idClasse = clavier.nextInt();
            service.listerEudiantsInClass(idClasse-1);
            break;
            case "6":
            service.listerClasses();
            System.out.println(sms);
            idClasse = clavier.nextInt();
            service.listerProfesseursInClass(idClasse-1);
            break;

            case "7":
            service.listeAllEtudiant();
            break;
            default :
            System.out.println("Erreur de choix");

        }
        
    } while (!choix.equals("8"));

        
}
    
}