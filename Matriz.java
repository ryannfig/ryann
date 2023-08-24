package matriz;
import javax.swing.JOptionPane;
public class MATRIZ {
    
    public static void main(String[] args) {
        int M11, M21, M31, M12, M22, M32, M13, M23, M33;
        String sM11, sM21, sM12, sM22, sM13, sM23;
        
        sM11 = JOptionPane.showInputDialog(null, "Digite a matriz M11:");
        sM21 = JOptionPane.showInputDialog(null, "Digite a matriz M21");
        sM12 = JOptionPane.showInputDialog(null, "Digite a matriz M12");
        sM22 = JOptionPane.showInputDialog(null, "Digite a matriz M22");
        sM13 = JOptionPane.showInputDialog(null, "Digite a matriz M13");
        sM23= JOptionPane.showInputDialog(null, "Digite a matriz M23");
        
        M11 = Integer.parseInt(sM11);
        M21 = Integer.parseInt(sM21);
        M12 = Integer.parseInt(sM12); 
        M22 = Integer.parseInt(sM22);
        M13 = Integer.parseInt(sM13);
        M23 = Integer.parseInt(sM23);
        
        M31 = M11+M21;
        M32 = M12+M22; 
        M33 = M13+M23;
        
        JOptionPane.showMessageDialog(null, " 3A matriz de M31 é:" +M31+ " A matriz de M32 é: " +M32+ " A matriz de M33 é: " +M33);
    }
    
}
