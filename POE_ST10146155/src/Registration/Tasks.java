/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Registration;

/**
 *
 * @author lab_services_student
 */
public class Tasks {
    
    private String taskName;    
    private int taskNumber;
    private String taskDescription;
    private String devDetails;
    private int taskDuration;
    private String taskId;
    private String taskStatus;
    
    public Tasks(){
        this.taskName = "";
        this.taskNumber = 0;
        this.taskDescription = "";
        this.devDetails = "";
        this.taskDuration = 0;
        this.taskId = "";
        this.taskStatus = "";
    }
    
    public Tasks(String taskName, int taskNumber, String taskDescription, String devDetails, int taskDuration, String taskId, String taskStatus){
        this.taskName = taskName;
        this.taskNumber = taskNumber;
        this.taskDescription = taskDescription;
        this.devDetails = devDetails;
        this.taskDuration = taskDuration;
        this.taskId = createTaskId();
        this.taskStatus = taskStatus;
    }
    
    public String getTaskName(){
        return taskName;
    }
    public void setTaskName(String taskName){
        this.taskName = taskName;
    }
    public int getTaskNumber(){
        return taskNumber;
    }
    public void setTaskNumber(int taskNumber){
        this.taskNumber = taskNumber;
    }
    public String getTasDescription(){
        return taskDescription;
    }
    public void setTaskDescription(String taskDescription){
        this.taskDescription = taskDescription;
    }
    public String getDevDetails(){
        return devDetails;
    }
    public void setDevDetails(String devDetails){
        this.devDetails = devDetails;
    }
    public int getTaskDuration(){
        return taskDuration;
    }
    public void setTaskDuration(int taskDuration){
        this.taskDuration = taskDuration;
    }
    public String getTaskId(){
        return taskId;
    }
    public void setTaskId(String taskId){
        this.taskId = taskId;
    }
    public String getTaskStatus(){
        return taskStatus;
    }
    public void setTaskStatus(String taskStatus){
        this.taskStatus = taskStatus;
    }
    
    public boolean checkTaskDescription(){
        if (taskDescription.length() > 50){
            return false;
        } else {
            return true;
        }
    }
    
    public String createTaskId(){
        String frisrtTwoLettersofTaskName = taskName.substring(0,2);
        String taskNumberString = String.valueOf(taskNumber);
        String lastThreeLettersofDevDetails = devDetails.substring(devDetails.length() - 3);
        String taskId = frisrtTwoLettersofTaskName + ":" + taskNumberString + ":" + lastThreeLettersofDevDetails;
        return taskId;
    }
    
    public String printTaskDetails(){
        String taskDetails = taskName + "," + taskNumber + "," + taskDescription + "," + devDetails + "," + taskDuration + "," + taskId + "," + taskStatus;
        return taskDetails;
    }
    
    public int returnTotalHours(){
        int totalHours = taskDuration;
        for(int i = 1; 1 < taskNumber; i++) {
            totalHours += taskDuration;
        }
        return totalHours;
    }
}


