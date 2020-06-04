import java.util.ArrayList;

public class Service {

    //Declaration des Tableaux
    private ArrayList<Classe> tabClasse;
    private ArrayList<Personne> tabPersonne;

    public Service(){
        //Creation du Tableau
        tabClasse=new ArrayList<Classe>();
        tabPersonne=new ArrayList<Personne>();

    }


    public void creerClasse(Classe classe){
            tabClasse.add(classe);       
    }
    public void listerClasses(){
        for(Classe c: tabClasse){
            System.out.println(c.affiche());
        }
        
    }

    public void  ajouterPersonne(Personne pers){
            tabPersonne.add(pers);
    }

    public void listerEudiantParClasse(){
       
        for(Classe cl: tabClasse){
            System.out.println("==========("+cl.getNom()+")==========");
            cl.listeEtudiant();
            System.out.println("=================(Fin)===================");
            System.out.println();
        }
    }

    public void affecterEt(Etudiant e,int id){
        e.affecter(tabClasse.get(id));
        tabClasse.get(id).addEtudiant(e);
    }

    public void affecterPr(Professeur p,int id){
        p.affecter(tabClasse.get(id));
        tabClasse.get(id).addProfesseur(p);
    }

    //Uc 



    
}