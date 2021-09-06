package registo_fer;

import java.util.Arrays;
import java.util.Scanner;

public class Registo_fer {

    public static void main(String[] args) {
        // TODO code application logic here
       Scanner entrada = new Scanner(System.in);

        int n = 10;
        String Marca[] = new String[n];
        int talla[] = new int[n];
        double serie[] = new double[n];
        String modelo[] = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("DIME TU MARCA");
            Marca[i] = entrada.next();
            System.out.println("DIME TU TALLA");
            talla[i] = entrada.nextInt();
            System.out.println("DIME EL MODELO");
            modelo[i] = entrada.next();
            System.out.println("DIME EL NUM DE SERIE");
            serie[i] = entrada.nextDouble();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(" MARCA:    " + Marca[i]);
            System.out.println(" MODELO:   " + modelo[i]);
            System.out.println(" SERIE: " + serie[i]);
            System.out.println(" TALLA   " + talla[i]);
            if (i!=n-1) {
                System.out.println("_________ ");
            }
        }
    }
}
