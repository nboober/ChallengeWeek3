package resume;

public class Education {

    private String school = "";
    private String year = "";
    private String degree = "";
    private String major = "";

    public Education(){

    }

    public Education(String school, String year, String degree, String major){
        this.school = school;
        this.year = year;
        this.degree = degree;
        this.major = major;

    }

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

        return "\n"+ getDegree() + " in " + getMajor() + "\n" + getSchool() + ", " + getYear() + "\n";

    }

}
