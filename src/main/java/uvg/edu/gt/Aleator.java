package uvg.edu.gt;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Random;

public class Aleator {


    public void random(String rutaArchivo, int n) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo))) {
            Random random = new Random();
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j < i; j++) {
                    int numeroAleatorio = random.nextInt(10000);
                    writer.write(String.valueOf(numeroAleatorio));
                    if (j < i - 1) {
                        writer.write(", "); // Separador entre números en la misma línea
                    }
                }
                writer.newLine(); // Salto de línea al final de cada conjunto de números
            }
            System.out.println("Archivo generado exitosamente.");
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }

}
