package com.cpn77;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
//declare suas variaveis corretamente
        int pos = 0;
        int neg = 0;
        int par = 0;
        int impar = 0;
        int n;



//continue a solução
        for (int c=1; c<=5; c++) {
            System.out.println("Digite um nomero: ");
            n = leitor.nextInt();
            if (n<0) {
                neg++;
            } else if (n>0) {
                pos++;
            }
            if (n%2==0) {
                par++;
            } else {
                impar++;
            }
        }
//insira suas variaveis corretamente
        System.out.println( par + " valor(es) par(es)");
        System.out.println( impar + " valor(es) impar(es)");
        System.out.println( pos + " valor(es) positivo(s)");
        System.out.println( neg + " valor(es) negativo(s)");
    }

}
