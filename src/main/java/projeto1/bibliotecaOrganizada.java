package projeto1;
import java.util.Scanner;
public class bibliotecaOrganizada {
    public static void main(String[] args){
        Scanner Leitor = new Scanner(System.in);
        System.out.println("Digite quantos livros serão organizados:");
        int cont= Integer.parseInt(Leitor.nextLine());
        Livros[] lista = new Livros[cont];

        for(int K=0;K<cont;K++){
            System.out.println("Digite o titulo:");
            String nome = Leitor.nextLine();
            System.out.println("Digite o nome do autor do livro:");
            String criador = Leitor.nextLine();
            System.out.println("Digite a quantidade de paginas");
            int paginas = Integer.parseInt(Leitor.nextLine());
            lista[K]= new Livros( nome, criador,paginas);
        }
        System.out.println("---------LIVROS CADASTRADOS---------");
        for(int K=0;K<cont;K++){
            System.out.println(lista[K].toString());
        }
    }
}
