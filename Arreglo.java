/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CM
 */
public class Arreglo {
     public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Ingrese un número entero");
            return;
        }

        int[] numbers = new int[args.length];
        int arreglo = 0;

        for (int i = 0; i < args.length; i++) {
            try {
                numbers[i] = Integer.parseInt(args[i]);
                arreglo += numbers[i];
                System.out.println(numbers[i] + ", " + arreglo);
            } catch (NumberFormatException e) {
                System.out.println("El número ingresado no es un entero");
            }
        }
    }
}
