/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiacinco;

import javax.swing.JOptionPane;

/**
 *
 * @author Rodrigo
 */
public class Operaciones {
    
    private double resultado;
    private String mensaje;
    private double resultado2;
    private double lado;
    private double radio;
    private double diagonal;
    
    public void mostrar(){
        JOptionPane.showMessageDialog(null, this.mensaje + " es : " + resultado);
    }
    
    public void CalcularAreayDiagonal(double lados){
       this.resultado = lados*lados;
       this.resultado2 = Math.sqrt(Math.pow(lados , 2) + Math.pow(lados , 2));
       this.mensaje = "El área";
    }
    
    public void CalcularCircunferenciaRadio(double radio){
        this.resultado = 2*Math.PI*radio;
        this.mensaje = "La circunferencia";
    }
    
    public void CalcularVolumenEsfera(double radio){
        this.resultado =(4/3)*Math.PI*Math.pow(radio, 3);
        this.mensaje = "El volumen de la esfera";
    }
    public void CalcularVolumenCubo(double diagonal){
        this.resultado = Math.pow((diagonal/(Math.sqrt(3)) ), 3);
        this.mensaje = "El volumen del cubo";
    }
    public void Promedio(double diagonal){
        this.resultado = diagonal/10;
        this.mensaje = "El promedio";
    }
    
}
