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
public class CuentaCliente {
    private ICuentaUE cliente;
   

   
    
    public void Registrar(String nombre, String apellido, String cedula, String usuario,String  pasword, String telefon, String  mail){
        Fusuarios fabrica= new Fusuarios();
         ICuentaUE a= fabrica.RegistroUsuario("usuario");
        a.RegistrarUsuarios(nombre, apellido, cedula, usuario, pasword, telefon, mail);
        
    }
    
}
