/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package blooddata;

/**
 *
 * @author lab_services_student
 */
public class BloodData {

   String bloodType;
   String rhFactor;
   
   public BloodData(){
      bloodType = "O";
      rhFactor = "+";
   }
   
    BloodData(String bloodType, String rhFactor){
        this.bloodType = bloodType;
        this.rhFactor = rhFactor;
    }  
    
    public String getBloodType(){
        return bloodType;
    }
    
    public void setBloodType(String bloodType){
        this.bloodType = bloodType;
    }
    
     public String getRhFactor(){
        return rhFactor;
    }
     
     public void setRhFactor(String rhFactor){
         this.rhFactor = rhFactor;
     }
}
