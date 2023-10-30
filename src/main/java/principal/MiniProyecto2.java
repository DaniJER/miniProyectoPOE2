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
        
        PrincipalController principalC = new PrincipalController();
        PrincipalView pView = new PrincipalView();
        InstructionsView iView = new InstructionsView();
        InstructionsModel iModel = new InstructionsModel();
        InstructionsController iController = new InstructionsController(pView,iView,iModel);
        iController.iniciar();
        
        principalC.showP();    
        PlayModel playM = new PlayModel();
        PlayView playV = new PlayView();
        PlayController playC = new PlayController();
        
        
        

    }
}
