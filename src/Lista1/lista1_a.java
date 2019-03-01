package Lista1;

import java.util.Scanner;

public class lista1_a {
    public static void main (String[] args) {
        double num, dobro;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número real qualquer: ");
        num = sc.nextDouble();
        dobro = num*2;
        System.out.println("Dobro de "+num+" é igual a "+dobro);
    }
}
