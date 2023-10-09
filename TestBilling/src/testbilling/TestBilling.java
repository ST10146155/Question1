/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testbilling;

/**
 *
 * @author lab_services_student
 */
public class TestBilling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Billing b = new Billing();
    
    System.out.println("The price for a book is R: " + b.computeBill(12));
    System.out.println("The price for  2 books is R: " + b.computeBill(12, 3));
    System.out.println("The price for 3 books, for a customer with a R21 coupon : " + "is R" + b.computeBill(12, 3, 24));
}
}
