package main.java.stream_api.desafio;

import java.util.Arrays;
import java.util.List;

public class StreamAPIDesafio_19_encontraSomaby {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaDosNumeros = numeros.stream()
                .filter(n -> n % 3 == 0 && n % 5 == 0)
                .mapToInt(Integer::intValue)
                .sum();

                if(!numeros.isEmpty()){
                    System.out.println("A soma dos numeros divisiveis por 3 e 5 na lista é: " + somaDosNumeros);
                }else{
                    System.out.println("Nenhum numero encontrado");
                }
    }

}
