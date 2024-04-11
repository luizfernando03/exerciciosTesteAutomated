package lista1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestApp {

    @Test
    public void testSoma() {
        //preparar
        App app = new App();


        //Executar a função a se testada
        int resultado = App.somar(1,1);

        //Verificar o resultado
        assertEquals(2, resultado);
    }

    @Test
    public void testarSomaDeNumerosDiferentes() {

        int resultado = App.somar(2, 4);

        assertEquals(6, resultado);
    }

}
