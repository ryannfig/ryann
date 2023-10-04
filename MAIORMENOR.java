package pkg3valoresinteiros;
import javax.swing.JOptionPane;
public class Main {

    public static void main(String[] args) {
      int n1, n2, n3;
      String sn1, sn2, sn3;
      
      sn1 = JOptionPane.showInputDialog(null, "Digite o primeiro número: ");
      sn2 = JOptionPane.showInputDialog(null, "Digite o segundo número: ");
      sn3 = JOptionPane.showInputDialog(null, "Digite o terceiro número: ");
      
      n1 = Integer.parseInt(sn1);
      n2 = Integer.parseInt(sn2);
      n3 = Integer.parseInt(sn3);
      
      if (n1 > n2 && n1 > n3) 
     {     
          JOptionPane.showMessageDialog(null, "N1 é maior.");    
     }   
      else if (n2 > n1 && n2 > n3) 
     {
          JOptionPane.showMessageDialog(null, "N2 é maior.");
     }     
      else if (n3 > n1 && n3 > n2)
     {
          JOptionPane.showMessageDialog(null, "N3 é maior.");
     }      
      else if (n1 == n2 && n2 == n3)
     {
          JOptionPane.showMessageDialog(null, "Números iguais.");
     }
    }
    
}
