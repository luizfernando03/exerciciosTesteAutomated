package lista2;

public class TestCalculadoraApp {
    public static String[] calcularIdades(String[] entrada) {
        String [] reposta =  new String[entrada.length];

        for(int i = 0; i < entrada.length; i++) {
            String item = entrada[i];
            String[] partes = item.split(":");

            int idade = 2024 - Integer.parseInt(partes[1]);

            String resultado = partes[0] + ":" +idade;
            reposta[i] = String.format("%S:%d");

        }

        return reposta;
    }
}
