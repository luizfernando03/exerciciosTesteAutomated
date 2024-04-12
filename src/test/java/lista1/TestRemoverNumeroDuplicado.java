package lista1;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRemoverNumeroDuplicado {
    @Test
    public void testRemoveNumeroDuplicados() {
        List<Integer> numeros = Arrays.asList(3, 4, 5, 3, 2, 1, 2);
        List<Integer> resultadoEsperado = Arrays.asList(3, 4, 5, 2, 1);
        List<Integer> resultado = RemoverNumeroDuplicado.removerDuplicados(numeros);

        numeros.removeAll(resultado);
        System.out.println("Números retirados: " + numeros);

        System.out.println("Números sem duplicação: " + resultado);

        assertEquals(resultadoEsperado, resultado);


    }

}
