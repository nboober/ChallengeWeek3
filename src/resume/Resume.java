package resume;
import java.util.ArrayList;

public class Resume {
    private Contact contact;
    private Education education;
    private Experience experience;
    private Skills skills;
//    ArrayList<Object> resumes = new ArrayList<Object>();


    public Resume(){

    }

    public Resume(String name, String email, String phoneNumber, String school, String year, String degree, String major, String company, String title, String startDate, String endDate, String jobDescription, String skillDescription, String proficiency){
        contact = new Contact(name, email, phoneNumber);
        education = new Education(school, year, degree, major);
        experience = new Experience(company, title, startDate, endDate, jobDescription);
        skills = new Skills(skillDescription, proficiency);

    }

//For changing things
//    public void setSchools(String degree, String major, String school, String year){
//        education.setSchools(degree, major, school, year);
//    }


//    public void setResumes(ArrayList<Object> resumes) {
//        this.resumes.add(resumes);
//    }

//    public String getResumes(){
//        String str = "";
//
//        for(int r = 0; r < resumes.size(); r++){
//            str += resumes.get(r).toString();
//        }
//
//        return str;
//    }

    @Override
    public String toString(){
        return contact.toString() + "Education " + education.toString() + "Experience" + experience.toString() + "Skills" + skills.toString();
    }


}
