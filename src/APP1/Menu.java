/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package APP1;

/*import APP1.Menu.Opcion;*/
import java.util.Optional;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Familia
 */
public class Menu {
    private OPCION opcion;
    private CONSULTORIO consultorio;

    public Menu(OPCION opcion, CONSULTORIO consultorio) {
        this.opcion = opcion;
        this.consultorio = consultorio;
        consultorio.setMenu(this);
        consultorio.setOPCION(opcion);
    }
    
   
    }

    
    
  
    
    
    

  
 

