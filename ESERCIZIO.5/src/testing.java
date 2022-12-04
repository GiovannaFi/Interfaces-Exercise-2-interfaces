public class testing {
    public static void main(String[] args) {

        Student student1 = new Student("Alberto", "Rossi", 33, 1);
        Professor professor1 = new Professor("Clara", "Verdi", 22, "art");
        Assistant assistant1 = new Assistant("Matteo", "Fumagalli", 44, true);

        student1.goToCollege();
        professor1.goToCollege();
        assistant1.goToCollege();

        System.out.println("-------------------------------");
        student1.canLearn();


        System.out.println("-------------------------------");
        professor1.teachToOtherPeople();


        System.out.println("-------------------------------");

        assistant1.teachToOtherPeople();
        assistant1.canLearn();


    }
}
