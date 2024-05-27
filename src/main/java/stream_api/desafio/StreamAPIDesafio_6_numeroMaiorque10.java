package main.java.stream_api.desafio;

import java.util.Arrays;
import java.util.List;

public class StreamAPIDesafio_6_numeroMaiorque10 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 19, 10, 5, 4, 3);

        List<Integer> numeroMaiorQue10 = numeros.stream()
                .filter(n -> n > 10)
                .toList();

        System.out.println("Numeros maiores que 10: " + numeroMaiorQue10);


    }
}
