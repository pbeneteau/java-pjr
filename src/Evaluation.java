

public class Evaluation implements Comparable<Evaluation> {

    private String matiere;
    private double note;
    private Eleve eleve;
    private Professeur professeur;

    public Evaluation(String matiere, double note, Eleve eleve, Professeur professeur) {
        this.matiere = matiere;
        this.note = note;
        this.eleve = eleve;
        this.professeur = professeur;
    }

    public String getMatiere() {
        return matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }

    public Professeur getProfesseur() {
        return professeur;
    }

    public void setProfesseur(Professeur professeur) {
        this.professeur = professeur;
    }

    @Override
    public String toString() {
        return "((" + eleve.getPrenom() + ", " + eleve.getNom() + ") (" + professeur.getPrenom() + ", " + professeur.getNom() + ") " + matiere + " " + note;
    }

    @Override
    public int compareTo(Evaluation o) {
        return Double.compare(this.note, o.note);
    }
}
