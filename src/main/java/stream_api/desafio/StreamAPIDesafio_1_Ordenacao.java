package main.java.stream_api.desafio;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPIDesafio_1_Ordenacao {
    // atributos
 public static void main(String[] args) {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
    // DESAFIO 1
    List<Integer> numerosOrdenados = numeros.stream()
            .sorted()
            .toList();
     System.out.println("Lista em Ordem Crescente: " + numerosOrdenados);

    }



}
