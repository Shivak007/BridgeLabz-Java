package javacollectionsandstreams.javagenerics;
import java.util.*;

abstract class CourseType {
    abstract String getEvaluationType();
}

class ExamCourse extends CourseType {
    String getEvaluationType() { return "Exam Based"; }
}

class AssignmentCourse extends CourseType {
    String getEvaluationType() { return "Assignment Based"; }
}

class ResearchCourse extends CourseType {
    String getEvaluationType() { return "Research Based"; }
}

class Course<T extends CourseType> {
    private String name;
    private T type;

    Course(String name, T type) {
        this.name = name;
        this.type = type;
    }

    String getDetails() {
        return name + " - " + type.getEvaluationType();
    }
}

public class UniversityCourseManagement {
    public static void main(String[] args) {
        List<Course<? extends CourseType>> courses = new ArrayList<>();

        courses.add(new Course<>("Algorithms", new ExamCourse()));
        courses.add(new Course<>("AI Project", new ResearchCourse()));
        courses.add(new Course<>("Java Lab", new AssignmentCourse()));

        for (Course<? extends CourseType> c : courses) {
            System.out.println(c.getDetails());
        }
    }
}

