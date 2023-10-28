/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import view. *;
/**
 *
 * @author El Rey
 */
public class PrincipalController {
    
    //Metodos para abrir y cerrar la ventana principal del juego
    public static PrincipalView principalView = new PrincipalView();
    public static void showPrincipalView(){principalView.setVisible(true);};
    public static void closePrincipalView(){principalView.setVisible(false);};
}
