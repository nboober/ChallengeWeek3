package resume;
import java.util.ArrayList;

public class Skills {

    private String description = "";
    private String proficiency = "";
    ArrayList<String> skills;


    public Skills(){
         skills = new ArrayList<String>();
         setSkills(description, proficiency);

    }

    public Skills(String description, String proficiency){
        this.description = description;
        this.proficiency = proficiency;
        skills = new ArrayList<String>();
        setSkills(description, proficiency);
    }

    public void setSkills(String description, String proficiency){
        skills.add(description + ", " + proficiency);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProficiency() {
        return proficiency;
    }

    public void setProficiency(String proficiency) {
        this.proficiency = proficiency;
    }

    @Override
    public String toString(){

        String str = "";

        for(String skill : skills){

            str += "\n" + skill + "\n";

        }

        return str;

    }

}
