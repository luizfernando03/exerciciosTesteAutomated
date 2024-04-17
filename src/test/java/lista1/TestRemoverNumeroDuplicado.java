package lista1;

import org.junit.jupiter.api.Test; // Importa a anotação @Test para identificar o método de teste

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;  // Importa o método assertEquals para verificar igualdade

public class TestRemoverNumeroDuplicado {
    @Test
    public void testRemoveNumeroDuplicados() {
        List<Integer> numeros = Arrays.asList(3, 4, 5, 3, 2, 1, 2);                  // Criar uma lista de numeros duplicados

        List<Integer> resultadoEsperado = Arrays.asList(3, 4, 5, 2, 1);              // Criar a lista com o resultado esperado

        List<Integer> resultado = RemoverNumeroDuplicado.removerDuplicados(numeros);  // Chama o metodo a ser testado

        List<Integer> numerosRetiradosEsperados = Arrays.asList(3, 2);              // Cria a lista com os numeros esperados que foram retirados

        List<Integer> numerosRetirados = RemoverNumeroDuplicado.encontrarDuplicados(numeros);   // Chama o metodo para encontrar os numeros retirados


        assertEquals(numerosRetiradosEsperados, numerosRetirados);  // Verifica se o resultado é igual ao esperado
        assertEquals(resultadoEsperado, resultado);   // Verifica se os numeros retirados correspondem aos numeros esperados


    }

}
