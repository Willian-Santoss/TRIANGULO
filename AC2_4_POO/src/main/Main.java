package main;

import utilidades.FuncoesUteis;

public class Main {

    public static void main(String[] args) {
        FuncoesUteis util = new FuncoesUteis();
        
        // método para apresentar o resultado da Soma
        int resultadoSoma = util.Soma(5, 10);
        System.out.println("Resultado da Soma: " + resultadoSoma);

        // método para apresentar o resultado do Triangulo
        System.out.println("Triângulo de altura 5:");
        util.Triangulo(5);

        // método printArquivo para apresentar o código compeloto do aquivo FuncoesUteis
        System.out.println("Conteúdo do arquivo:");
        util.printArquivo("C:\\Users\\igor6\\eclipse-workspace\\AC2_4_POO\\src\\utilidades\\FuncoesUteis.java");
    }
}