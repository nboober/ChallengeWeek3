package resume;
import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Object> resumes = new ArrayList<Object>();

        String eduCont = "";
        String workCont = "";
        String skillCont = "";
        String cont = "";

        do {

            System.out.println("Please Enter the information for your resume below: \n");
//            System.out.println("Please enter the name for which you would like to reference this resume once it is saved: ");
//            String save = scanner.next();
            System.out.println("Please enter your name: ");
            String name = scanner.nextLine();
            System.out.println("Please enter you email address: ");
            String email = scanner.nextLine();
            System.out.println("Please enter your Phone Number: ");
            String phoneNumber = scanner.nextLine();

            do {
                System.out.println("Please enter the School you attended: ");
                String school = scanner.nextLine();
                System.out.println("Please enter the year you graduated: ");
                String year = scanner.nextLine();
                System.out.println("Please enter the degree you received: ");
                String degree = scanner.nextLine();
                System.out.println("Please enter the major you graduated with: ");
                String major = scanner.nextLine();

                Education education = new Education();
                education.setSchools(degree, major, school, year);

                System.out.println("Would you like to enter another education background?");
                eduCont = scanner.nextLine();
            }while(!eduCont.equalsIgnoreCase("no"));

            do {
                System.out.println("Please enter the company you previously worked for: ");
                String company = scanner.nextLine();
                System.out.println("Please enter the title of the last position you had at your previous job: ");
                String title = scanner.nextLine();
                System.out.println("Please enter the start date of your previous job: ");
                String startDate = scanner.nextLine();
                System.out.println("Please enter the end date of your previous job: ");
                String endDate = scanner.nextLine();
                System.out.println("Please enter the job description for your previous job: ");
                String jobDescription = scanner.nextLine();

                Experience exp = new Experience();
                exp.setExperience(title, company, startDate, endDate, jobDescription);

                System.out.println("Would you like to enter another previous job?");
                workCont = scanner.nextLine();
            }while(!workCont.equalsIgnoreCase("no"));


            do {
                System.out.println("Please enter an important skill you may have: ");
                String skillDescription = scanner.nextLine();
                System.out.println("Please enter the proficiency you believe you are with the previous skill you entered: ");
                String proficiency = scanner.nextLine();

                Skills skills = new Skills();
                skills.setSkills(skillDescription, proficiency);

                System.out.println("Would you like to enter another skill?");
                skillCont = scanner.nextLine();
            }while(!skillCont.equalsIgnoreCase("no"));


            Resume resume = new Resume(name, email, phoneNumber);

            System.out.println("****My resume****");
            System.out.println(resume.toString());

            System.out.println("Would you like to enter another resume? (Yes|No");
            cont = scanner.next();

        }while(!cont.equalsIgnoreCase("no"));

    }
}
