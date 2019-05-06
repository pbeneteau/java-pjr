import java.awt.*;
import java.util.Collection;
import java.util.EventListener;
import java.util.ArrayList;
import java.util.List;


public class Promotion {

private String nom;

    private Container eleves;

    List<Eleve> listEleves = new ArrayList<>();


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

    public Eleve searchStudent(int studentNumber){

        if(this.listEleves.isEmpty()) {
            return null;
        }

        for (Eleve listEleve : this.listEleves) {

            if (listEleve.getNumeroIdentifiant() == studentNumber) {
                return listEleve;
            }
        }
        return null;
    }
}
