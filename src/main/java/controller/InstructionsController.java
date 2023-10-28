/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.InstructionsModel;
import view.*;

/**
 *
 * @author El Rey
 */
public class InstructionsController implements ActionListener{
  
    public static InstructionsView instructionsView = new InstructionsView();
    
    public static void eventoBttonInstruct(){
        
    }

    public void instructions (ActionEvent e) {
        instructionsView.setVisible(true);
    }
    
    
    
};
