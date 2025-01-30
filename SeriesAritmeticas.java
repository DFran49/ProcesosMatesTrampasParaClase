import java.util.ArrayList;
import java.util.Scanner;

public class SeriesAritmeticas {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        System.out.println("Se van a solicitar números para la operación, si quiere términar, introduzca un número menor a 0.\n");
        int numero = 0;
        int resultado = 0;

        while (numero >= 0) {
            System.out.println("Introduzca un número para la operación:");
            numero = new Scanner(System.in).nextInt();
            if (numero>=0) {
                numeros.add(numero);
                System.out.println("Número añadido.");
            } else {
                System.out.println("Introducción de números terminada.\n");
            }
        }


        System.out.println("""
                Elija una de las siguientes operaciones a realizar:
                1. Suma
                2. Resta
                3.Multiplicación
                4. División
                """);

        if (numeros.size() <= 1) {
            System.err.println("Se deben introducir más de 1 número. Vuelva a intentarlo.");
        } else {
            int opcion = new Scanner(System.in).nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.println("SUMA:\n");
                    for (int operando : numeros) {
                        resultado += operando;
                        System.out.println(String.format("El paso actual de la suma es: %s",resultado));
                    }
                    System.out.println(String.format("\nEl resultado de la suma es: %s",resultado));
                }
                case 2 -> {
                    System.out.println("RESTA:\n");
                    for (int operando : numeros) {
                        resultado -= operando;
                        System.out.println(String.format("El paso actual de la resta es: %s",resultado));
                    }
                    System.out.println(String.format("\nEl resultado de la resta es: %s",resultado));
                }
                case 3 -> {
                    System.out.println("""
                        Elija una de las opciones para la multiplicación:
                        1. Directa
                        2. Por pasos
                        """);
                    int opcion2 = new Scanner(System.in).nextInt();
                    System.out.println("MULTIPLICACIÓN:\n");
                    resultado = 1;
                    for (int operando : numeros) {
                        resultado *= operando;
                        if (opcion2 == 2) System.out.println(String.format("El paso actual de la multiplicación es: %s",resultado));
                    }
                    System.out.println(String.format("\nEl resultado de la multiplicación es: %s",resultado));
                }
                case 4 -> {
                    System.out.println("""
                        Elija una de las opciones para la división:
                        1. Directa
                        2. Por pasos
                        """);
                    int opcion2 = new Scanner(System.in).nextInt();
                    System.out.println("DIVISIÓN:\n");
                    resultado = numeros.getFirst();
                    numeros.remove(0);
                    for (int operando : numeros) {
                        resultado /= operando;
                        if (opcion2 == 2) System.out.println(String.format("El paso actual de la división es: %s",resultado));
                    }
                    System.out.println(String.format("\nEl resultado de la división es: %s",resultado));
                }
            }
        }
    }
}
