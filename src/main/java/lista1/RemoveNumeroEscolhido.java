package lista1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveNumeroEscolhido {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(3);
        numeros.add(5);
        numeros.add(4);
        numeros.add(2);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número que deseja remover: ");
        int escolhido = scanner.nextInt();

        List<Integer> novaLista = removerNumeroEscolhido(numeros, escolhido);

        System.out.println(novaLista);
    }

    public static List<Integer> removerNumeroEscolhido(List<Integer> numeros, int escolhido) {
        List<Integer> novaLista = new ArrayList<>();

        for (int numero : numeros) {
            if (numero != escolhido) {
                novaLista.add(numero);
            }
        }

        return novaLista;
    }
}
