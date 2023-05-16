/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.partytime;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class Partytime {

    public static void main(String[] args) {
        int age  = Integer.parseInt(JOptionPane.showInputDialog("Enter your age")) ;
        
       
       
       if (age>=35){
           JOptionPane.showMessageDialog(null, "35 and older is too old for the party");
           
       }
       else if (age >=18  ){
              String Male = "Male" ;
        String Female = "Female";
Object[] options = { Male ,Female };
            int gender = JOptionPane.showOptionDialog(null, "Gender", "Title",
     JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
     null, options, options[0]);
       
       if ( options[gender].equals("Male")) {
           JOptionPane.showMessageDialog(null, "Entry is R10");
       }
       else{
           JOptionPane.showMessageDialog(null, "Entry is free");
         }
       }
       else{
           JOptionPane.showMessageDialog(null, "You need to be 18 or older to enter");
          
       }
     
           
       
    }
}
