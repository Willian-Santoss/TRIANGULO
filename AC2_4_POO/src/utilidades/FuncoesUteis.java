package utilidades;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FuncoesUteis { //Classe Principal

	// método que retorna a soma dos parâmetros
    public int Soma(int a, int b) {
        return a + b;
    }

    // método que imprime um triângulo com a altura especificada
    public void Triangulo(int altura) {
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("x");
            }
            System.out.println(); // cria uma nova linha após cada linha do triângulo
        }
    }

    // método que lê e imprime o conteúdo de um arquivo de texto
    public void printArquivo(String arquivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) { //permite apresentar o erro com mais clareza e complexididade quando fizer a leitura de arquivos
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
