package Lista1;

import java.util.Scanner;

public class lista1_f {
    public static void main(String[] args){
        double real, cotacao, convertido;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor da conversão: ");
        real = sc.nextDouble();
        System.out.println("Informe a cotação do dolar: ");
        cotacao = sc.nextDouble();
        convertido = real/cotacao;
        System.out.println("O valor convertido em dolares vale: "+convertido);


    }
}
