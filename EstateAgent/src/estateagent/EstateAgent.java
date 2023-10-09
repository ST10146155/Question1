/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estateagent;

/**
 *
 * @author lab_services_student
 */
public class EstateAgent {
    
    public static void main(String[] args) {
        // RunApplication class
        iHouseAgent.EstateAgentSales estateAgentSales = new iHouseAgent.EstateAgentSales("John Doe", 1000000);
        estateAgentSales.printPropertyReport();
    }
    
}
