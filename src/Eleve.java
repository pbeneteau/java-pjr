import javax.swing.*;
import java.lang.reflect.Array;
import java.util.*;

public class Eleve extends Personne {

    private int numeroIdentifiant = 0;
    private static int identifiantIterator;
    static private final int nb_evaluations = 10;
    private CustomDate dateNaissance;
    private ArrayList<Evaluation> evaluations = new ArrayList<>();
    Set<Professeur> professeurs = new HashSet<>();
    private String nomPromotion ;

    Eleve() {
    }

    Eleve(String prenom, String nom, int jour, int mois, int annee, String nomPromotion) {
        super(prenom, nom);
        numeroIdentifiant = identifiantIterator;
        identifiantIterator++;
        dateNaissance = new CustomDate(jour, mois, annee);
        this.nomPromotion = nomPromotion;

    }


    public double getMoyenne() {

        if (evaluations.size() == 0) {
            throw new IllegalStateException("Pas de note.");
        }

        double somme = 0.0;

        for (Evaluation evaluation : evaluations) {
            somme += evaluation.getNote();
        }
        return somme/(double)evaluations.size();
    }


    public double getMediane() {

        double res = 0;

        if (evaluations.size() == 0) {
            throw new IllegalStateException("Pas de note.");
        }

        if (evaluations.size() % 2 == 0) {

            int i1 = evaluations.size()/2 - 1;
            int i2 = i1+1;
            res = (evaluations.get(i1).getNote() + evaluations.get(i2).getNote())/2;
        } else {
            int i = evaluations.size() / 2;
            res = evaluations.get(i).getNote();
        }
        return res;
    }


    public void addEvaluation(Evaluation evaluation) {
        evaluations.add(evaluation);
        Collections.sort(evaluations);
    }

    public ArrayList<Evaluation> getEvaluations() {
        return evaluations;
    }

    public Evaluation getEvaluation(int i) throws IllegalStateException {

        if (evaluations.get(i) != null) {
            throw new IllegalStateException("Cet evaluation n'existe pas.");
        }
        return evaluations.get(i);
    }

    public Set<Professeur> getCorrecteurs() {
        return professeurs;
    }



    @Override
    public String toString() {
        String string = "";

        string += "(" + getPrenom() + ", " + getNom() + ") id: " + numeroIdentifiant + "Promotions: "+ getNomPromotion() + "\nnotes: ";

        for (Evaluation evaluation: evaluations)
            string += evaluation.getMatiere() + " " + evaluation.getNote() + " ";
        string += "\nmoyenne = " + getMoyenne();
        string += "\nmediane = " + getMediane() + "\ncorrecteurs(s): [";
        for (Evaluation evaluation: evaluations)
            string += evaluation.getProfesseur().toString() + ", ";
        string = string.substring(0, string.length() - 2);
        string += "]";

        return string;
    }

    public void setNumeroIdentifiant(int numeroIdentifiant) {
        this.numeroIdentifiant = numeroIdentifiant;
    }

    public int getNumeroIdentifiant() {
        return numeroIdentifiant;
    }

    public String getNomPromotion() {
        return nomPromotion;
    }

    public void setNomPromotion(String nomPromotion) {
        this.nomPromotion = nomPromotion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Eleve eleve = (Eleve) o;
        return numeroIdentifiant == eleve.numeroIdentifiant;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroIdentifiant, dateNaissance, evaluations, professeurs);
    }
}
