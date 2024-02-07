package uvg.edu.gt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /*Aleator aleator = new Aleator();
        Leo leo = new Leo();
        String direccion = "/home/juan/Documentos/education/U/Semestres/Semestre_9/Algoritmos y Estructura/Tareas/HDT/Hdt3/src/main/java/uvg/edu/gt/numeros.txt";
        aleator.random(direccion, 25);
        List<List<Integer>> numeros = leo.leer(direccion);
        for (int i = 0; i < numeros.size(); i++) {
            System.out.print("Línea " + (i + 1) + ": ");
            List<Integer> numerosEnLinea = numeros.get(i);
            for (int j = 0; j < numerosEnLinea.size(); j++) {
                System.out.print(numerosEnLinea.get(j));
                if (j < numerosEnLinea.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }*/

        Random rand = new Random();
        MergeSort<Integer> mergeSort = new MergeSort<>();
        Integer cont = 0;
        while (cont < 3000){
            ArrayList<Integer> listas = new ArrayList<>(1);
            int i = 0;
            while (i<=cont){
                listas.add(rand.nextInt(100));
                i++;
            }
            mergeSort.sort(listas);
            cont++;
        }
        System.out.println("Ejecucion terminada");
    }
}
