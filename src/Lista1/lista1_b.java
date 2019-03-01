package Lista1;

import java.util.Scanner;

public class lista1_b {
    public static void main (String[] args){
        double totalVendas, comissao;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o total de vendas: ");
        totalVendas = sc.nextDouble();
        comissao = (totalVendas * 10)/100;
        System.out.println("A comissão é igual a: "+comissao);

    }
}
