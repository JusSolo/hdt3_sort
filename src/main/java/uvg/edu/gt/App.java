package uvg.edu.gt;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        scan.nextLine();
        Aleator aleator = new Aleator();
        Leo leo = new Leo();
        Sort<Integer> sortMago = new MergeSort<>();
        String direccion = "C:/Users/cjvil/Downloads/numeros.txt";
        //aleator.random(direccion, 3000);
        List<List<Integer>> numeros = leo.leer(direccion);
        for (int i = 0; i < numeros.size(); i++) {
            List<Integer> numerosEnLinea = numeros.get(i);

            sortMago.sort(numerosEnLinea);
        }
        System.out.println(numeros.get(101));

        /*Random rand = new Random();
         cont = 0;
        while (cont < 3000){
            ArrayList<Integer> listas = new ArrayList<>(1);
            int i = 0;
            while (i<=cont){
                listas.add(rand.nextInt(100));
                i++;
            }
            mergeSort.sort(listas);
            cont++;
            //System.out.println(listas);
        }
        System.out.println("Ejecucion terminada");*/


    }
}
