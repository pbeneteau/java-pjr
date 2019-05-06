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
    public Eleve Rechercher(int numeroIdentifiant){
        boolean exist=false;

        if(this.listEleves.isEmpty()) {
            return null;
        }

        for(int i=0;i<this.listEleves.size();i++){
            if(this.listEleves.get(i).getNumeroIdentifiant() == numeroIdentifiant){
                exist=true;
                break;
            }
        }

        if(exist) {
            return this.listEleves.get(numeroIdentifiant);
        } else {
            return this.listEleves.get(numeroIdentifiant);
        }


    }
}
