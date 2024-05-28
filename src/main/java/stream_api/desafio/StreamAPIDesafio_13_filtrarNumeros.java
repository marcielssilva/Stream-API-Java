package main.java.stream_api.desafio;

import java.util.Arrays;
import java.util.List;

public class StreamAPIDesafio_13_filtrarNumeros {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> filtrarNumeros = numeros.stream()
                .filter(n -> n > 5 && n < 10)
                .toList();

        System.out.println("Numeros que estao dentro do intervalo de 5 e 10: " + filtrarNumeros);
    }
}
