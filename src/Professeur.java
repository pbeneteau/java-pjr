import javax.lang.model.type.NullType;

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

    public void setNote(Promotion promotion, int studentNumber, float mark, int i) {

        try {

            Eleve eleve = searchStudentFromPromotion(promotion, studentNumber);
            eleve.getEvaluation(i).setNote(mark);

        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }


    }
}
