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
public class Programador extends Empleado {
    private String lenguajeExp;

    public Programador(String lenguajeExp, String nombre, double salario) {
        super(nombre, salario);
        this.lenguajeExp = lenguajeExp;
    }
    
    @Override
    public double calcSalario(){
        double salario = super.getSalario();
        if (lenguajeExp.equalsIgnoreCase("Java"))
            salario *= 1.2;
        return salario;
    }

    public String getLenguajeExp() {
        return lenguajeExp;
    }

    public void setLenguajeExp(String lenguajeExp) {
        this.lenguajeExp = lenguajeExp;
    }
    
    
}
