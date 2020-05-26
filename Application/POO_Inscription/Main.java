import java.time.LocalDate;
import java.util.Scanner;
import java.util.ArrayList;
public class Main 
{
	public static void main(String args[])
	{
		Scanner clavier=new Scanner(System.in);
		int choix, annee,i,id;
		String Classe,tuteur,nomComplet,nomClasse;
		//Classe classe=new Classe();
		ArrayList<Classe> classes = new ArrayList<Classe>();
		do
		{
			System.out.println("1- Créer Classe");
			System.out.println("2- Lister Classe");
			System.out.println("3- Inscrire Etudiant dans une classe");
			System.out.println("4- Afficher les Etudiant d'une classe");
			System.out.println("5- Affecter les professeurs à une classe");
			System.out.println("6- Afficher les professeurs à une classe");
		
			System.out.println("7- Quitter");
			System.out.println("Faites votre choix");
			choix=clavier.nextInt();

         		switch(choix)
			{
			case 1:
				System.out.print("Veuillez saisir le nom");
				nomClasse=clavier.nextLine();
				Classe classe=new Classe(nomClasse);
				classes.add(classe);
			break;
			case 2:
				for(Classe c: classes)
				{
					c.affiche();
				}
			break;
			case 3:		
				System.out.println("nomComplet");	
				nomComplet=clavier.nextLine();
				//System.out.println("Choisissez la classe");
				LocalDate dateNaiss = LocalDate.now();
				System.out.println("tuteur");
				tuteur=clavier.nextLine();
				System.out.println("Classe");
                  		Classe=clavier.nextLine();
                  		System.out.println("Année");
                  		annee=clavier.nextInt();
				Etudiant Et = new Etudiant(nomComplet,dateNaiss,tuteur,annee);
				System.out.println("Choisissez la classe");
         			i=1;
				for(Classe c: classes)
				{
					System.out.print(i);
					c.affiche();
				}
				id=clavier.nextInt();
				Et.setClasseEtu(classes.get(id));
				classes.get(id).addEtudiant(Et);
			break;
			case 4:
				System.out.println("Choisissez la classe");
         			i=1;
				for(Classe c: classes)
				{
					//System.out.print(i);
					c.affiche();
				}
				id=clavier.nextInt();
				tabEt = classes.get(id).getTabEtudiant();
				for(Etd e: tabEt)
				{
					e.affiche();
				}
			break;
			default:
			break;       
			}
		}while(choix!=7);

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


