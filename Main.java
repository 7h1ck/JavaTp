//java.lang
//System.out =>Ecran
//System.in =>Clavier
import java.util.Scanner;
import java.util.ArrayList;

public class Main 
{
	//Declaration de variables => portée de classe
        public static void main(String args[])
	{
		/*
                System.out.println("Bonjour à Tous"); 
		System.out.println("les etudiants de la GLRS et MAE "); 
               	//Scanner clavier pour lire les données tapeés au clavier
               	Scanner clavier=new Scanner(System.in);
               	System.out.println("Veuillez saisir un Mot");
               	//Lire une donnée de type chaine 
               	String prenom=clavier.next();
               	System.out.println("Bonjour "+prenom); 
               
               	//type primitifs ou de données  => int ,    float, double, char,      boolean 
               	//classes wappers ou Enveloppes => Integer, Float, Double, Character, Boolean
               
               	System.out.println("Veuillez saisir un entier");
               	int x=clavier.nextInt();
               	System.out.println("Le nombre est "+x); 
          
             	// Figure f=new Figure(); impossible car //Figure est classe Abstraite

                Carre c=new Carre();
                c.setLongueur(12);
                System.out.println("La Longueur est "+                     c.getLongueur());
                //Surcharge
                Carre c1=new Carre(15);
                System.out.println("La Longueur est "+                     c1.getLongueur());
                System.out.println("Le Demi Perimetre est "+                     c1.demiPerimetre());
                System.out.println("Le Perimetre est "+                     c1.perimetre());
            	System.out.println("La Surface est "+                     c1.surface());
            	System.out.println("La Diagonale est "+                     c1.diagonale());
   		*/
int choix;
Carre carre= new Carre();
Rectangle rectangle = new Rectangle();
ArrayList<Carre> carres = new ArrayList<Carre>();
ArrayList<Rectangle> rectangles  = new ArrayList<Rectangle>();
double longueur;
double largeur;
do{
              System.out.println("1- Ajout Carre");
              System.out.println("2- Lister Carre");
              System.out.println("3- Ajout Rectangle");
              System.out.println("4- Lister Rectangle");
              System.out.println("5- Quitter");
              System.out.println("Faites votre choix");
              Scanner clavier=new Scanner(System.in);
              choix=clavier.nextInt();
            /* 
              if(choix==1){
               }
               if(choix==2){
              }
            */
         
           switch(choix){
            case 1:
              System.out.println("Veuillez saisir la Longeur");
                   longueur=clavier.nextDouble();
                   carre.setLongueur(longueur);
		   carres.add(carre);
             break;
            case 2:
		for (Carre c : carres){
                 System.out.println("La Longueur est "+c.getLongueur());
                 System.out.println("Le Demi Perimetre est "+c.demiPerimetre());
                 System.out.println("Le Perimetre est "+ c.perimetre());
                 System.out.println("La Surface est "+ c.surface());
                 System.out.println("La Diagonale est "+c.diagonale());
		System.out.println("==========================================================\n");
		}
             break;

		case 3:
              System.out.println("Veuillez saisir la Longueur");
                   longueur=clavier.nextDouble();
			System.out.println("Veuillez saisir la Largeur");
			largeur=clavier.nextDouble();
                                   
                   rectangle.setLongueur(longueur);
		    rectangle.setLargeur(largeur); 
		   rectangles.add(rectangle);
             break;
            case 4:
		for (Rectangle r : rectangles){
                 System.out.println("La Longueur est "+r.getLongueur());
		System.out.println("La Largeur est "+r.getLargeur());
                 System.out.println("Le Demi Perimetre est "+r.demiPerimetre());
                 System.out.println("Le Perimetre est "+ r.perimetre());
                 System.out.println("La Surface est "+ r.surface());
                 System.out.println("La Diagonale est "+r.diagonale());
		System.out.println("==========================================================\n");
		}
             break;
           }

     } while(choix!=5);


                  
       }

}

/*Portée block
 {
    int var1=2;
    {
       int var2;
      //Possible
       int s=var1+var2;
    }
      //Impossible
       int s=var1+var2;//var2 n'existe pas dans ce bloc
 }
*/


