package resume;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;


public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Object> resumes = new ArrayList<Object>();
        ArrayList<Object> contactInfo = new ArrayList<Object>();
        ArrayList<Object> edu = new ArrayList<Object>();
        ArrayList<Object> exp = new ArrayList<Object>();
        ArrayList<Object> skill = new ArrayList<Object>();


        String eduCont = "";
        String workCont = "";
        String skillCont = "";
        String cont = "";
        int counter = 0;

        do {

            System.out.println("Please enter your name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.println("Please enter you email address: ");
            String email = scanner.nextLine();
            System.out.println("Please enter your Phone Number: ");
            String phoneNumber = scanner.nextLine();

            contactInfo.add(new Contact(name, email, phoneNumber));

            do {
            System.out.println("Please enter the School you attended: ");
            String school = scanner.nextLine();
            System.out.println("Please enter the year you graduated: ");
            String year = scanner.nextLine();
            System.out.println("Please enter the degree you received: ");
            String degree = scanner.nextLine();
            System.out.println("Please enter the major you graduated with: ");
            String major = scanner.nextLine();

            edu.add(new Education(school, year, degree, major));


                System.out.println("Would you like to enter another education background?");
                eduCont = scanner.nextLine();
            }while(!eduCont.equalsIgnoreCase("no"));

            do {
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

            exp.add(new Experience(company, title, startDate, endDate, jobDescription));


                System.out.println("Would you like to enter another previous job?");
                workCont = scanner.nextLine();
            }while(!workCont.equalsIgnoreCase("no"));


            do {
            System.out.println("Please enter an important skill you may have: ");
            String skillDescription = scanner.nextLine();
            System.out.println("Please enter the proficiency you believe you are with the previous skill you entered: ");
            String proficiency = scanner.nextLine();

            skill.add(new Skills(skillDescription, proficiency));

                System.out.println("Would you like to enter another skill?");
                skillCont = scanner.nextLine();
            }while(!skillCont.equalsIgnoreCase("no"));


            resumes.add(counter, "\n********Resume********\n" + contactInfo(contactInfo) + "\nEducation" + education(edu) + "\nExperience" + experience(exp) + "\nSkills" + skills(skill));
            System.out.println(resume(resumes));

            System.out.println("\nWould you like to enter another resume? (Yes|No)");
            cont = scanner.next();
            counter++;

//            if(res.equalsIgnoreCase("no")){
//                System.out.println("Would you like to change the name, email-address, or phone number for any of your resumes? If yes, type the name of the corresponding resume and what you would like to change. If no, type 'no'.");
//
//                System.out.println("Enter the name of the resume owner or 'no'.");
//                String resumeName = scanner.nextLine();
//                if(resumeName.equalsIgnoreCase("no")){
//                    cont = "no";
//                    break;
//                }
//                System.out.println("Enter what you would like to change. (Name, Email, Phone Number");
//                String change = scanner.next();
//
//                System.out.println("Enter what you would like to change that item to.");
//                String changeTo = scanner.next();
//
//                System.out.println(getResume(resumes, resumeName));
//
//
//
//
//            }

        }while(!cont.equalsIgnoreCase("no"));

    }

    public static String resume(ArrayList<Object> resumes){

        String str = "";

        for(int r = 0; r < resumes.size(); r++){
            str += resumes.get(r).toString();
        }
        return str;
    }

    public static String contactInfo(ArrayList<Object> contactInfo){

        String str = "";

        for(int r = 0; r < contactInfo.size(); r++){
            str += contactInfo.get(r).toString();
        }
        return str;
    }

    public static String education(ArrayList<Object> edu){

        String str = "";

        for(int r = 0; r < edu.size(); r++){
            str += edu.get(r).toString();
        }
        return str;
    }

    public static String experience(ArrayList<Object> exp){

        String str = "";

        for(int r = 0; r < exp.size(); r++){
            str += exp.get(r).toString();
        }
        return str;
    }

    public static String skills(ArrayList<Object> skill){

        String str = "";

        for(int r = 0; r < skill.size(); r++){
            str += skill.get(r).toString();
        }
        return str;
    }
}