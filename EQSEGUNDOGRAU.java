package delta;
import javax.swing.JOptionPane;

public class Delta {

  
    public static void main(String[] args) {
      double A,B,C,X1,X2,delta,raiz;
      String sA, sB, sC;
      
      sA = JOptionPane.showInputDialog(null, "Digite o valor de A: ");
      sB = JOptionPane.showInputDialog(null, "Digite o valor de B ");
      sC = JOptionPane.showInputDialog(null, "Digite o valor de C: ");
      
      A = Integer.parseInt(sA);
      B = Integer.parseInt(sB);
      C = Integer.parseInt(sC);
      delta = (B*B)-4*A*C;
      raiz = Math.sqrt(delta);
      
      X1 = (-B)+raiz/2*A;
      X2 = (-B)-raiz/2*A;
      
      JOptionPane.showMessageDialog(null," O resultado de x1 é: " +X1+ " O resultado de x2 é: " +X2);
    }
    
}

