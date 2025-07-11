package dev.sylviosoares.app;

import dev.sylviosoares.app.exception.ParametrosInvalidosException;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try (scan) {
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = scan.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = scan.nextInt();
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());
        }
    }

    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm;
        for (int i = 0; i < contagem; i++) {
            System.out.println("Imprimindo o número " + (i + 1));
        }
    }
}