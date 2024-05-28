package main.java.stream_api.desafio;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamAPIDesafio_17_filtrarPrimos {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> encontrarPrimo = numeros.stream()
                .filter(n -> verificadorPrimo(n))
                .toList();

        if(!encontrarPrimo.isEmpty()){
            System.out.println("Numeros Primos encontrados: " + encontrarPrimo);
        }else{
            System.out.println("Não há numeros Primos encontrados");
        }

    }
    // Função para verificar se um número é primo
    public static boolean verificadorPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
