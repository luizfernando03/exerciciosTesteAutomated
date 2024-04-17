package lista1;

import java.util.*;

public class RemoverNumeroDuplicado {
    public static void main(String[] args){
        List<Integer> numeros = Arrays.asList(3, 4, 5, 3, 2, 1, 2);  //// Criando  lista de numeros com duplicados.

        // Chamando o metodo para remover os numeros  duplicados
        List<Integer> resultado = removerDuplicados(numeros);

        List<Integer> numerosRetirados = encontrarDuplicados(numeros);   // Encontrar os numeros que foram retirados.


        System.out.println("Numeros retirados: " + numerosRetirados);   // Exibir os numeros retirados

        System.out.println("Numeros sem duplicação: " + resultado);  // Exibir os numeros sem duplicação

    }
    public static List<Integer> removerDuplicados(List<Integer> numeros) {  // Método para encontrar os numeros duplicados
        Set<Integer> set = new LinkedHashSet<>(numeros);
        return new ArrayList<>(set);
    }
    public static List<Integer> encontrarDuplicados(List<Integer> numeros) {
        Set<Integer> numerosUnicos = new HashSet<>();
        List<Integer> duplicados = new ArrayList<>();

        for (Integer numero : numeros) {
            if (!numerosUnicos.add(numero)) {
                duplicados.add(numero);
            }
        }
        return duplicados;
    }


}
