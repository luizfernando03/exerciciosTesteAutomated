package lista1;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;



public class TestRemoveNumeroEscolhido {

    @Test
    public void testRemoverNumeroEscolhido() {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(3);
        numeros.add(5);
        numeros.add(4);
        numeros.add(2);

        int escolhido = 3;

        List<Integer> resultadoEsperado = new ArrayList<>();
        resultadoEsperado.add(1);
        resultadoEsperado.add(5);
        resultadoEsperado.add(4);
        resultadoEsperado.add(2);

        List<Integer> novaLista = RemoveNumeroEscolhido.removerNumeroEscolhido(numeros, escolhido);

        assertEquals(resultadoEsperado, novaLista);
    }

}
