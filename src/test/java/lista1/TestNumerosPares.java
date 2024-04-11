package lista1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestNumerosPares {
    @Test
    public void testContarNumerosPares() {
        int[] numeros = {2, 3, 4, 5, 7, 8};
        int contadorPares = 0;

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                contadorPares++;
            }
        }

        assertEquals(3, contadorPares);
    }
}
