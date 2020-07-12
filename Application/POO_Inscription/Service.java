import java.util.ArrayList;

public class Service {

    //Declaration des Tableaux
    private ArrayList<Classe> tabClasse;
    private ArrayList<Personne> tabPersonne;

    public Service(){
        //Creation du Tableau
        tabClasse=new ArrayList<>();
        tabPersonne=new ArrayList<>();

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

    public void listeAllEtudiant(){       
        for(Classe cl: tabClasse){
            System.out.println("==============("+cl.getNom()+")==========");
            cl.listeEtudiant();
            System.out.println("=================(Fin)===================");
            System.out.println();
        }
    }

    public void affecterPersonne(Personne p,int id){
        if (p instanceof Etudiant) {
            ((Etudiant)p).affecter(tabClasse.get(id));
            tabClasse.get(id).addEtudiant((Etudiant)p);
            
        } else {
            ((Professeur)p).affecter(tabClasse.get(id));
            tabClasse.get(id).addProfesseur((Professeur)p);
            
        }
    }



	public void listerProfesseurs() {
        for(Personne p: tabPersonne){
            if (p instanceof Professeur) {
                System.out.println(p.affiche());
                
            }
        }
    }
    
    public ArrayList<Personne> getTabPersonne() {
        return this.tabPersonne;
	}
    //Uc 
    public void listerEudiantsInClass(int id){
        tabClasse.get(id).listeEtudiant();
    }

    public void listerProfesseursInClass(int id){
        tabClasse.get(id).listeProfesseur();
    }
    
}