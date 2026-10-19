package SerHumano;
import java.util.Scanner;
import java.util.ArrayList;
public class TestaPessoas {

    public static void main(String[] args){
        Scanner Leitor = new Scanner(System.in);
        ArrayList<Pessoa> pessoas = new ArrayList();
        int cont=0;
        while(cont<5){
            System.out.println("Digite o nome");
            String nome = Leitor.nextLine();
            int idade = Integer.parseInt(Leitor.nextLine());
            Pessoa pessoa = new Pessoa(nome, idade);
            pessoas.add(pessoa);
            cont++;
        }
        for(Pessoa p : pessoas){
            if(p.ehDeMaior()){
                System.out.println(p.getNome()+" é de maior");
            }
            else{
                System.out.println(p.getNome()+" é de menor");
            }
        }
    }
}
