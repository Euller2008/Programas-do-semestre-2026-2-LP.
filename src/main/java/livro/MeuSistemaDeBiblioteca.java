package livro;
import java.util.ArrayList;

public class MeuSistemaDeBiblioteca implements SistemaBiblioteca {
    private ArrayList<Livro> biblioteca=new ArrayList<>();
    public MeuSistemaDeBiblioteca(){
        this.biblioteca=new ArrayList<>();}
    public void cadastrarLivro(Livro l){
        biblioteca.add(l);
    }
    public Livro pesquisarLivro(String titulo){
        for(Livro l: this.biblioteca){
            if(l.getTitulo().equalsIgnoreCase(titulo)){
                return l;

            }
        } return null;
    }
}
