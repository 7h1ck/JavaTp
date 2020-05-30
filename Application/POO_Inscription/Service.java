public class Service {

     //Taille Reservation :nbre Cellule du Tableau
      final int TAILLE=10;
    //Taille Réélle :nbre element du Tableau
      private int nbreClasse=0;//nbre Classe dans le tableau ,
                               //mais aussi la position d'insertion
      private int nbrePersonne=0;
    //Declaration des Tableaux
    private Classe tabclasse[];
    private Personne [] tabPersonne;

    public Service(){
        //Creation du Tableau
        tabclasse=new Classe[TAILLE];
        tabPersonne=new Personne[TAILLE];

    }


    public void creerClasse(Classe classe){
        if(nbreClasse<TAILLE){
            tabclasse[nbreClasse]=classe;
            nbreClasse++;
        }else{
            System.out.println("Tableau Rempli");
        }
        
    }
    public void listerClasse(){
        for(int i=0;i<nbreClasse;i++){
            tabclasse[i].affiche();
        }
        
    }

    public void  ajouterPersonne(Personne pers){
        if(nbreClasse<TAILLE){
            tabPersonne[nbrePersonne]=pers;
            nbreClasse++;
        }else{
            System.out.println("Tableau Rempli");
        }
    }

    public void listerEudiantParClasse(){
       
        for(Classe cl: tabclasse){
            System.out.println("==========("+cl.getNom()+")==========");
            cl.listerEtudiant();
        }
    }

    public void affecterEt(Etudiant e,int id){
        e.inscrir(tabclasse[id]);
        tabclasse[id].addEtudiant(e);
    }

    public void affecterPr(Professeur p,int id){
        p.inscrir(tabclasse[id]);
        tabclasse[id].addProfesseur(p);
    }

    //Uc 



    
}