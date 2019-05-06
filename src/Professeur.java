
// On utilise l'héritage, on crée la classe Personne , les classes professeur et étudiant héritent de personne
public class Professeur extends Personne {

    public Professeur() {
    }

    public Professeur(String prenom, String nom) {
        super(prenom, nom);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public Eleve searchStudentFromPromotion(Promotion promotion, int studentNumber) {
        return promotion.searchStudent(studentNumber);
    }
}
