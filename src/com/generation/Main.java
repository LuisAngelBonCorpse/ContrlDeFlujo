package com.generation;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // IF
        Scanner sc = new Scanner(System.in);
        /*
        System.out.println("Ingresa tu edad");
        int edad = sc.nextInt();

        System.out.println("¿Cuál es tu nombre?");
        sc.nextLine();  //limpiamos el enter se toma como un string y se almacena en el siguiente next line que se queda al ingresar la edad
        String nombre = sc.nextLine();

        if (edad > 18){
            System.out.println("Felicidades "+ nombre + ", puedes votar");
        } else {
            System.out.println("Aún no puedes votar " + nombre + ".");
        }

        sc.close(); // para destruir el objeto scanner de memoria
        */

        System.out.println("Ingresa el primer número");
        int num1 = sc.nextInt();
        System.out.println("Ingresa el segundo número");
        int num2 = sc.nextInt();
        System.out.println("Ingresa la operación deseada: \n1) Suma \n2) Resta \n3) Producto \n4) Division");
        int ope = sc.nextInt();
        sc.close();
        float resultado = 0;

        switch (ope) {
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                resultado = num1 * num2;
                break;
            case 4:
                resultado = (float)(num1 / num2);
                break;
            default:
                System.out.println("Selección invalida.");
                break;
        }
        System.out.println("El resultado es: " + resultado );
    }
}


