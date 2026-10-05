package revisao.primeira.av1;

public class AtendimentoMedico {
    private String codigoAtendimento;
    private String diaAtendimento;
    private String categoriaAtendimento;

    public AtendimentoMedico(String codigoAtendimento,String diaAtendimento,String categoriaAtendimento){
        this.codigoAtendimento = codigoAtendimento;
        this.diaAtendimento = diaAtendimento;
        this.diaAtendimento = diaAtendimento;
    }
    public String getcodigoAtendimento(){
        return this.codigoAtendimento;
    }
    public void setcodigoAtendimento( String codigoAtendimento){
        this.codigoAtendimento = codigoAtendimento;
    }
    public String getdiaAtendimento(){
        return this.diaAtendimento;
    }
    public void setdiaAtendimento(String diaAtendimento){
        this.diaAtendimento = diaAtendimento;
    }
    public String getcategoriaAtendimento(){
        return this.categoriaAtendimento;
    }
    public void setcategoriaAtendimento( String categoriaAtendimento){
        this.categoriaAtendimento = categoriaAtendimento;
    }
    public String toString() {
        return "O codigo de atendimento é " + this.codigoAtendimento + "e o dia do atendimento foi " + this.diaAtendimento + ", a categoria foi " + this.categoriaAtendimento;
    }
}
