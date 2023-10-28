/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import controller. *;
import view.PrincipalView;

/**
 *
 * @author El Rey
 */
public class PrincipalModel extends PrincipalController{
    
    public static PrincipalController principalCtr = new PrincipalController();
    public static void showPrincipalView(){principalCtr.setVisible(true);}
    public static void closePrincipalView(){principalCtr.setVisible(false);}
    
 
    /*public static void eventBttonInstruct(){
            closePrincipalView();
            showInstruct();closePrincipalView();
            showInstruct();
            System.out.println("Evento!");
            
    };*/
}
