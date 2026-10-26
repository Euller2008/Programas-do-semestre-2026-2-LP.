package figuras;

public class Quadrado implements Figura {
    private double lado;
    public Quadrado(double lado){
        this.lado=lado;
    }
    public double getLado(){
        return this.lado;
    }
    public void setLado(double novoLado){
        this.lado=novoLado;
    }
    public double calcularArea(){
        return this.lado*this.lado;
    }
    public String toString(){
        return "O Quadrado de lado "+ this.lado+" tem área "+ calcularArea();
    }


}
