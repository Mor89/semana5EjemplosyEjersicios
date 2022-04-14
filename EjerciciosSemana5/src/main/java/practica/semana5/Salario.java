/*
 2-. La empresa Compu Smart se dedica a la venta de equipos de computación. Vende tanto computadoras como 
dispositivos periféricos y consumibles. La empresa cuenta con un grupo de 5 vendedores a los cuales les paga la comisión 
según el rango de la venta efectuada. Si el vendedor vende de $3000 en adelante la comisión es el 10%, si vende de $1000 a 
$2999 gana el 8% y si la venta es de 1$ a $999 gana un 5%. Pero cada vendedor tiene un salario base de $300 al cual se le 
suma el valor de la comisión por ventas. Determinar el salario líquido de un vendedor según el monto de la venta realizada
tomando en cuenta que se descuenta el 10% en concepto de renta.
 */
package practica.semana5;

public class Salario {
   double venta;
    public Salario() {
    }

    public Salario(double venta) {
        this.venta = venta;
    }

    public double getVenta() {
        return venta;
    }

    public void setVenta(double venta) {
        this.venta = venta;
    }
   
    double salario(){
        double salarioliquido = 0;
        double renta;
        if(this.venta == 3000){
            double vent;
            double salarioBase = 300;
            vent = this.venta * 0.10;
            renta = (salarioBase + vent)*0.10;
            salarioliquido = (salarioBase + vent)-renta;
            return salarioliquido;
        }else if(venta >= 1000 && venta <= 2999){
            double vent;
            double salarioBase = 300;
            vent = this.venta * 0.08;
            renta = (salarioBase + vent)*0.10;
            salarioliquido = (salarioBase + vent)-renta;
            return salarioliquido;
        }else if(venta >= 1 && venta <= 999){
            double vent;
            double salarioBase = 300;
            vent = this.venta * 0.05;
            renta = (salarioBase + vent) * 0.10;
            salarioliquido = (salarioBase + vent) - renta;
            return salarioliquido;
        }
        return salarioliquido;
    }
}
