package br.ufpb.dcx.euller.primeirosprogramas;

import java.io.IOException;
import java.util.Scanner;

public class teste1 { // Nome da classe igual ao nome do arquivo
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int A = leitor.nextInt();
        int B = leitor.nextInt();

        int X = A + B;

        System.out.println("X = " + X);

        leitor.close();
    }
}
