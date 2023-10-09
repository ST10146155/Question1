package student;

import java.util.Scanner;


public class Student {

   private int ID;
   private String Name;
   private int Age;
   private String Email;
   private String Course;
   
public Student(int ID, String Name, int Age, String Email, String Course) {
   this.ID = ID;
   this.Name = Name;
   this.Age = Age;
   this.Email = Email;
   this.Course = Course;
}

 public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String Course) {
        this.Course = Course;
    }

    public void saveStudent() {
        // Save the student record to a database or file.
    }

    public Student searchStudent(int studentID) {
        // Search for the student record with the given student ID.
        return null;
    }

    public void deleteStudent(int studentID) {
        // Delete the student record with the given student ID.
    }

    public void printStudentReport() {
        // Print the student's record to the console or a file.
    }


public void displayDetails() {
    
  Scanner scanner = new Scanner(System.in);
     
    System.out.println("-----------------------------------------------");
    System.out.println("Student ID: " + ID);
    System.out.println("Student Name: " + Name);
    System.out.println("Student Age: " + Age);
    System.out.println("Student Email: " + Email);
    System.out.println("Student Course: " + Course);
    System.out.println("-----------------------------------------------");
    
    int choice = scanner.nextInt(); 
}

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       // Display the main menu
      System.out.println("STUDENT MANAGEMENT APPLICATION");
      System.out.println("*************************************************");
      System.out.println("Please enter (1) to launch menu or any other key to exit");
      
    
        int choice = scanner.nextInt();
    }
 private static void captureNewStudent() {
        Scanner scanner = new Scanner(System.in);

        // Get the student details from the user
        System.out.println("CAPTURE A NEW STUDENT");
        System.out.println("***********************************");
        System.out.println("Enter the student ID: ");
        int ID = scanner.nextInt();
        System.out.println("Enter student name: ");
        String Name = scanner.next();
        System.out.println("enter student age: ");
        int Age = scanner.nextInt();
        System.out.println("enter student email: ");
        String Email = scanner.next();
        System.out.println("enter student course: ");
        String Course = scanner.next();

        // Create a new Student object
        Student student = new Student(ID, Name, Age, Email, Course);

        // Add the student to the ArrayList
        Student.add(student);

        // Display a success message
        System.out.println("Student successfully captured!");

     
    }

 private static void searchForStudent() {
        Scanner scanner = new Scanner(System.in);

        // Get the student ID from the user
        System.out.println("SEARCH FOR A STUDENT");
        System.out.println("***********************************");
        System.out.println("Enter the student ID: ");
        int ID = scanner.nextInt();

        // Find the student in the ArrayList
        Student student = null;
        for (Student studentInList : students) {
            if (studentInList.getID() == studentID) {
                student = studentInList;
                break;
            }
        }

        // If the student was found, display their details
        if (student != null) {
            System.out.println("Student found!");
            System.out.println("Student ID: " + student.getID());
            System.out.println("Student name: " + student.getName());
            System.out.println("Student age: " + student.getAge());
            System.out.println("Student email: " + student.getEmail());
            System.out.println("Student course: " + student.getCourse());
        } else {
            System.out.println("Student not found!");
        }
        
    }
    
}
