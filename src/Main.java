public class Main {

    public static void main(String[] args)
    {
        Professeur professeur1 = new Professeur("Jean","Louis", "Mathématiques");
        Professeur professeur2 = new Professeur("Foo","Bar", "Francais");
        Professeur professeur3 = new Professeur("Robert","John", "Anglais");
        Professeur professeur4 = new Professeur("Pierre","Balo", "Physique");


        Eleve eleve1 = new Eleve("PEleve1","Neleve1",1,2,1998,"2021");
        Eleve eleve2 = new Eleve("PEleve2","Neleve2",23,5,1998,"2021");
        Eleve eleve3 = new Eleve("PEleve3","Neleve3",6,9,1999,"2022");
        Eleve eleve4 = new Eleve("PEleve4","Neleve4",16,11,1999,"2022");
        Eleve eleve5 = new Eleve("PEleve5","Neleve5",5,12,1999,"2022");

        Evaluation evaluation1 = new Evaluation("Maths",12, eleve1, professeur1);
        Evaluation evaluation2 = new Evaluation("Maths",12, eleve1, professeur1);
        Evaluation evaluation3 = new Evaluation("Maths",12, eleve1, professeur1);
        Evaluation evaluation4 = new Evaluation("Maths",12, eleve1, professeur1);


        eleve1.addEvaluation(evaluation1);
        eleve1.addEvaluation(evaluation2);
        eleve1.addEvaluation(evaluation3);
        eleve1.addEvaluation(evaluation4);

        eleve1.getCorrecteurs().add(professeur1);


        System.out.println(eleve1.toString());
        System.out.println(eleve1.getMediane());

    }



}
