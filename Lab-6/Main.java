import java.util.*;

interface Course {
    void setCredits(int x);

    void setCourseNo(String y);
}

interface CSDept {
    String dept_name = "CS";
}

abstract class CSCourse implements CSDept, Course {
    protected int credits;
    protected String course_number;

    abstract void courseDetails();

    public void setCredits(int x) {
        this.credits = x;
    }

    public void setCourseNo(String y) {
        this.course_number = y;
    }

}

class Elective extends CSCourse {
    void courseDetails() {
        System.out.println("Course Details");
        System.out.println("Course : " + dept_name + " " + course_number);
        System.out.println("Course Type : Elective");
        System.out.println("Credits : " + credits);
    }
}

class CDC extends CSCourse {
    void courseDetails() {
        System.out.println("Course Details");
        System.out.println("Course : " + dept_name + " " + course_number);
        System.out.println("Course Type : CDC");
        System.out.println("Credits : " + credits);
    }
}

public class Main {
    public static void main(String[] args) {
        CSCourse ob;
        Scanner sc = new Scanner(System.in);
        int input;
        int grading;
        int numerator = 0;
        String c_no;
        int cred;
        int total_creds = 0;
        while (true) {
            input = sc.nextInt();
            if (input == -1)
                break;
            if (input == 0) {
                ob = new CDC();

                c_no = sc.next();
                ob.setCourseNo(c_no);
                cred = sc.nextInt();
                ob.setCredits(cred);
                grading = sc.nextInt();
                numerator += grading * ob.credits;
                ob.courseDetails();
                total_creds += cred;
            }
            if (input == 1) {
                ob = new Elective();
                c_no = sc.next();
                ob.setCourseNo(c_no);
                cred = sc.nextInt();
                ob.setCredits(cred);
                grading = sc.nextInt();
                numerator += grading * cred;
                ob.courseDetails();
                total_creds += cred;
            }
        }
        double spga = numerator / (float) total_creds;
        System.out.println("SGPA: " + String.format("%.2f", spga));
    }
}
