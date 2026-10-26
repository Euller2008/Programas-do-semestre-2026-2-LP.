package som;

public class TestaCaixaDeSom {
    public static void main(String[] args){
        CaixaDeSom caixa=new CaixaDeSom();
        caixa.adicionarEmissor(new Cachorro("Bob"));
        caixa.adicionarEmissor(new Tambor("P","Giannini"));
        caixa.adicionarEmissor(new Cachorro("Rex"));
        caixa.adicionarEmissor(new Tambor("G","toyota"));
        caixa.adicionarEmissor(new Cachorro("Xico"));
        caixa.tocarTodosOsEmissores();

    }
}
