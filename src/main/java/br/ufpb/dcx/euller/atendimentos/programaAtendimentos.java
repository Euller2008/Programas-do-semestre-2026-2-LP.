package br.ufpb.dcx.euller.atendimentos;
import java.util.Scanner;
public class programaAtendimentos {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        Paciente paciente1 = new Paciente();
        Paciente paciente2 = new Paciente("Euller","16/04/2008","123.123.123.12");

        System.out.println(paciente1.getNome());
        System.out.println(paciente2.getNome());

        paciente1.setNome("Rodrigo");

        System.out.println(paciente1.getNome());

        System.out.println(paciente1.toString());
        System.out.println(paciente2.toString());


        leitor.close();
    }
}
