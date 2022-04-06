package semana5ejemplosyejersicios;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class EstructuraSwitchInt {
    public static void main(String[] args) {
        try{
            BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingresar un numero entre 1 y 5 :");
            int numero = Integer.parseInt(leer.readLine());
            switchInt(numero);

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void switchInt(int numero) {
        String nombreDelNumero;
        switch(numero){
            case 1:
                nombreDelNumero = "UNO";
                break;
            case 2:
                nombreDelNumero = "DOS";
                break;
            case 3:
                nombreDelNumero = "TRES";
                break;
            case 4:
                nombreDelNumero = "CUATRO";
                break;
            case 5:
                nombreDelNumero = "CINCO";
                break;

            default:
                nombreDelNumero = "Numero no valido";

        }

        System.out.println("El numero ingresado es:" + nombreDelNumero);
    }
}
