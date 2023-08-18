package eqseggrau;
import javax.swing.JOptionPane;
public class EQSEGGRAU {

    public static void main(String[] args) {
        int A, B, C, EQ;
        double raiz;
        String sA, sB, sC;
        
        sA = JOptionPane.showInputDialog(null, "Escreva o primeiro numero: ");
        sB = JOptionPane.showInputDialog(null, "Escreva o segundo numero: ");
        sC = JOptionPane.showInputDialog(null, "Escreva o terceiro numero: ");
        
        A = Integer.parseInt(sA);
        B = Integer.parseInt(sB);
        C = Integer.parseInt(sC);
         
        EQ = (B*B)-4*(A)*(C);
        raiz = Math.sqrt(EQ);
        JOptionPane.showMessageDialog(null, "O resultado da equação é: " +raiz);
    }
    
}
