package main.java.stream_api.desafio;

import java.util.Arrays;
import java.util.List;

public class StreamAPIDesafio_11_somaDosQuadrados {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaDosQuadrados = numeros.stream()
                        .mapToInt(num -> num * num)// eleva ao quadrado
                        .sum(); // soma resultados

        System.out.println("A soma do Quadrado dos numeros é: " + somaDosQuadrados);
    }
}
