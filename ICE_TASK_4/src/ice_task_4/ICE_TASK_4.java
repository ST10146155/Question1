/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ice_task_4;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class ICE_TASK_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int studentPercentage;
        char gradeLetter;
        
        studentPercentage = Integer.parseInt(JOptionPane.showInputDialog("Enter a student's percentage: "));
        
        if ((studentPercentage >= 90) && (studentPercentage <= 100))
            {gradeLetter = 'A'; 
            System.out.println("Student has received an " + gradeLetter + " grade");
        }
        else if ((studentPercentage >= 80) && (studentPercentage <= 89))
            {gradeLetter = 'B';
            System.out.println("Student has received a " + gradeLetter + " grade");        
        }
        else if ((studentPercentage >= 70) && (studentPercentage <= 79))
            {gradeLetter = 'C';
            System.out.println("Student has received a " + gradeLetter + " grade");        
        }
        else if ((studentPercentage >= 60) && (studentPercentage <= 69))
            {gradeLetter = 'D';
            System.out.println("Student has received a " + gradeLetter + " grade");        
        }
        else {gradeLetter = 'F';
            System.out.println("Student has received an " + gradeLetter + " grade");        
        }

    }
    }
    

