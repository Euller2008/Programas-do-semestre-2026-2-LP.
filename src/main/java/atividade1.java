import javax.swing.*;

public class atividade1 {
    public static void main(String[]args){
        String pesoStr= JOptionPane.showInputDialog("Digite seu peso");
        double peso= Double.parseDouble(pesoStr);
        String alturaStr= JOptionPane.showInputDialog("Digite sua altura");
        double altura= Double.parseDouble(alturaStr);
        double imc= peso/(altura*altura);
        JOptionPane.showMessageDialog(null, "Seu IMC é" + imc );
    }
}