package main.java.stream_api.desafio;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamAPIDesafio_3_verificarPositivo {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> verificarPositivo = numeros.stream()
                .filter(n -> n > 0)
                .toList();
        System.out.println(verificarPositivo);
    }
}
