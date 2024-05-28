package main.java.stream_api.desafio;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamAPIDesafio_16_agruparParImpar {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Map<Boolean, List<Integer>> resultado = numeros.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        System.out.println("Grupo dos numeros pares: " + resultado.get(true));
        System.out.println("Grupo dos numeros imopares: " + resultado.get(false));
    }
}
