/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad4;

import acciones.calculadora;
import java.util.Scanner;

/**
 *
 * @author aleja
 */
public class Actividad4 {

    public static void main(String[] args) {
        
        Scanner contEnt = new Scanner(System.in);
        boolean salir = false;

        while (!salir) { 
            System.out.println("\nMenú:");
            System.out.println("1. suma");
            System.out.println("2. resta");
            System.out.println("3. multiplicacion");
            System.out.println("4. division");
            System.out.println("5. potencia");
            System.out.println("6. raiz");
            System.out.println("7. Salir");          
            System.out.print("Seleccione una opcion: ");

            String opcion = contEnt.nextLine();

            switch (opcion) {
                
                case "uno":
                    System.out.println("ingrese su primer digito");
                    int a = contEnt.nextInt();
                    System.out.println("lo sumaremos con");
                    System.out.println("ingrese su segundo digito");
                    int b = contEnt.nextInt();
                    calculadora.sumar(a, b);                                            
                    break;
                    
                    
                case "dos":
                    System.out.println("ingrese su primer digito");
                    int ab = contEnt.nextInt();
                    System.out.println("lo restaremos con");
                    System.out.println("ingrese su segundo digito");
                    int bc = contEnt.nextInt();
                    calculadora.restar(ab, bc);
                    break;
                    
                    
                case "tres":
                    System.out.println("ingrese su primer digito");
                    int aa = contEnt.nextInt();
                    System.out.println("lo multiplicaremos con");
                    System.out.println("ingrese su segundo digito");
                    int bb = contEnt.nextInt();
                    calculadora.multi(aa, bb);                   
                    break;
                    
                    
                case "cuatro":
                    System.out.println("ingrese su primer digito");
                    int an = contEnt.nextInt();
                    System.out.println("lo diviremos con");
                    System.out.println("ingrese su segundo digito");
                    int bn = contEnt.nextInt();
                    calculadora.div(an, bn);                                     
                    break;
                    
                case "cinco":
                    System.out.println("ingrese su primer digito");
                    int av = contEnt.nextInt();
                    System.out.println("lo elebaremos a");
                    System.out.println("ingrese su segundo digito");
                    int bv = contEnt.nextInt(); 
                    calculadora.pot(av, bv);
                    break;
                    
                case "seis":
                    System.out.println("ingrese el numero, para obtener su raiz");
                    int ad = contEnt.nextInt();
                    calculadora.raiz(ad);
                    break;
                    
                case "siete":
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }
        }
        contEnt.close();
    }      
}

