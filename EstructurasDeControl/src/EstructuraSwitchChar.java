/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura.condicionales;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author HP
 */
public class EstructuraSwitchChar {
    public static void main(String[] args) {
         try{ //Objecto leer de la clase BufferedReader
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingresar el estado civil de la persona:");
        String estadoCivil = leer.readLine(); //Datos tipo String
        //toUpperCas combierte el contenido a mayuscula y cahrAt extrae el caracter de la posicion 0
        switchChar(estadoCivil.toUpperCase().charAt(0));
    }catch(Exception e){
             System.out.println(e.getMessage());    
      }
    }

    private static void switchChar(char estadoCivil) { //Metodo para el switch
        String mensajeEstadoCivil;
        switch(estadoCivil){//Valor o caracter a evaluar
            case 'S'://En el caso que el valor sea "S"
                mensajeEstadoCivil = "Soltero/a";
                break;//Detiene el proceso si era el valor ingresado
             case 'C'://En el caso que el valor sea "C" y asi sucesivamente
                mensajeEstadoCivil = "Casado/a";
                 break;
             case 'D':
                mensajeEstadoCivil = "Divorciado/a";
                 break;
             case 'A':
                mensajeEstadoCivil = "Acompañado/a";
                 break;
             case 'F':
                mensajeEstadoCivil = "Forever Alone";
                break;
             default: 
                 mensajeEstadoCivil = "Estadocivil erroneo!";
        }
        System.out.println("Su estado civil es: " + mensajeEstadoCivil);
    }
    
}
