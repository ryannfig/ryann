package aocubo;
import javax.swing.JOptionPane;

public class AoCUbo {

    public static void main(String[] args) {
        double n1, cubo;
        String sn1;
        
        sn1 = JOptionPane.showInputDialog(null, "Digite um número");
        n1 = Double.parseDouble(sn1);
        cubo = n1*n1*n1;
        JOptionPane.showMessageDialog(null, "O número ao cubo é: " +cubo);
    }
}
