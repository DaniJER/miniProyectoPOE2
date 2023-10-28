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
public class InstructionsController extends PrincipalController{
    //public static PrincipalView principalView = new PrincipalView();
    public static PrincipalController principalCtr = new PrincipalController(); 
    public static InstructionsView instructions = new InstructionsView();
    
    
    public static void showInstruct(){instructions.setVisible(true);}
    public static void closeInstruct(){instructions.setVisible(false);}
    
    public static void eventBttonInstruct(){
        closePrincipalView();
        showInstruct();
        System.out.println("Evento!");
        
    };
    
};
