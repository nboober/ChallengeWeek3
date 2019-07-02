package resume;
import java.util.ArrayList;


public class Experience {

    private String company = "";
    private String title = "";
    private String startDate = "";
    private String endDate = "";
    private String description = "";


    public Experience(){

    }

    public Experience(String company, String title, String startDate, String endDate, String description){
        this.company = company;
        this.title = title;
        this.startDate = startDate;
        this.endDate = endDate;
        this.description = description;

    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        company = company;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString(){

//
//        String str = "";
//
//        for(String exp : experience){
//
//            str += "\n" + exp + "\n";
//
//        }
//
//        return str;
        return "\n" + getTitle() + "\n" + getCompany() + ", " + getStartDate() + " - " + getEndDate() + "\n" + getDescription() + "\n";

    }

}
