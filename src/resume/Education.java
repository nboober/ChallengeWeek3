package resume;
import java.util.ArrayList;

public class Education {

    private String school = "";
    private String year = "";
    private String degree = "";
    private String major = "";
//    ArrayList<String> schools;

    public Education(){
//        schools  = new ArrayList<String>();
//        setSchools(school, year, degree, major);

    }

    public Education(String school, String year, String degree, String major){
        this.school = school;
        this.year = year;
        this.degree = degree;
        this.major = major;
//        schools  = new ArrayList<String>();
//        setSchools(school, year, degree, major);
    }

//    public void setSchools(String degree, String major, String school, String year){
//        schools.add(degree + " in " + major + "\n" + school + ", " + year);
//    }

    public void setSchool(String school){
        this.school = school;
    }

    public String getSchool(){
        return this.school;
    }

    public void setYear(String year){
        this.year = year;
    }

    public String getYear(){
        return this.year;
    }

    public void setDegree(String degree){
        this.degree = degree;
    }

    public String getDegree(){
        return this.degree;
    }

    public void setMajor(String Major){
        this.major = major;
    }

    public String getMajor(){
        return major;
    }

    @Override
    public String toString() {
//
//        String str = "";
//
//        for(String school : schools){
//
//            str += "\n" + school + "\n";
//
//        }
//
//            return str;

        return "\n"+ this.degree + " in " + this.major + "\n" + this.school + ", " + this.year + "\n";

    }

}
