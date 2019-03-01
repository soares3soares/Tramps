package Lista1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class lista1_d {
    public static void main (String[] args){
        double salario, porcentagem, novoSalario = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe seu salário: ");
        salario = sc.nextDouble();
        System.out.println("Informe um numero real entre 0 e 1, para o calculo de reajuste");
        porcentagem = sc.nextDouble();
        while ((porcentagem < 0) || (porcentagem > 1)){
            System.out.println("Digite um valor válido!!");
            porcentagem = sc.nextDouble();
        }
        if ((porcentagem >= 0) && (porcentagem <= 1) ){
            novoSalario = (salario*porcentagem) + salario;

        }
        System.out.println("O novo salário será igual a: "+novoSalario);
    }
}
