package figuras;
import java.util.ArrayList;

public class CalculadoraDeAreas {
    public static void main(String[] args){
        ArrayList<Figura> figuras = new ArrayList<>();
        figuras.add (new Quadrado(2));
        figuras.add(new Triangulo(3,4));
        double areaTotal=0;
        for(Figura c: figuras) {
            System.out.println(c.calcularArea());
            areaTotal+=c.calcularArea();
        }
        System.out.println("a area total é "+areaTotal);
    }
}
