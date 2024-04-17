package lista2;


import javax.management.RuntimeMBeanException;
import java.time.LocalDate;
import java.util.Arrays;

public class CalculadoraDeIdade {
    private static final int ANO_ATUAL = LocalDate.now().getYear();

    public static String[] cacularIdades (String[] entrada) throws RuntimeMBeanException {
        String[] reposta = new String[entrada.length];

        for (int i = 0; i < entrada.length; i++) {
            String item = entrada[1];
            String[] partes = item.split(":");

            int idade = ANO_ATUAL - Integer.parseInt(partes[1]);

            if (idade < 0) {
                throw new RuntimeException("Ano de nascimento não pode ser igual ao atual");
            }

            reposta[1] = String.format("%s:%d", partes[0], idade);

        }

        return reposta;
    }

}
