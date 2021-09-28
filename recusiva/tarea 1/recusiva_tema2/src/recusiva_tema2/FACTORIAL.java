package recusiva_tema2;

import java.util.Scanner;

public class FACTORIAL {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int n;
        System.out.println("dime dime un numero para saber el factorial");
        n = teclado.nextInt();
        System.out.println("el facotiral de "+n+" es");
        System.out.println("resultado del FACTORIAL sin recusiva " + factorialCiclo(n));
        System.out.println("resultado del FACTORIAL con recusiva " + factorial(n));
    }

    static int factorialCiclo(int n) {
        int FACTORIAL = 1;
        for (int i = 1; i <= n; i++) {
            FACTORIAL *=i;
        }
        return FACTORIAL;
    }

    static int factorial(int n) {
        if (n==0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
