package semana5ejemplosyejersicios;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EstructuraFor {
    public static void main(String[] args) {
        try{
            BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingresar un numero limite de repeticion");
            String limite = leer.readLine();
            
            instruccionesFor(Integer.parseInt(limite));
            
        }catch(Exception e){
            System.out.println(e.getMessage());
            
        }
    }

    private static void instruccionesFor(int valorLimite) {
        for(int i = 1; i <= valorLimite; i++){
            System.out.println("El valor de la repeticion es: " + i);
        }
        
    }
}
