// Name: Vedant Singh Thakur
// PRN: 23070126144
// Batch: B3

import java.util.*;
public class Main {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                StudentManager manager = new StudentManager();
                int choice;

                do {
                    System.out.println("\n===== Student Management System =====");
                    System.out.println("1. Add Student");
                    System.out.println("2. Display All Students");
                    System.out.println("3. Search by PRN");
                    System.out.println("4. Search by Name");
                    System.out.println("5. Search by Position");
                    System.out.println("6. Update Student");
                    System.out.println("7. Delete Student");
                    System.out.println("0️. Exit");
                    System.out.print("Enter your choice: ");

                    choice = sc.nextInt();

                    switch (choice) {
                        case 1:
                            manager.addStudent(sc);
                            break;
                        case 2:
                            manager.displayStudents();
                            break;
                        case 3:
                            manager.searchByPRN(sc);
                            break;
                        case 4:
                            manager.searchByName(sc);
                            break;
                        case 5:
                            manager.searchByPosition(sc);
                            break;
                        case 6:
                            manager.updateStudent(sc);
                            break;
                        case 7:
                            manager.deleteStudent(sc);
                            break;
                        case 0:
                            System.out.println(" Exiting...");
                            break;
                        default:
                            System.out.println("Invalid choice! Try again.");
                    }
                } while (choice != 0);

                sc.close();
            }
        }
