package triplo;
import javax.swing.JOptionPane;

public class Triplo {

    public static void main(String[] args) {
    double x1, x2, x3, somatrip;
    String sx1, sx2, sx3;
    
   sx1 = JOptionPane.showInputDialog(null, "Digite o primeiro número: ");
   sx2 = JOptionPane.showInputDialog(null, "Digite o segundo numero: ");
   sx3 = JOptionPane.showInputDialog(null, "Digite o terceiro numero: ");
   
   x1 = Double.parseDouble(sx1);
   x2 = Double.parseDouble(sx2);
   x3 = Double.parseDouble(sx3);
   somatrip = (x1+x2+x3)*3;
   
   JOptionPane.showMessageDialog(null, "A soma dos tres numeros multiplicado por 3 é igual a: " +somatrip);
    }
    
}
