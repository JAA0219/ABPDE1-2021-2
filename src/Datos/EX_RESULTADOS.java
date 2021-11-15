/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author Familia
 */
import User.Registro;
import User.Usuarios;


import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class EX_RESULTADOS {
    private final Map<String, Usuarios>Usuarios;
    private Map<String, Registro>Registro;
    
    private EX_RESULTADOS(){
     
        Usuarios = new HashMap<>();
        Registro = new HashMap<>();
    }
    
    
    
    public void addUsuarios(Usuarios U) throws Exception{
    Usuarios u = Usuarios.get(U.getCorreo());
    if(u == null){
    Usuarios.put(U.getCorreo(), u);
    
    }else{
    throw new Exception("EL USUARIO YA ESTA REGISTRADO");
    }      
  }
    
    public void addRegistro(Registro x) throws Exception{
    Registro A = Registro.get(x.getCorreo());
        Object a = null;
    if (a == null){
        Registro put = Registro.put((String) x.getCorreo(), A);
    }else{
    throw new Exception("REGISTRO YA EXISTIDO");
    }
    }
    public List<Usuarios> getUsuarios(){
    List<Usuarios> li = new ArrayList<>();
    for (Map.Entry<String, Usuarios>entry : Usuarios.entrySet()){
    li.add(entry.getValue());
    }
    return li;
    }
    
    public List<Registro> getRegistroPorcedula(String ced) throws Exception{
    List<Registro> Li = new ArrayList<>();
    Registro A = Registro.get(ced);
    if (A != null){
    
    }else{
        throw new Exception("NO SE ENCUENTRA REGISTRADO");
    }
        return null;
    }
    public List<Usuarios> getUsuarioPorcedula(String ced) throws Exception{
    List<Usuarios> Li = new ArrayList<>();
    Usuarios A = Usuarios.get(ced);
    if (A != null){
    
    }else{
        throw new Exception("NO EXITE ESTA CUENTA " );
    }
        return null;
    }
    }
    
  

   
      
 

