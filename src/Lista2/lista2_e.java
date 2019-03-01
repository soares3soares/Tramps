package Lista2;

import java.util.Scanner;

public class lista2_e {

    public static void main (String[] args){
    double arquivo, velocidade, tempo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o tamanho do arquivo: "+"bits/s");
        arquivo = sc.nextDouble();
        System.out.println("Informe a velocidade de download: "+"bits/s");
        velocidade = sc.nextDouble();
        tempo = arquivo/velocidade;
        System.out.println("O tempo de download: "+tempo);




    }


}
