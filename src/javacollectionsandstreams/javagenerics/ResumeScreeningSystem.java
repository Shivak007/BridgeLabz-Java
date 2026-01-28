package javacollectionsandstreams.javagenerics;
import java.util.*;

abstract class JobRole {
    abstract String getRoleName();
}

class SoftwareEngineer extends JobRole {
    String getRoleName() { return "Software Engineer"; }
}

class DataScientist extends JobRole {
    String getRoleName() { return "Data Scientist"; }
}

class ProductManager extends JobRole {
    String getRoleName() { return "Product Manager"; }
}

class Resume<T extends JobRole> {
    private String candidateName;
    private T role;

    Resume(String candidateName, T role) {
        this.candidateName = candidateName;
        this.role = role;
    }

    String getDetails() {
        return candidateName + " - " + role.getRoleName();
    }
}

public class ResumeScreeningSystem {
    public static void main(String[] args) {
        List<Resume<? extends JobRole>> resumes = new ArrayList<>();

        resumes.add(new Resume<>("Alice", new SoftwareEngineer()));
        resumes.add(new Resume<>("Bob", new DataScientist()));
        resumes.add(new Resume<>("Charlie", new ProductManager()));

        for (Resume<? extends JobRole> r : resumes) {
            System.out.println(r.getDetails());
        }
    }
}
