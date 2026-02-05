package javacollectionsandstreams.javaiostreams;
import java.io.*;

public class StudentDataStream {

    public static void main(String[] args) {

        String filePath = "data/javaiostreams/datastreams/student.dat";

        try (DataOutputStream dos =
                     new DataOutputStream(new FileOutputStream(filePath))) {

            dos.writeInt(101);
            dos.writeUTF("Shiva");
            dos.writeDouble(8.75);

            System.out.println("Student data written successfully");

        } catch (IOException e) {
            System.out.println("Error writing student data");
        }

        try (DataInputStream dis =
                     new DataInputStream(new FileInputStream(filePath))) {

            int rollNo = dis.readInt();
            String name = dis.readUTF();
            double gpa = dis.readDouble();

            System.out.println("Student Data Read:");
            System.out.println("Roll No: " + rollNo);
            System.out.println("Name: " + name);
            System.out.println("GPA: " + gpa);

        } catch (IOException e) {
            System.out.println("Error reading student data");
        }
    }
}
