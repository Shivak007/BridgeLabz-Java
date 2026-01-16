package objectorientedprogramming.constructors.instance;

class Course {
    private String courseName;
    private int duration;
    private double fee;

    private static String instituteName = "Default Institute";

    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    void displayCourseDetails() {
        System.out.println("Institute: " + instituteName +
                ", Course: " + courseName +
                ", Duration: " + duration + " months" +
                ", Fee: ₹" + fee);
    }

    static void updateInstituteName(String newName) {
        instituteName = newName;
        System.out.println("Institute name updated to: " + instituteName);
    }
}

public class OnlineCourse {
    public static void main(String[] args) {
        Course.updateInstituteName("SRM Institute of Science and Technology");

        Course c1 = new Course("Java Programming", 3, 50000);
        Course c2 = new Course("Data Structures", 4, 65000);

        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}