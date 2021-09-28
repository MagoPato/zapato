package recusiva_tema2;

import java.util.Scanner;

public class Recusiva_tema2 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int n;
        System.out.println("dime hasta que numero quieres saber la sumatoria ");
        n=teclado.nextInt();
        System.out.println("resultado de la sumatoria sin recusiva "+sumatoriaCiclo(n));
        System.out.println("resultado de la sumatoria con recusiva "+sumatoria(n));
    }

    static int sumatoriaCiclo(int n) {
        int suma = 0;
        for (int i = 1; i <=n; i++) {
            suma += i;
        }
        return suma;
    }

    static int sumatoria(int n) {
        if (n == 1) //caso base
        {
            return 1;
        } else {
            return n + sumatoria(n - 1);
        }
    }
}
