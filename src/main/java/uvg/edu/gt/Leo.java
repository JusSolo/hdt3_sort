package uvg.edu.gt;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class Leo {
    public static List<List<Integer>> leer(String rutaArchivo) {
        List<List<Integer>> numerosPorLinea = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] numerosString = linea.split(", ");
                List<Integer> numerosEnLinea = new ArrayList<>();
                for (String numeroStr : numerosString) {
                    numerosEnLinea.add(Integer.parseInt(numeroStr));
                }
                numerosPorLinea.add(numerosEnLinea);
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
        return numerosPorLinea;
    }
}
