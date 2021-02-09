/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import dominio.entitis.Empresa;
import dominio.entitis.Cliente;

/**
 *
 * @author Jefferson_Sarango
 */
public interface ICuentaUE {
    
    public void   RegistrarUsuarios(String nombre,String apellido,String cedula,String usuario,String pasword,String telefono,String mail);
    public  void  RegistarEmpresa(String nombre,String direccion,String usuario,String pasword,String email,String telefono);
    
}
