package ejercicio.ocho;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class PruebaExcep {

    public static void main(String[] args) {
        //ingresarEdad();
        //jugarRuleta();
        agregarNumerosArray();
    }

    public static boolean ingresarEdad() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la edad: ");

        try {
            int edad = sc.nextInt();
            if (edad < 18) {
                throw new IllegalArgumentException("La persona es menor de edad");
            }
            return true;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return false;
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
            return false;
        }

    }

    public static boolean jugarRuleta() {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int numeroRandom = random.nextInt(10) + 1;

        System.out.println("Ingrese el numero de la ruleta: ");

        try {
            int numeroElegido = sc.nextInt();
            if (numeroElegido != numeroRandom) {
                System.out.println("El numero es: " + numeroRandom);
                throw new IllegalArgumentException("El numero elegido no es el correcto");
            } else {
                System.out.println("El numero es: " + numeroRandom);
                System.out.println("El numero elegido es el correcto!");
                return true;
            }

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return false;
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
            return false;
        }

    }

    public static void agregarNumerosArray() {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];

        System.out.println("Ingrese 5 numeros enteros para llenar el arreglo");

        try {
            for (int i = 0; i < array.length; i++) {
                System.out.println("Ingrese el numero para la posicion " + (i + 1));
                array[i] = sc.nextInt();
            }
        } catch (InputMismatchException e) {
            System.out.println("No ha ingresado un numero entero");
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        }

        System.out.println("Se imprimiran 7 numeros del arreglo");
        try {
            for (int i = 0; i < 7; i++) {
                System.out.println("Numero en la posicion " + (i + 1) + " es: " + array[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Se ha intentado acceder a una posicion inexistente del arreglo");
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        }
    }
}
