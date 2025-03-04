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

    public void searchByPRN(Scanner sc) {
        System.out.print("Enter PRN to search: ");
        String prn = sc.next();
        for (Student s : studentList) {
            if (s.getPrn().equals(prn)) {
                System.out.println("Student Found:");
                s.displayStudent();
                return;
            }
        }
        System.out.println("Student not found!");
    }

    public void searchByName(Scanner sc) {
        System.out.print("Enter Name to search: ");
        String name = sc.next();
        for (Student s : studentList) {
            if (s.getName().equalsIgnoreCase(name)) {
                System.out.println("Student Found:");
                s.displayStudent();
                return;
            }
        }
        System.out.println("Student not found!");
    }

    public void updateStudent(Scanner sc) {
        System.out.print("Enter PRN to update details: ");
        String prn = sc.next();
        for (Student s : studentList) {
            if (s.getPrn().equals(prn)) {
                System.out.print("Enter new Name: ");
                s.setName(sc.next());
                System.out.print("Enter new Date of Birth: ");
                s.setDob(sc.next());
                System.out.print("Enter new Marks: ");
                s.setMarks(sc.nextDouble());

                System.out.println("Student details updated!");
                return;
            }
        }
        System.out.println("Student not found!");
    }

}
