package main.java.stream_api.desafio;

import java.util.Arrays;
import java.util.List;

public class StreamAPIDesafio_2_somaDosPares {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        // DESAFIO 2:
        int somaDosPares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(n -> n)
                .sum();
        System.out.println("A soma dos pares: " + somaDosPares);
    }
}
