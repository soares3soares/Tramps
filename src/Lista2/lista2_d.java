package Lista2;

import java.util.Scanner;

public class lista2_d {

    public static void main (String[] args) {
       double peso, altura, imc;
       Scanner sc = new Scanner(System.in);
        System.out.println("Informe o peso: ");
        peso = sc.nextDouble();
        System.out.println("Informe a Altura: ");
        altura = sc.nextDouble();
        imc = peso/(altura*altura);
        System.out.println("Seu IMC é: "+imc);


    }
}


