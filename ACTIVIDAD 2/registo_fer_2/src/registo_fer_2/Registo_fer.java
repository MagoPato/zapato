package registo_fer_2;

import java.util.Scanner;

public class Registo_fer {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        Registo Registo[] = new Registo[10];

        for (int i = 0; i < 10; i++) {
            Registo[i] = new Registo();
            System.out.println("DIME TU MARCA");
            Registo[i].setMarca(entrada.next());
            System.out.println("DIME TU TALLA");
            Registo[i].setTalla(entrada.nextDouble());
            System.out.println("DIME EL MODELO");
            Registo[i].setModelo(entrada.next());
            System.out.println("DIME EL NUM DE SERIE");
            Registo[i].setSerie(entrada.nextInt());
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(Registo[i]);
        }
    }
}
