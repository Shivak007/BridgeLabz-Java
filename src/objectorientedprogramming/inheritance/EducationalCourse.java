package objectorientedprogramming.inheritance;

class Course {
    protected String courseName;
    protected int duration;

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void displayInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
    }
}

class OnlineCourse extends Course {
    protected String platform;
    protected boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount;

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Fee: ₹" + fee);
        System.out.println("Discount: " + discount + "%");
        double finalFee = fee - (fee * discount / 100);
        System.out.println("Final Fee after Discount: ₹" + finalFee);
    }
}

public class EducationalCourse {
    public static void main(String[] args) {
        Course basicCourse = new Course("Introduction to Programming", 6);
        OnlineCourse onlineCourse = new OnlineCourse("Data Structures", 8, "Coursera", true);
        PaidOnlineCourse paidCourse = new PaidOnlineCourse("Advanced Java", 10, "Udemy", true, 650, 20.0);

        System.out.println("*** Basic Course ***");
        basicCourse.displayInfo();

        System.out.println("\n*** Online Course ***");
        onlineCourse.displayInfo();

        System.out.println("\n*** Paid Online Course ***");
        paidCourse.displayInfo();
    }
}