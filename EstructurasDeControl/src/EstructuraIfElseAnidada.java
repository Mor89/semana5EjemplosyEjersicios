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
public class EstructuraIfElseAnidada {
    public static void main(String[] args) {
        try{ //Objecto leer de la clase BufferedReader
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese la cantidad de su salario:");
        double salario = Double.parseDouble(leer.readLine());
        ifElseAnidada(salario);
    }catch(Exception e){
            System.out.println(e.getMessage());
    }
    }

  

    private static void ifElseAnidada(double salario) {
        if(salario > 235 ){//La condicion que se evalua y en caso de ser verdadera
            System.out.println("Usted gana mas del salario minimo");
        }else if(salario > 0){// Si la condicion anterior no se cumple evalua la siguiente 
            System.out.println("Usted gana menos del salario minimo");
    }else{//En caso que la condicion anterior no se cumpla se ejecuta lo sigiente
            System.out.println("Ingreso de dato erroneo!");
        }
    }    
}   

