import java.util.Scanner;

public class Main {


public static void main(String[] args) {
String choix;
     Scanner clavier=new Scanner(System.in);
     Service service =new Service();
    do {

        System.out.println("1-Creer Classe");
        System.out.println("2-Afficher Classe ");
        System.out.println("3-Inscrire etudiant");
        System.out.println("4-Affecter professeur ");
        System.out.println("5-Quitter");
        System.out.println("Faites votre choix");
        choix=clavier.nextLine();
        switch(choix){
            case "1":
            System.out.println("Entrer le libelle de la Classe");
               String libelle =clavier.nextLine();
               Classe cl=new Classe(libelle);
               service.creerClasse(cl);
            break;

            case "2":

            service.listerClasse();
            break;

            case "3":
            // Inscription
            System.out.println("Entrer le nom complet ");
               String nomComplet =clavier.nextLine();
            System.out.println("Entrer la date de naissance");
            int dateNaiss =clavier.nextInt();
            System.out.println("Entrer le tuteur");
               String tuteur =clavier.nextLine();
            System.out.println("Entrer l annee");
               int annee =clavier.nextInt();

               Etudiant et = new Etudiant(nomComplet,dateNaiss,tuteur,annee);
            service.ajouterPersonne(et);

            // Affectation
            service.listerClasse();
            System.out.println("Entrer l ID de la classe ");
              int  idClasse =clavier.nextInt();
              service.affecterEt(et,idClasse);
            break;
            default :
            break;

        }
        
    } while (choix!="5");

        
}
    
}