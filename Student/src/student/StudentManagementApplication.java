/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

/**
 *
 * @author lab_services_student
 */
public class StudentManagementApplication {
    public static void main(String[] args) {
        
        // Create a Student object.
        Student student = new Student(45678, "John Doe", 19, "j.doe@example.com", "Fine Arts");
        
        //Saave the student record.
        student.saveStudent();
        
        //Search for the student record.
        Student foundStudent = student.searchStudent(12345);
        
        //If the student record was found, print it.
        if (foundStudent != null) {
            foundStudent.printStudentReport();
        } else {
            System.out.println("Student with ID 45678 was not found");
        }
        
        //Delete the student record.
        student.deleteStudent(45678);
        
        //Print the student report.
        student.printStudentReport();
    }
    
}
