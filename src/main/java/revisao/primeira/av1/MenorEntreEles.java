package revisao.primeira.av1;
import java.util.Scanner;
public class MenorEntreEles {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int cont=5;
        int K = 0;
        int[] lista = new int[cont];
        while(K<cont){
            System.out.println("Digite o numero: ");
            int numero= Integer.parseInt(leitor.nextLine());
            lista[K]= numero;
            K++;
        }
        int menor= lista[0];
        for(int i=1;i<lista.length;i++){
            if(lista[i]<menor){
                menor=lista[i];
            }
        }
        System.out.println("O menor numero é "+menor);



    }
}
