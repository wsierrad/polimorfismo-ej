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
public class Empleado extends Contrato {
    private String nombre;
    private double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    @Override
    public double calcSalario() {
        return this.salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String datosPersona() {
        String datos;
        datos = "Nombre: " + this.nombre + " Salario: " + this.salario;
        return datos;
    }
    
    

 
}
