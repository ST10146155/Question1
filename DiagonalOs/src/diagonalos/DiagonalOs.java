/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diagonalos;

/**
 *
 * @author lab_services_student
 */
public class DiagonalOs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        printO();
    }
    
    public static void printO()
    {
        int numberOfLines = 20;
        String spaces = " ";
        int counter = 0;
        
        while (counter < numberOfLines )
        {
            System.out.println( spaces + "O");
            spaces = spaces + " ";
            counter++;
        }
    }
    
}
