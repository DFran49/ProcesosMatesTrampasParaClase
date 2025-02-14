import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.CompletableFuture;

public class Main {
    public static void main(String[] args) {
        boolean controlador = true;

        while (controlador) {
            System.out.println("""
                Elija una de las siguientes operaciones a realizar:
                1. Operaciones aritméticas en serie
                2. Crecimiento de series
                0. Salir
                """);

            int opcion = new Scanner(System.in).nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.println("Operaciones aritméticas en serie lanzado\n");
                    lanzarProceso("aritmeticas.bat","Operaciones Aritméticas");
                }
                case 2 -> {
                    System.out.println("Crecimiento de series lanzado\n");
                    lanzarProceso("series.bat","Series");
                }
                default -> {
                    System.out.println("Adios");
                    controlador = false;
                }
            }
        }
    }

    private static void lanzarProceso(String ruta, String mensaje) {
        File bat = new File(ruta);
        ProcessBuilder creador = new ProcessBuilder("cmd.exe", "/C","start",bat.getAbsolutePath());
        Process proceso = null;
        try {
            proceso = creador.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        CompletableFuture<Process> futuro = proceso.onExit();
        futuro.thenAccept(p -> {
            System.out.println("El proceso " + mensaje + " ha terminado con código: " + p.exitValue());
        });
    }
}
