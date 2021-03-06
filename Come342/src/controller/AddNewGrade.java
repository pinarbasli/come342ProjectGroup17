
package controller;

import helper.Utils;
import come342.Database;
import model.Grade;

public class AddNewGrade {
    private static final AddNewGrade instance = new AddNewGrade();
    public static AddNewGrade getInstance() {
        return instance;
    }
    
    private AddNewGrade(){
    }
    
    public void run (){
        this.createNewGrade();
    }
  
    private void createNewGrade() {
        Utils.println("Enter name of the grade: ");
        String name = Utils.scanString();
        Grade grade = new Grade(name);
        
        ChangeRateForGrade.getInstance().init(grade);
        
        Database.gradeList.add(grade);
        
        Utils.println("Grade created succesfully.");
    }
}
