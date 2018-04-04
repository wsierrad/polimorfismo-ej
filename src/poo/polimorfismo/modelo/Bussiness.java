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
public class Bussiness {
    private ArrayList<Contrato> contratos;
    
    public double calcSalarioTotal(){
        double total=0;
        for (Contrato c : contratos)
            total += c.calcSalario();
        return total;
    }
    
    public boolean addContrato (Contrato c){
        return contratos.add(c);
    }
}
