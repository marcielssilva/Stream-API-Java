package main.java.stream_api.desafio;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class StreamAPIDesafio_5_calcularMedia {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        List<Integer> calcularMedia = numeros.stream()
                .filter(n -> n > 5)
                .toList();

        int soma = calcularMedia.stream()
                .mapToInt(Integer::intValue)
                .sum();

        int media = soma / numeros.size();

        System.out.println("A media dos numeros maiores que 5: " + media);
    }

}
