import java.awt.*;
import java.util.Collection;
import java.util.EventListener;
import java.util.ArrayList;
import java.util.List;


public class Promotion {

private String nom;

    private Container eleves;
    private List<Eleve> listEleves = new ArrayList<>();


    public void addEleve(Eleve eleve){
        listEleves.add(eleve);
    }


    public Promotion(String nom) {
        this.nom = nom;
    }

    public Container getVEleves() {
        return eleves;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Eleve searchStudent(int studentNumber) throws IllegalStateException {

        if (this.listEleves.isEmpty()) {
            throw new IllegalStateException("Cet élève n'existe pas.");
        }

        for (Eleve listEleve : this.listEleves) {

            if (listEleve.getNumeroIdentifiant() == studentNumber) {
                return listEleve;
            }
        }
        throw new IllegalStateException("Cet élève n'existe pas.");
    }
}
