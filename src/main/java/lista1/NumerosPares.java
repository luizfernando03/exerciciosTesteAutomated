package lista1;

public class NumerosPares {
    public static void main(String[] args) {
        int[] numeros = {2, 3, 4, 5, 7, 8, 10, 21};
        int contadorPares = 0;

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                contadorPares++;
            }
        }

        System.out.println("O resultado é: " + contadorPares);
    }
}
