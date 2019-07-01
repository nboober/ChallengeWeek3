package resume;


public class Resume {
    private Contact contact;
    private Education education;
    private Experience experience;
    private Skills skills;

    public Resume(){

    }

    public Resume(String name, String email, String phoneNumber){
        contact = new Contact(name, email, phoneNumber);
//        education = new Education(school, year, degree, major);
//        experience = new Experience(company, title, startDate, endDate, jobDescription);
//        skills = new Skills(skillDescription, proficiency);

    }

//For changing things
//    public void setSchools(String degree, String major, String school, String year){
//        education.setSchools(degree, major, school, year);
//    }




    @Override
    public String toString(){
        return contact.toString() + "Education " + education.toString() + "Experience" + experience.toString() + "Skills" + skills.toString();
    }


}
