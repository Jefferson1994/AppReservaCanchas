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
public class Cancha {

    private String codigo;
    private String capacidad;
    ArrayList<Estado> estado = new ArrayList();

    public Cancha(String codigo, String capacidad) {
        this.codigo = codigo;
        this.capacidad = capacidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

}
