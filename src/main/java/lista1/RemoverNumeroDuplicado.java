package lista1;

import java.util.*;

public class RemoverNumeroDuplicado {
    public static void main(String[] args){
        List<Integer> numeros = Arrays.asList(3, 4, 5, 3, 2, 1, 2);
        List<Integer> resultado = removerDuplicados(numeros);

        List<Integer> numerosRetirados = encontrarDuplicados(numeros);

        System.out.println("Números retirados: " + numerosRetirados);
        System.out.println("Números sem duplicação: " + resultado);

    }
    public static List<Integer> removerDuplicados(List<Integer> numeros) {
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
