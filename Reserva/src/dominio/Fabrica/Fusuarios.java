/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio.Fabrica;
import dominio.usecase.RegistrarEmpresa;
import dominio.usecase.RegistrarCliente;
import dominio.ICuentaUE;
/**
 *
 * @author Jefferson_Sarango
 */
public class Fusuarios {
    
    public ICuentaUE RegistroUsuario(String us){
        
        if (us.equalsIgnoreCase("usuario")) {
            return new RegistrarCliente();
            
            
        }if (us.equalsIgnoreCase("empresa")) {
            return new RegistrarEmpresa();
            
            
        }
        return null;
        
    }
    
}
