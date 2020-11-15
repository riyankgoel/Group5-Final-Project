/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group5.pkgfinal.project;

import javax.swing.JRadioButton;

/**
 *
 * @author theodore
 * Use this class for multiple choice type games. 
 * Please refer to the "BermsGame" class to understand how this code works.
 */
public class RadioButtonMultipleChoice {

    String isCorrect;
    JRadioButton button;
    Boolean isTrue;
    
    public RadioButtonMultipleChoice(Boolean isTrue, String question) {
        button = new JRadioButton(question);

        if (isTrue == true) {
            isCorrect = "correct";
            isTrue = true;
        } else {
            isCorrect = "incorrect";
            isTrue = false;
        }
    }

    public void changeIsCorrect(Boolean inputIsTrue) {       
        if (inputIsTrue == true) {
            isCorrect = "correct";
            isTrue = true;
        } else {
            isCorrect = "incorrect";
            isTrue = false;
        }
        
    }
    
    public void changeButtonText(String string) {
        button.setText(string);
    }
}

