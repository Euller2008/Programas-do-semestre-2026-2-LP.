package SerHumano;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome,int idade){
        this.nome=nome;
        this.idade=idade;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String novonome){
        this.nome=novonome;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int novaIdade){
        this.idade=novaIdade;
    }
    public boolean ehDeMaior(){
        if (idade>=18){
            return true;
        }
        else{
            return false;
        }
    }




}
