package main.java.stream_api.desafio;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIDesafio_18_verificarIgual {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosIguais = numeros.stream()
                .filter(n -> numeros.indexOf(n) != numeros.lastIndexOf(n))
                .distinct()
                .toList();

        if(!numerosIguais.isEmpty()) {
            System.out.println("Numeros iguais encontrados: " + numerosIguais);
        }else{
            System.out.println("Nenhum numero encontrado");
        }
    }
}
