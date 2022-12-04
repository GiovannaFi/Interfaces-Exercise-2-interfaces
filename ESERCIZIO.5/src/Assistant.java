public class Assistant extends CollegePerson implements iTeachingPerson, iLearningPerson{

    private boolean isGoingToBeAPhD;

    public Assistant(String name, String surname, int id, boolean willBeAPhD){
        setSurname(surname);
        setName(name);
        setCollegeId(id);
        this.isGoingToBeAPhD= willBeAPhD;
    }
    @Override
    public void teachToOtherPeople() {
        System.out.println(getName() + " " + getSurname() + " can teach " );
    }

    @Override
    public void canLearn() {
        System.out.println(getName() + " " + getSurname() + " can learn.\nis " + getName() + " going to be a PhD? " + isGoingToBeAPhD);

    }


}
