package resume;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Arrays to hold information
        ArrayList<Object> resumes = new ArrayList<Object>();
        ArrayList<Object> contactInfo = new ArrayList<Object>();
        ArrayList<Object> edu = new ArrayList<Object>();
        ArrayList<Object> exp = new ArrayList<Object>();
        ArrayList<Object> skill = new ArrayList<Object>();


        //Variables for my doWhile loops
        String eduCont = "";
        String workCont = "";
        String skillCont = "";
        String cont = "";

        //Index counter for my resume arrayList
        int counter = 0;

        //Start of Main Loop
        do {

            //contactInfo Section
            System.out.println("Please enter your name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.println("Please enter you email address: ");
            String email = scanner.nextLine();
            System.out.println("Please enter your Phone Number: ");
            String phoneNumber = scanner.nextLine();

            //Adds information entered to the contactInfo Array
            contactInfo.add(new Contact(name, email, phoneNumber));

            do {

            //Education Section
            System.out.println("Please enter the School you attended: ");
            String school = scanner.nextLine();
            System.out.println("Please enter the year you graduated: ");
            String year = scanner.nextLine();
            System.out.println("Please enter the degree you received: ");
            String degree = scanner.nextLine();
            System.out.println("Please enter the major you graduated with: ");
            String major = scanner.nextLine();

            //Adds information entered to the edu array
            edu.add(new Education(school, year, degree, major));


            //Loop stopper or continuer for education section
                System.out.println("Would you like to enter another education background?");
                eduCont = scanner.nextLine();
            }while(!eduCont.equalsIgnoreCase("no"));

            do {

            //Experience Section
            System.out.println("Please enter the company you previously worked for: ");
            String company = scanner.nextLine();
            System.out.println("Please enter the title of the last position you had at your previous job: ");
            String title = scanner.nextLine();
            System.out.println("Please enter the start year of your previous job: ");
            String startDate = scanner.nextLine();
            System.out.println("Please enter the end year of your previous job: ");
            String endDate = scanner.nextLine();
            System.out.println("Please enter the job description for your previous job: ");
            String jobDescription = scanner.nextLine();

            //Adds Information entered to the exp array
            exp.add(new Experience(company, title, startDate, endDate, jobDescription));


            //Loop stopper or continuer for experience section
                System.out.println("Would you like to enter another previous job?");
                workCont = scanner.nextLine();
            }while(!workCont.equalsIgnoreCase("no"));


            do {

            //Skills Section
            System.out.println("Please enter an important skill you may have: ");
            String skillDescription = scanner.nextLine();
            System.out.println("Please enter the proficiency you believe you are with the previous skill you entered: ");
            String proficiency = scanner.nextLine();

            //Adds Information entered to the skill array
            skill.add(new Skills(skillDescription, proficiency));

            //Loop stopper or continuer for skills section
                System.out.println("Would you like to enter another skill?");
                skillCont = scanner.nextLine();
            }while(!skillCont.equalsIgnoreCase("no"));


            //Adds a string of method returns combining all the arrayLists created previously to the Resume ArrayList
            resumes.add(counter, "\n********Resume********\n" + contactInfo(contactInfo) + "\nEducation" + education(edu) + "\nExperience" + experience(exp) + "\nSkills" + skills(skill) + "\n");

            //Method return that outputs the Resume ArrayList
            System.out.println(resume(resumes));


            //Main Loop stopper or continuer
            System.out.println("Would you like to enter another resume? (Yes|No)");
            cont = scanner.next();

            //Clear all sub arrays now that they are combined and stored into the Resume ArrayList. This is just in case more resumes are made
            contactInfo.clear();
            edu.clear();
            exp.clear();
            skill.clear();

            //Counter for adding new resumes in a specific order
            counter++;

            //End of Main Loop
        }while(!cont.equalsIgnoreCase("no"));

    }

    //Resumes Arraylist Method for outputting array contents
    public static String resume(ArrayList<Object> resumes){

        String str = "";

        for(int r = 0; r < resumes.size(); r++){
            str += resumes.get(r).toString();
        }
        return str;
    }

    //contactInfo Arraylist Method for outputting array contents based on toString method created in the Contact Class
    public static String contactInfo(ArrayList<Object> contactInfo){

        String str = "";

        for(int r = 0; r < contactInfo.size(); r++){
            str += contactInfo.get(r).toString();
        }
        return str;
    }

    //education Arraylist Method for outputting array contents based on toString method created in the education Class
    public static String education(ArrayList<Object> edu){

        String str = "";

        for(int r = 0; r < edu.size(); r++){
            str += edu.get(r).toString();
        }
        return str;
    }

    //experience Arraylist Method for outputting array contents based on toString method created in the experience Class
    public static String experience(ArrayList<Object> exp){

        String str = "";

        for(int r = 0; r < exp.size(); r++){
            str += exp.get(r).toString();
        }
        return str;
    }

    //skills Arraylist Method for outputting array contents based on toString method created in the skills Class
    public static String skills(ArrayList<Object> skill){

        String str = "";

        for(int r = 0; r < skill.size(); r++){
            str += skill.get(r).toString();
        }
        return str;
    }
}