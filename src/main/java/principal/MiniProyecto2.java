/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package principal;

import controller.InstructionsController;
import model.InstructionsModel;
import view.InstructionsView;

/**
 *
 * @author El Rey
 */
public class MiniProyecto2 {

    public static void main(String[] args) {
        
        InstructionsModel instructionsMod = new InstructionsModel();
        InstructionsView instructionsV = new InstructionsView();
        
        InstructionsController instructionsCtr = new InstructionsController(instructionsMod, instructionsV);
        instructionsCtr.iniciar();
        instructionsV.setVisible(true);
    }
}
