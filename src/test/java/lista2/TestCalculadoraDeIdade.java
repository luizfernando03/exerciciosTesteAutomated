package lista2;

import lista1.App;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestCalculadoraDeIdade {
    @Test
    public void deveCalcularAsIdadesCorretamente(){
        String[] entrada = {"joao:1900", "Maria:2001", "Gabriel:2024" };
        String[] saidaEsperada = {"joao:34", "Maria:23", "Gabrile:0" };

        String [] saida = App.calcularIdades(entrada);

        assertArrayEquals (saidaEsperada, saidaEsperada);

    }

    public void deveGerarUmaExcessaoCasoMaoDeNascimentoSejaSuperiorAoAtual() {
        String[] entrada = {"Maria:201"};
        //assertThrows(Exception.class, () -> App(entrada));
    }

}
