package br.ufpb.dcx.euller.atendimentos;

public class Paciente {
    private String nome;
    private String cpf;
    private String datanascimento;
    private Endereco endereco;

    public Paciente(){
        this.nome = "sem nome";
        this.cpf = "CPF";
        this.datanascimento =  "01/01/2001";
        this.endereco = new Endereco();

    }
    public Paciente(String nome, String datanascimento, String cpf ){
        this.nome = nome;
        this.datanascimento = datanascimento;
        this.cpf = cpf;
        this.endereco = new Endereco();
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String novonome){
        this.nome=novonome;
    }
    public String toString(){
        return "Paciente de nome "+this.nome+" que nasceu no dia "+this.datanascimento;
    }
}

