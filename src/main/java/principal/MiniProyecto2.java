/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package principal;
import controller.InstructionsController;
import controller.PrincipalController;
import model.InstructionsModel;
import view.InstructionsView;
import model.*;
import controller.*;
import view.*;

/**
 *
 * @author El Rey
 */
public class MiniProyecto2 {

    public static void main(String[] args) {
        PrincipalController.showPrincipalView();     
        PlayModel playM = new PlayModel();
        PlayView playV = new PlayView();
        PlayController playC = new PlayController();
    }
}
