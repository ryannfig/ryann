package pkgelse;
import javax.swing.JOptionPane;
public class Else {

    public static void main(String[] args) {
        int n1, n2;
        String sn1, sn2;
        
        sn1 = JOptionPane.showInputDialog(null, "Digite o valor: ");
        sn2 = JOptionPane.showInputDialog(null, "Digite outro valor: ");
        
        n1 = Integer.parseInt(sn1);
        n2 = Integer.parseInt(sn2);
        
        if(n1 >= n2)
        {
           JOptionPane.showMessageDialog(null, "n1 é maior que n2");
        }    
        else
        {
           JOptionPane.showMessageDialog(null, "n1 é menor que n2");
        }    
    }
    
}
