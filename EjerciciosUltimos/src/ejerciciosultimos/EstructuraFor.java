
package ejerciciosultimos;


import java.io.BufferedReader;
import java.io.InputStreamReader;


public class EstructuraFor {
    public static void main(String[] args) {
        try{
            BufferedReader leer = new BufferedReader ( new InputStreamReader(System.in));
            System.out.println("Ingresar un numero limite de repeticion: ");
            String limite = leer.readLine();
            
            instruccionFor(Integer.parseInt(limite));
        }catch (Exception e){
            System.out.println(e.getMessage ());
        }           
    }
    
     public static void instruccionFor(int valorLimite){
         
         for(int i=1; i <= valorLimite; i++){
             System.out.println("El valor de la repeticion es:" +1);
         }
     }
}
