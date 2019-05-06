public class Main {

    public static void main(String[] args)
    {
        Professeur professeur1 = new Professeur("Jean","Louis", "hh");
        Eleve eleve1 = new Eleve("Peleve","Neleve",1,2,1998,"L1");
        Evaluation evaluation1 = new Evaluation("Maths",12,eleve1, professeur1);
        Evaluation evaluation2 = new Evaluation("Maths",12,eleve1, professeur1);
        Evaluation evaluation3 = new Evaluation("Maths",12,eleve1, professeur1);
        Evaluation evaluation4 = new Evaluation("Maths",12,eleve1, professeur1);


        eleve1.addEvaluation(evaluation1);
        eleve1.addEvaluation(evaluation2);
        eleve1.addEvaluation(evaluation3);
        eleve1.addEvaluation(evaluation4);

        eleve1.getCorrecteurs().add(professeur1);


        System.out.println(eleve1.toString());
        System.out.println(eleve1.getMediane());


    }



}
