/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.InstructionsModel;
import view.InstructionsView;
import view.PrincipalView;

/**
 *
 * @author El Rey
 */
public class InstructionsController extends PrincipalView implements ActionListener{
    private InstructionsView instructionsView;
    private InstructionsModel instructionsModel;

    public InstructionsController(InstructionsModel instructionsModel, InstructionsView instructionsView){
        this.instructionsView = instructionsView;
        this.instructionsModel = instructionsModel;
        this.instructionsView.buttonInstructions.addListener(this);
    };
    
    public void iniciar(){
        
        instructionsView.setTitle("Instrucciones");
        instructionsView.setLocationRelativeTo(null);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        instructionsModel.getInstructions();
    }
}
