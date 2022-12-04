public class CollegePerson {
    private String name;
    private String surname;
    private int collegeId;



    public void goToCollege(){
        System.out.println("College person: " + name + " " + surname + ", college ID: " + collegeId);
    }

    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public int getCollegeId(){
        return collegeId;
    }


    public void setName(String name){
        this.name = name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public void setCollegeId(int collegeId){
        this.collegeId = collegeId;
    }

}
