/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CM
 */
public class suma {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Ingresar dos números.");
            return;
        }

        int x = Integer.parseInt(args[0]);
        int[] numbers = new int[args.length - 1];

        for (int i = 1; i < args.length; i++) {
            numbers[i - 1] = Integer.parseInt(args[i]);
        }

        boolean found = false;

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == x) {
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }

        if (found) {
            System.out.println("Si");
        } else {
            System.out.println("No");
        }
    }
}
