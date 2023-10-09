/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package counting;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class Counting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //countByFives();
        countByAnything();
        
    }
    
    public static void countByFives()
    {
        
        int counter = 5;
        boolean firstInLine = true;
        
        while (counter <= 500)
        {
            
            if(counter %50 == 0){
                System.out.print(" " + counter + "\n");
                firstInLine = true;
            }
            else
            {
                if(firstInLine) {
                    System.out.print(counter);
                    firstInLine = false;
                }else{
                    System.out.print(" " + counter);
                }
            }
            counter = counter + 5;
        }
            
    }
    
    public static void countByAnything(){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter number to count by: ");
        int increment = scan.nextInt();
        scan.nextLine();
        
        int counter = 5;
        int lineCounter = 1;
        
        while (counter <= 500)
        {
            if(lineCounter == 10)
            {
                 System.out.print(" " + counter + "\n");
                 lineCounter = 1;
            } else if(lineCounter == 1){
                System.out.print(counter);
                lineCounter++;
            } else {
                System.out.print(" " + counter);
                lineCounter++;
            }
            
            counter = counter + increment;
        }
        
    }
            
}
