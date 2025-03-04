import java.util.*;

public class StudentManager {
    private ArrayList<Student> studentList;

    public StudentManager() {
        studentList = new ArrayList<>();
    }

    public void addStudent(Scanner sc) {
        System.out.print("Enter PRN: ");
        String prn = sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Date of Birth(DD/MM/YYYY): ");
        String dob = sc.nextLine();
        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        studentList.add(new Student(prn, name, dob, marks));
        System.out.print("Student Added Successfully!\n");

    }

    public void displayStudents() {
        if (studentList.isEmpty()) {
            System.out.println("Nothing to show!");
            return;
        }
        for (Student s : studentList) {
            System.out.println(s);
            s.displayStudent();
        }
    }

}
