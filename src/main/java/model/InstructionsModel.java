/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.JLabel;

/**
 *
 * @author El Rey
 */
public class InstructionsModel {
    private JLabel instructions = new JLabel();
    
    public JLabel getInstructions(){
        return instructions;
    }
    public void setInstructions(){
        instructions = new JLabel();
        instructions.setText("Esto es un texto de isntrucciones");
        instructions.setSize(200,200);
        instructions.setLocation(500, 500);
    };
}
