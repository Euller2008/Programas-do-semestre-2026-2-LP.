package figuras;

public class Triangulo implements Figura{
    private double base;
    private double altura;
    public Triangulo(double base, double altura){
        this.base = base;
        this.altura=altura;
    }
    public double calcularArea(){
        return (this.base *this.altura)/2;
    }
    public double getBase(){
        return this.base;
    }
    public void setBase(double novoLado){
        this.base =novoLado;
    }
    public double getAltura(){
        return this.altura;
    }
    public void setAltura(double novaAltura){
        this.altura=novaAltura;
    }
    public String toString(){
        return "O triângulo de lado "+this.base +" Tem área "+calcularArea();
    }


}
