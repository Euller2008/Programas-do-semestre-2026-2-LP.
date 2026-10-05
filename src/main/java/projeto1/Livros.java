package projeto1;

public class Livros {
    private String titulo;
    private String autor;
    private int numPaginas;


    public Livros(String titulo,String autor){
        this.autor=autor;
        this.titulo=titulo;
        this.numPaginas=0;
    }
    public Livros(String titulo,String autor,int numPaginas){
        this.titulo=titulo;
        this.autor=autor;
        this.numPaginas = numPaginas;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public String getAutor(){
        return this.autor;
    }
    public void setAutor(String autor){
        this.autor=autor;
    }
    public int getNumPaginas(){
        return this.numPaginas;
    }
    public void setNumPaginas(int numPaginas){
        this.numPaginas=numPaginas;
    }
    public String toString(){
        return "O livro "+this.titulo+" escrito por "+this.autor+" tem "+this.numPaginas+" paginas ao total.";
    }

}
