package revisao.primeira.av1;
import java.util.Scanner;
public class ProgramaAtendimentosMedicos {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a quantidade de consultas");
        int numConsultas = Integer.parseInt(leitor.nextLine());
        AtendimentoMedico[] atendimento = new AtendimentoMedico[numConsultas];
        for (int K = 0; K < numConsultas; K++) {
            System.out.println("Qual o codigo de atendimento?");
            String codigoAtendimento = leitor.nextLine();
            System.out.println("Que dia a consulta");
            String diaConsulta = leitor.nextLine();
            System.out.println("Qual a categoria? Clinica, ortopedica ou cardiologica?");
            String categoriaConsulta = leitor.nextLine().toUpperCase();
            atendimento[K] = new AtendimentoMedico(codigoAtendimento, diaConsulta, categoriaConsulta);
        }
        imprimeAtendimentos(atendimento);
    }

    private static void imprimeAtendimentos(AtendimentoMedico[] atendimento){
        int K=0;
        while(K<atendimento.length){
            System.out.println("O codigo é "+atendimento[K].getcodigoAtendimento()+" No dia "+atendimento[K].getdiaAtendimento()+". A categoria é "+atendimento[K].getcategoriaAtendimento());
            K++;
        }

    }

}
