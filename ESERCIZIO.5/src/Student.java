public class Student extends CollegePerson implements iLearningPerson {

    private int academicYear;

    public Student(String name, String surname, int id, int year){
        setSurname(surname);
        setName(name);
        setCollegeId(id);
        academicYear = year; // se sono diversi non devo specificare * professor, ma posso lo stesso

    }
    @Override
    public void canLearn() {
        System.out.println(getName() + " " + getSurname() + " can studies at home.");

    }
    @Override
    public void goToCollege(){
        super.goToCollege();      //con il super esegue entrambi, se non lo metto esegue solo quello di questa classe
    }
}
