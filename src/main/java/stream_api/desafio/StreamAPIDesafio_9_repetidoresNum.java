package main.java.stream_api.desafio;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIDesafio_9_repetidoresNum {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //Filtra apenas os numeros que possuem masi que uma ocorrência na lista
        List<Integer> repetidos = numeros.stream()
                .filter(num -> numeros.indexOf(num) != numeros.lastIndexOf(num))
                .distinct() // remove duplicatas
                .collect(Collectors.toList());

        if(!repetidos.isEmpty()) {
            System.out.println("Numeros repetidos: " + repetidos);
        }else{
            System.out.println("Nao ha numeros repetidos");
        }
    }
}
