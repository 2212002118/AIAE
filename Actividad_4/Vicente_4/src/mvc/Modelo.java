/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc;

/**
 *
 * @author JVLL
 */
public class Modelo {
    private double A;
    private double B;
    private double resultado;
    private String operacion;

    public Modelo(double A, double B, double resultado) {
        this.A = A;
        this.B = B;
        this.resultado = resultado;
    }

    public Modelo() {
    }

    public double getA() {
        return A;
    }

    public void setA(double A) {
        this.A = A;
    }

    public double getB() {
        return B;
    }

    public void setB(double B) {
        this.B = B;
    }

    public double getResultado() {
        return resultado;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
    
    public void obtenerResultado(){
        if("+".equals(operacion))
            resultado=A+B;
        else if("-".equals(operacion))
            resultado=A-B;
        if("x".equals(operacion))
            resultado=A*B;
        else if("/".equals(operacion))
            resultado=A/B;
    }
}
