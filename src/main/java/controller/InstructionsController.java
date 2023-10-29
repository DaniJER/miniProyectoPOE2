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
public class InstructionsController extends InstructionsView implements ActionListener{
    
    public static PrincipalView principalView = new PrincipalView();
    public static InstructionsModel intructionsModel = new InstructionsModel();
    //public static void ActbttonInstruc(){instructionsModel};

    
    @Override
    public void actionPerformed(ActionEvent e) {
        principalView.getButtonInstruction();
        
    }
    
    
};
