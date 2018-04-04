/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.polimorfismo.modelo;

/**
 *
 * @author Estudiante
 */
public abstract class Contrato {
    private String id;
    
    public abstract double calcSalario();
    public abstract String datosPersona();

    public String getId(){
        return id;
    }
    
}
