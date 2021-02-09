/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio.entitis;

import java.util.ArrayList;

/**
 *
 * @author Jefferson_Sarango
 */
public class Empresa {
    private String Nombre;
    private String Direccion;
    private String Usuario;
    private String Password;
    private String Telefono;
    private String email;
    ArrayList<Cancha> cancha = new ArrayList();

    public Empresa(String Nombre, String Direccion, String Usuario, String Password, String Telefono, String email) {
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Usuario = Usuario;
        this.Password = Password;
        this.Telefono = Telefono;
        this.email = email;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

 
    
    
}
