import javax.swing.*;

public class CidadeNacimento {
    public static void main(String[]args){
        String nomeStr= JOptionPane.showInputDialog("Digite seu nome.");
        String cidadeStr= JOptionPane.showInputDialog("Digite o nome da sua cidade");
        JOptionPane.showMessageDialog(null, "Oi "+ nomeStr + "! que legal saber que voce é da cidade " + cidadeStr );
    }
}
