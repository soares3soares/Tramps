package Lista1;

import java.util.Scanner;

public class lista1_e {
    public static void main (String[] args){
        double valorCompra, percentual, novoValor = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor da compra");
        valorCompra = sc.nextDouble();
        System.out.println("Informe um valor de desconto entre 0 e 1: ");
        percentual = sc.nextDouble();
        while ((percentual < 0) || (percentual > 1)){
            System.out.println("Digite um valor válido!! ");
            percentual = sc.nextDouble();
        }
        if ((percentual >= 0) && (percentual <= 1) ){
            novoValor = valorCompra - (valorCompra*percentual);

        }
        System.out.println("O valor a ser pago será de: "+novoValor);
    }
}
