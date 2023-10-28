/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
//import view. *;

import model.PrincipalModel;
import view.PrincipalView;

/**
 *
 * @author El Rey
 */
public class PrincipalController extends PrincipalView {
    public static PrincipalView principalView = new PrincipalView();
    public static PrincipalModel principalModel = new PrincipalModel();
    public static void showP(){principalModel.showPrincipalView();};
    //
    //public static void showP(){principalModel.};

    //public static showPrincipalView(){principalModel.showPrincipalView();}
    
}
