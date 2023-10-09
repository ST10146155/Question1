/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package countspaces;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class CountSpaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // I need to request a string from a user
        String quote = JOptionPane.showInputDialog("Enter a memorable quote: ");
        
        // I need to count the number of spaces in the strig
        int spaceCounter = 0;
        for (int i = 0; i < quote.length(); i++)
        {
            if(quote.charAt(i) == ' ')
            spaceCounter++;
        }
        
        JOptionPane.showMessageDialog(null, "There are " + spaceCounter + " spaces in the quote");
    }
    
}
