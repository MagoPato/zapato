
package registo_fer_4;

import java.util.ArrayList;
import java.util.Scanner;

public class Registo_fer_4 {

    public static void main(String[] args) {
        // TODO code application logic here
         Scanner entrada = new Scanner(System.in);
        ArrayList<Registo> Registo = new ArrayList();
        String marca, modelo;
        double talla;
        int serie;

        for (int i = 0; i < 2; i++) {
            System.out.println("DIME TU MARCA");
            marca = entrada.next();
            System.out.println("DIME TU TALLA");
            talla = entrada.nextDouble();
            System.out.println("DIME EL MODELO");
            modelo = entrada.next();
            System.out.println("DIME EL NUM DE SERIE");
            serie = entrada.nextInt();

            Registo.add(new Registo(marca, modelo, talla, serie));
        }
        for (int i = 0; i < 2; i++) {
            System.out.println(Registo.get(i));
        }
    }
}
