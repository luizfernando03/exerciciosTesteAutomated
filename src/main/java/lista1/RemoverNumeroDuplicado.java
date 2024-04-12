package lista1;

import java.util.*;

public class RemoverNumeroDuplicado {
    public static void main(String[] args){
        List<Integer> numeros = Arrays.asList(3, 4, 5, 3, 2, 1, 2);
        List<Integer> resultado = removerDuplicados(numeros);
        System.out.println(resultado);

    }
    public static List<Integer> removerDuplicados(List<Integer> numeros) {
        Set<Integer> set = new LinkedHashSet<>(numeros);
        return new ArrayList<>(set);
    }


}
