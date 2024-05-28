package main.java.stream_api.desafio;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamAPIDesafio_10_agruparImpares {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Map<Boolean, List<Integer>> resultados = numeros.stream()
                .filter( n -> n % 2 != 0) // filtrar valores impares
                .filter(n -> n % 3 == 0 || n % 5 == 0) // filtra multiplos de 3 ou 5
                .collect(Collectors.partitioningBy(n -> n % 3 == 0)); // agrupa numeros pelo criterio de serem multiplos de 3

        System.out.println("Valores impares multiplos de 3 ou de 5.");
        System.out.println("multiplos de 3: " + resultados.get(true));
        System.out.println("multiplos de 5: " + resultados.get(false));

        //usamos collect com partitioningBy para agrupar os valores em dois grupos, aqueles que são múltiplos de 3 e aqueles que são múltiplos de 5.

    }
}
