import java.util.ArrayList;
import java.util.Scanner;

public class series {
    public static void main(String[] args) {
        int resultado = 0;
        boolean bucle = true;

        while (bucle) {
            System.out.println("Introduzca un número para partir:");
            int numero = new Scanner(System.in).nextInt();

            System.out.println("""
            Elija una de las siguientes operaciones a realizar:
            1. Factorial
            2. Serie
            0. Salir
            """);

            int opcion = new Scanner(System.in).nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.println("FACTORIAL:\n");

                    System.out.println("Introduzca cuantas veces quiere aumentarlo:");
                    int fac = new Scanner(System.in).nextInt();
                    for (int i = 0; i < fac; i++) {
                        resultado += numero;
                        numero++;
                        System.out.println(String.format("El paso actual del factorial es: %s",resultado));
                    }
                    System.out.println(String.format("\nEl resultado del factorial es: %s",resultado));
                }
                case 2 -> {
                    System.out.println("SERIE:\n");
                    System.out.println("Introduzca cuantas veces quiere aumentarlo:");
                    int aum = new Scanner(System.in).nextInt();
                    System.out.println("\nIntroduzca cuanto quiere que se aumente el número cada vez:");
                    int fac = new Scanner(System.in).nextInt();
                    resultado = numero;
                    for (int i = 0; i < aum; i++) {
                        resultado += fac;
                        System.out.println(String.format("El paso actual de la secuencia es: %s",resultado));
                    }
                    System.out.println(String.format("\nEl resultado de la secuencia es: %s",resultado));
                }
                default -> {
                    System.out.println("Adios");
                    bucle = false;
                }
            }
        }
    }
}
