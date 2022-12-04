public class Professor extends CollegePerson implements iTeachingPerson {

    private String teachingSubject;

    public Professor(String name, String surname, int id, String teachingSubject){
        setName(name);
        setSurname(surname);
        setCollegeId(id);
        this.teachingSubject = teachingSubject; // se il nome della variabile è uguale devo specificare this.
    }

    @Override
    public void teachToOtherPeople() {
        System.out.println(getName() + " " + getSurname() + " can teach " + teachingSubject);
    }

    //public String getTeachingSubject(){
        //return teachingSubject;
    //}

}
