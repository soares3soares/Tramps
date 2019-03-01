package Lista2;

import java.util.Scanner;

public class lista2_a {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     double km, litro, consumoMedio;
        System.out.println("Informe a quilometragem percorrida: ");
        km = sc.nextDouble();
        System.out.println("Informe o valor de combustivel gasto: ");
        litro = sc.nextDouble();
        consumoMedio = km/litro;
        System.out.println("O consumo médio foi de: "+consumoMedio+" Km/l");
    }


}
