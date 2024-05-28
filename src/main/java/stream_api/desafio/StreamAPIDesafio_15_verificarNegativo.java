package main.java.stream_api.desafio;

import java.util.Arrays;
import java.util.List;

public class StreamAPIDesafio_15_verificarNegativo {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> encontrarNegativo = numeros.stream()
                .filter(n -> n < 0)
                .toList();

        if(!encontrarNegativo.isEmpty()){
            System.out.println("Numeros negativos : " + encontrarNegativo);
        }else{
            System.out.println("Numeros negativos não encontrado");
        }
    }
}
