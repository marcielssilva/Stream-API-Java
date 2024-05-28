package main.java.stream_api.desafio;

import java.util.Arrays;
import java.util.List;

public class StreamAPIDesafio_8_somaDigitos {

    public static void main(String[] args) {
        // Definindo a lista de números
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Usando a Stream API para mapear cada número para o número de dígitos que ele contém
        int totalDigitos = numeros.stream()
                .mapToInt(StreamAPIDesafio_8_somaDigitos::contarDigitos) // Mapeia cada número para seu número de dígitos
                .sum(); // Soma os números de dígitos de todos os números da lista

        // Imprimindo o resultado
        System.out.println("O total de dígitos na lista é: " + totalDigitos);
    }

    // Método para contar o número de dígitos de um número
    public static int contarDigitos(int numero) {
        // Caso especial: se o número for 0, temos 1 dígito
        if (numero == 0) return 1;
        int contador = 0;
        // Enquanto o número não for zero, contamos um dígito e dividimos o número por 10 para
        // reduzi-lo até que não tenha mais dígitos
        while (numero != 0) {
            contador++;
            numero /= 10;
        }
        return contador; // Retorna o número de dígitos do número
    }
}

