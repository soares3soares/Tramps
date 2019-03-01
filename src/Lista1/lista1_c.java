package Lista1;

import java.util.Scanner;

public class lista1_c {
    public static void main (String[] args) {
        double comprimento, largura, area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o comprimento da sala: ");
        comprimento = sc.nextDouble();
        System.out.println("Informe a largura da sala: ");
        largura = sc.nextDouble();
        area = comprimento*largura;
        System.out.println("Dadas as medidads, a area total da sala é igual a: "+area+"m²");
    }
}
