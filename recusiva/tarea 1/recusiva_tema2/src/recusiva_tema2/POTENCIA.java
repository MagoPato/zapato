
package recusiva_tema2;

import java.util.Scanner;

public class POTENCIA {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int n,x;
        System.out.println("dime un numero ");
        n = teclado.nextInt();
        System.out.println("dime el Exponente ");
        x = teclado.nextInt();
        
        System.out.println("el numero "+n+" elevado a "+x+" es");
        System.out.println("resultado del portencia sin recusiva " + potenciaCiclo(n,x));
        System.out.println("resultado del portencia con recusiva " + potencia(n,x));
    }
    static int potenciaCiclo(int n , int x) {
        int portencia = 1;
        for (int i =0; i < x; i++) {
            portencia *=n;
        }
        return portencia;
    }

    static int potencia(int n,int x) {
        if(x==0){
            return 1;
        } else if (x<0) {
            return potencia(n, x+1) / n;
        } else {
            return n * potencia(n, x-1);
        }
    }
}
