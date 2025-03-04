# Student Management System

## Overview
The **Student Management System** is a Java-based console application designed to efficiently manage student records. It allows users to add, search, update, delete, and display student information using a menu-driven approach.

## Features
- **Add Student**: Register a new student by providing PRN, Name, Date of Birth, and Marks.
- **Display All Students**: View details of all registered students.
- **Search by PRN**: Retrieve student details using PRN (Permanent Registration Number).
- **Search by Name**: Locate a student by their name.
- **Search by Position**: Find a student based on their index in the list.
- **Update Student Details**: Modify an existing student’s information.
- **Delete Student**: Remove a student record from the system.
- **Exit Option**: Close the application safely.

## Technologies Used
- Java (JDK 8 or above)
- Collections Framework (ArrayList)
- Scanner class for user input

## Project Structure
```
StudentManagementSystem/
│── src/
│   ├── Main.java        # Main entry point of the program
│   ├── Student.java     # Student class containing student details
│   ├── StudentManager.java  # Manages student-related operations
│── README.md           # Documentation file
```

## How to Run the Program
### Prerequisites
Ensure you have the following installed:
- Java Development Kit (JDK 8 or later)
- Any Java-supported IDE (IntelliJ IDEA, Eclipse, VS Code) or a terminal

### Steps to Execute
1. **Clone or Download the Repository**:
   ```sh
   git clone <repository-url>
   cd StudentManagementSystem
   ```
2. **Compile the Java Files**:
   ```sh
   javac Main.java Student.java StudentManager.java
   ```
3. **Run the Application**:
   ```sh
   java Main
   ```
4. Follow the on-screen instructions to interact with the system.

## Code Explanation
- `Student.java`: Defines the **Student** class with attributes PRN, Name, Date of Birth, and Marks.
- `StudentManager.java`: Handles all student-related operations such as adding, updating, searching, and deleting students.
- `Main.java`: Contains the main method, displays a menu, and interacts with the user.

## Sample Output
```
===== Student Management System =====
1. Add Student
2. Display All Students
3. Search by PRN
4. Search by Name
5. Search by Position
6. Update Student
7. Delete Student
0. Exit
Enter your choice: 1
Enter PRN: 22080126000
Enter Name: Vedant Singh Thakur
Enter Date of Birth (DD/MM/YYYY): 01/01/2005
Enter Marks: 98
✅ Student Added Successfully!
```

## Author
- **Vedant Singh Thakur**
- PRN: 23070126144
- Batch: B3

## License
This project is open-source and available under the [MIT License](LICENSE).

---

