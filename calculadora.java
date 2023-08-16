package inicio;
import javax.swing.JOptionPane;

public class INICIO {

    public static void main(String[] args) {
      double n1, n2, soma, sub, mul, divisão;
      String sn1, sn2;
      sn1 = JOptionPane.showInputDialog(null, "Digite o primeiro valor");
      sn2 = JOptionPane.showInputDialog(null, "Digite o segundo valor");
      
      n1 = Double.parseDouble(sn1);
      n2 = Double.parseDouble(sn2);
      
      soma = n1 + n2;
      sub = n1 - n2;
      mul = n1 * n2;
      divisão = n1 / n2;
      
      JOptionPane.showMessageDialog(null, "O resultado da soma é: " +soma);
      JOptionPane.showMessageDialog(null, "O resultado da subtração é: " +sub);
      JOptionPane.showMessageDialog(null, "O resultado da multiplicação é: " +mul);
      JOptionPane.showMessageDialog(null, " resultado é da divisão é:  " +divisão);
    }
    
}
