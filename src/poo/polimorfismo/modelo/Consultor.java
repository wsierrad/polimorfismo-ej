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
public class Consultor extends Contrato{
    private String labor;

    @Override
    public double calcSalario() {
        return 220;
    }

    @Override
    public String datosPersona() {
        String datos;
        datos = "Id: " + super.getId() + " Labor: " + this.labor; 
        return datos;
    }

}
