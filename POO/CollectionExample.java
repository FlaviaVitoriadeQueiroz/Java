import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CollectionExample {

    public static void main(String[] args) {
        // Criando conjunto com generics
        Set<Character> conjunto = new HashSet<>();
        for (char c = 'A'; c <= 'J'; c++) {
            conjunto.add(c);
        }
        conjunto.add(null); // Adicionando null no final

        // Criando mapa com generics
        Map<Character, Integer> mapa = new HashMap<>();
        int index = 0;
        for (char c = 'A'; c <= 'J'; c++) {
            mapa.put(c, index);
            index++;
        }

        // Percorrendo o conjunto e tratando NullPointerException
        for (Character ch : conjunto) {
            try {
                System.out.println(ch.toString()); // Pode lançar NullPointerException
            } catch (NullPointerException e) {
                System.out.println("Exceção capturada: null encontrado no conjunto.");
                writeFile("erro.txt");
            }
        }

        // Exemplo de impressão do mapa
        System.out.println("\nConteúdo do mapa:");
        for (Map.Entry<Character, Integer> entry : mapa.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static void writeFile(String fileName) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            bw.write("Erro ao percorrer coleção!");
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }
}
