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

        List<Integer> numerosRetiradosEsperados = Arrays.asList(3, 2);
        List<Integer> numerosRetirados = RemoverNumeroDuplicado.encontrarDuplicados(numeros);

        assertEquals(numerosRetiradosEsperados, numerosRetirados);
        assertEquals(resultadoEsperado, resultado);


    }

}
