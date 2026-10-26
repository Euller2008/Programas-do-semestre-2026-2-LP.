package livro;

public class Livro {
    private String autor;
    private String titulo;
    public Livro(String autor, String titulo){
        this.autor=autor;
        this.titulo=titulo;
    }
    public String getAutor(){
        return this.autor;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public void setAutor(String novoAutor){
        this.autor=novoAutor;
    }
    public void setTitulo(String novoTitulo){
        this.titulo=novoTitulo;
    }
}
