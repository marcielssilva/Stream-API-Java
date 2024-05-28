package main.java.stream_api.desafio;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamAPIDesafio_14_encontraMaiorPrimo {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // encontra maior numero primo na lista
        Optional<Integer> maiorPrimo = numeros.stream()
                .filter(numero -> verificadorPrimo(numero))
                .max(Integer::compare);

        System.out.println("Maior primo: " + maiorPrimo.get());


    }

    // Função para verificar se um número é primo
    public static boolean verificadorPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

}
