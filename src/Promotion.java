import java.awt.*;
import java.util.*;
import java.util.List;


public class Promotion {

private String nom;

    private ArrayList<Eleve> listeEleves = new ArrayList<Eleve>();


    public void addEleve(Eleve eleve){
        listeEleves.add(eleve);
    }


    public Promotion(String nom) {
        this.nom = nom;
    }

    public ArrayList<Eleve> getListeEleves() {
        return listeEleves;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Eleve searchStudent(int studentNumber) throws IllegalStateException {

        if (this.listeEleves.isEmpty()) {
            throw new IllegalStateException("Cet élève n'existe pas.");
        }

        for (Eleve listEleve : this.listeEleves) {

            if (listEleve.getNumeroIdentifiant() == studentNumber) {
                return listEleve;
            }
        }
        throw new IllegalStateException("Cet élève n'existe pas.");
    }

    public void triMoyenneCroissante() {


        MoyenneCompare comp = new MoyenneCompare();

         Collections.sort(listeEleves, comp);

    }
    public void triMoyenneDecroissante() {


        MoyenneCompare comp = new MoyenneCompare();

        Collections.sort(listeEleves, comp.reversed());

    }


    public void triMedianeCroissante() {


        MedianeCompare comp = new MedianeCompare();

        Collections.sort(listeEleves, comp);

    }
    public void triMedianeDecroissante() {


        MedianeCompare comp = new MedianeCompare();

        Collections.sort(listeEleves, comp.reversed());

    }
}
