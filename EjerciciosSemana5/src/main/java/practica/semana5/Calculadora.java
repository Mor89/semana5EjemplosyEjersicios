/*
1-. El ejercicio de la calculadora de la guía 2 modificarlo de tal manera que el usuario permita seleccionar que operación realizar 
S = Suma; R = Resta; M = Multiplicación y D = División, tomando en cuenta que no se puede dividir entre 0
 */
package practica.semana5;

public class Calculadora {

    private double a;
    private double b;

    public Calculadora() {
    }

    public Calculadora(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    double suma() {
        double sum = this.a + this.b;
        return sum;
    }

    double resta() {
        double resta = this.a - this.b;
        return resta;
    }

    double multiplicasion() {
        double mult = this.a * this.b;
        return mult;
    }

    double divicion() {
        double divicion = this.a / this.b;
        return divicion;
    }

}
