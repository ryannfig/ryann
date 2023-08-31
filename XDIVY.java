package xdivy;
import javax.swing.JOptionPane;
public class XDIVY {

    public static void main(String[] args) {
        double X, Y, MOD;
        String sX, sY;
        
        sX = JOptionPane.showInputDialog(null, "Digite o valor de X: ");
        sY = JOptionPane.showInputDialog(null, "Digite o valor de Y");
        
        X = Double.parseDouble(sX);
        Y = Double.parseDouble(sY);
        MOD = X % Y;
        if(MOD == 0)
        {
            JOptionPane.showMessageDialog(null, "X é divisível por Y.");
        }  
        else
        {
            JOptionPane.showMessageDialog(null, "X não é divisível por Y.");
        }    
    }
    
}
