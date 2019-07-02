package resume;

public class Skills {

    private String description = "";
    private String proficiency = "";

    public Skills(){

    }

    public Skills(String description, String proficiency){
        this.description = description;
        this.proficiency = proficiency;

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

        return "\n" + getDescription() + ", " + getProficiency();

    }

}
