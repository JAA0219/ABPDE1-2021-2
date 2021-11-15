/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultorio;

import APP1.*;
import javax.lang.model.AnnotatedConstruct;
import javax.swing.table.TableModel;
import static kotlinx.html.Gen_consumer_tagsKt.label;

/**
 *
 * @author Familia
 */
public class Consultorio {

    private static Object APP1;

   
    public static void main(String[] args) {
        CONSULTORIO C1 = new CONSULTORIO();
        
        OPCION OP1 = new OPCION();
                
        Menu Mn1 = new Menu(OP1, C1);    
        
        C1.setVisible(true);
                
                
                
                
                
                
    }
    
}
