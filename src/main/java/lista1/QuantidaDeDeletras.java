package lista1;

import java.util.Scanner;

public class QuantidaDeDeletras {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String frase = scanner.nextLine();
        int quantidadeLetras = encontrarQuantidadeLetras(frase);
        System.out.println("A quantidade de letras : " + quantidadeLetras);
        scanner.close();
    }

    public static int encontrarQuantidadeLetras(String frase) {
        String[] palavras = frase.split(" ");
        String ultimaPalavra = palavras[palavras.length - 1];
        return ultimaPalavra.length();
    }
}
