
package ejerciciosultimos;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class CalcularIntereSimple {
     public static void main(String[] args) {
        try{
            BufferedReader leer = new BufferedReader ( new InputStreamReader(System.in));
            System.out.println("INGRESAR LA SIGUIENTE INFORMACION: ");
            System.out.println("Cantidad de dinero depositada");
            double cantidad = Double.parseDouble(leer.readLine());
            System.out.println("Cantidad del deposito");
            int años = Integer.parseInt(leer.readLine());
            System.out.println("Intereses anual por el deposito");
            double intereses = Double.parseDouble(leer.readLine());
            System.out.println("--------------------------------");
            InteresSimple(cantidad, años, intereses);  
        }catch (Exception e){
            System.out.println(e.getMessage ());
            
        }
        
    }
      public static void InteresSimple(double cantidad, int años, double intereses){
    for (int i = 1; i <= años ; i++){
        double InteresPorAño = cantidad * (intereses / 100);
        System.out.println("Cantidad interes en el año " + i + ":" + InteresPorAño);
        System.out.println("Monto interes mas dinero" + cantidad);
        System.out.println("-----------------------------------"); 
    }
}
    
}
