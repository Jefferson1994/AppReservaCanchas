/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adaptadores;

import dominio.Fabrica.Fusuarios;
import dominio.ICuentaUE;

/**
 *
 * @author Jefferson_Sarango
 */
public class CuentaEmpresa {
    private ICuentaUE Empresa;
   

   
    
    public void Registrar(String nombre, String direccion, String usuario, String pass,String  email, String telefono){
        Fusuarios fabrica= new Fusuarios();
        ICuentaUE a= fabrica.RegistroUsuario("empresa");
        a.RegistarEmpresa(nombre, direccion, usuario, pass, email, telefono);
        
    }
}
