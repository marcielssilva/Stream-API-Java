package main.java.stream_api.desafio;

import main.java.functional_interface.exemplos.ConsumerExample;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamAPIDesafio_7_segundoMaior {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> segundoMaior = numeros.stream()
                .sorted(Comparator.reverseOrder()) // ORDENA DE FORMA REVERSA
                .skip(1)// SKIPA UM INDICE
                .findFirst();// PEGA O NOVO MAIOR VALOR
        System.out.println(segundoMaior);// PRINTA O SEGUNDO MAIOR
    }
}
