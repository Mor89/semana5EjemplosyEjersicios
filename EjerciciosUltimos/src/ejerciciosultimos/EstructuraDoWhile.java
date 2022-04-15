
package ejerciciosultimos;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class EstructuraDoWhile {
    public static void main(String[] args) {
        
    
    try{
            BufferedReader leer = new BufferedReader ( new InputStreamReader(System.in));
            System.out.println("Ingresar un numero limite de repeticion: ");
            String limite = leer.readLine();
            
            instruccionDoWhile(Integer.parseInt(limite));
        }catch (Exception e){
            System.out.println(e.getMessage ());
            
        }
        
        }
    public static void  instruccionDoWhile (int valorLimite){

        int i = 1;
        do{
        System.out.println(" El valor de la repeticion es:" + i);
         i++;
    
        }while( i <=valorLimite);


    }
}
