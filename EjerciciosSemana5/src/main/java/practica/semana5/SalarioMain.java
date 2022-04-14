
package practica.semana5;

import java.util.Scanner;

public class SalarioMain {
    public static void main(String[] args) {
        double salario;
        Scanner leer = new Scanner(System.in);
        
        Salario sal = new Salario();
        
        for(int i=1; i <=5; i++ ){
            try{
            System.out.println("introdusca las ventas de los vendedores: "+i);
            sal.setVenta(leer.nextDouble());
            }catch(NumberFormatException ex1){
                System.out.println(ex1.getMessage());
            }
            salario = sal.salario();
            
            System.out.println("El salario es: $"+salario);
        }
        
    }
}
