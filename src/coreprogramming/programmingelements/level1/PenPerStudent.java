package coreprogramming.programmingelements.level1;
public class PenPerStudent {
    public static void main(String[] args) {
        byte pens = 14, students = 3;
        
        int penPerStudent = pens / students;
        int remaining = pens % students;

        System.out.printf("The Pen Per Student is %d and the remaining pen not distributed is %d", penPerStudent, remaining );
    }
}
