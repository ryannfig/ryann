package resto;
import javax.swing.JOptionPane;
/**
 *
 * @author ryann
 */
public class RESTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int n1, n2, resto;
      String sn1, sn2;
       
     sn1 = JOptionPane.showInputDialog(null, "Escolha um numero");
     sn2 = JOptionPane.showInputDialog(null, "Escolha outro numero");
     
     n1 = Integer.parseInt(sn1);
     n2 = Integer.parseInt(sn2);
     
     resto = n1%n2;
     
     JOptionPane.showMessageDialog(null, "O resto da divisão é: " +resto);
    }
    
}
