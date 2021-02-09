/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio.usecase;

import dominio.entitis.Empresa;
import dominio.entitis.Cliente;
import dominio.ICuentaUE;

/**
 *
 * @author Jefferson_Sarango
 */
public class RegistrarCliente implements ICuentaUE {

    @Override
    public void RegistrarUsuarios(String nombre,String apellido,String cedula,String usuario,String pasword,String telefono,String mail) {
        
        if (pasword.length()>10) {
            Cliente a = new Cliente(nombre, apellido, cedula, usuario, pasword, telefono, mail);       
            System.out.println("se creo el usuario correctamente con el nombre    "+a.getNombre());
            
            
        }else{
             System.out.println("la contrasenoa es muy corta no se pyede validar");
        }
        
        
    }

    @Override
    public void RegistarEmpresa(String nombre, String direccion, String usuario, String pasword, String email, String telefono) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
