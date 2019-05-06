import javax.lang.model.type.NullType;

// On utilise l'héritage, on crée la classe Personne , les classes professeur et étudiant héritent de personne
public class Professeur extends Personne {

    private String matiere;

    public Professeur() {
    }

    public Professeur(String prenom, String nom, String matiere) {
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

        Eleve eleve;
        Evaluation evaluation;

        try {

            eleve = searchStudentFromPromotion(promotion, studentNumber);

            try {

                evaluation = eleve.getEvaluation(i);
                evaluation.setNote(mark);

            } catch (IllegalStateException e) {
                System.out.println(e.getMessage());
                eleve.addEvaluation(new Evaluation(this.matiere, mark, eleve, this));
            }
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}
