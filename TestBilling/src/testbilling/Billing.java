/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testbilling;

/**
 *
 * @author lab_services_student
 */
public class Billing {
    public double computeBill (double price)
    {
//        double tax = price*0.08;
//        double total = price*tax;
//        return total;
        return price*1.08;
    }
    
    public double computeBill (double price, int quantity)
    {
        return price * quantity * 1.08;
    }
    
    public double computeBill (double price, int quantity, double couponValue)
    {
        return price * quantity * 1.08 - couponValue;
    }
}
