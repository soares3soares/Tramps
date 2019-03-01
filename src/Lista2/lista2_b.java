package Lista2;

import java.util.Scanner;

public class lista2_b {

    public static void main (String[] args) {
        double comprimento, largura, area, preco, valor;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o comprimento da sala: ");
        comprimento = sc.nextDouble();
        System.out.println("Informe a largura da sala: ");
        largura = sc.nextDouble();
        System.out.println("Informe o valor do M²: ");
        preco = sc.nextDouble();
        area = comprimento*largura;
        valor = area*preco;
        System.out.println("O custo total para forrar o piso da sala será: "+valor);
    }
}


