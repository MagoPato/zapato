package recusiva_tema2;

import java.util.Scanner;

public class FIBONACCI {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int n;
        System.out.println("dime un numero para saber que numero es de Fibonacci ");
        n = teclado.nextInt();

        System.out.println("el numero " + n +" en Fibonacci es");
        System.out.println("resultado de Fibonacci sin recusiva " + fibonacciCiclo(n));
        System.out.println("resultado de Fibonacci con recusiva " + fibonacci(n));
    }

    static int fibonacciCiclo(int n) {
        int a = 0, b = 1;
        for (int i = 1; i < n; i++) {
        b=b+a;
        a=b-a;
        }
        return b;
    }

    static int fibonacci(int n) {
        if (n < 2) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
