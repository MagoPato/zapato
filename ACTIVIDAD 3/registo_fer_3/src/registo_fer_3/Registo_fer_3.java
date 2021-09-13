package registo_fer_3;

import java.util.Scanner;

public class Registo_fer_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        Registo Registo[] = new Registo[10];
        String marca, modelo;
        double talla;
        int serie;

        for (int i = 0; i < 10; i++) {
            System.out.println("DIME TU MARCA");
            marca = entrada.next();
            System.out.println("DIME TU TALLA");
            talla = entrada.nextDouble();
            System.out.println("DIME EL MODELO");
            modelo = entrada.next();
            System.out.println("DIME EL NUM DE SERIE");
            serie = entrada.nextInt();

            Registo[i] = new Registo(marca, modelo, talla, serie);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(Registo[i]);
        }
    }
}
