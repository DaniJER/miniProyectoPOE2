/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.*;
import view.*;

/**
 *
 * @author El Rey
 */
public class InstructionsController implements ActionListener{
    
    private PrincipalView principalView;
    private InstructionsView instructView;
    private InstructionsModel instructModel;

    public InstructionsController(PrincipalView principalView, InstructionsView instructView, InstructionsModel instructModel) {
        this.principalView = principalView;
        this.instructView = instructView;
        this.instructModel = instructModel;
        
        principalView.buttonInstruction.addActionListener(this);
    }

    public void iniciar(){
        instructView.setTitle("Instrucciones");
        instructView.setLocationRelativeTo(null);
    
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("HOLA");
        instructModel.setInstrucView(instructView);
        instructView.setVisible(true);
    }

}
