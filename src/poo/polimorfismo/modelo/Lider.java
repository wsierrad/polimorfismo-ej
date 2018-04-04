/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.polimorfismo.modelo;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Lider extends Programador {
    private ArrayList<Programador> programadores;
    
    public Lider(String lenguajeExp, String nombre, double salario) {
        super(lenguajeExp, nombre, salario);
        programadores = new ArrayList<>();
    }
    
    @Override
    public double calcSalario (){
        double salario = super.calcSalario();
        int cant = programadores.size();
        salario += salario * 0.1 * cant; 
        return salario;
    }
}
