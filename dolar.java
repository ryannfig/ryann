package dolarr;
import javax.swing.JOptionPane;

public class DolarR {

    public static void main(String[] args) {
       double n1, dolar;
       String sn1;
       
      sn1 = JOptionPane.showInputDialog(null, "Digie um  numero: ");
       
      n1 = Double.parseDouble(sn1);
      dolar = n1*5;
      
      JOptionPane.showMessageDialog(null,"O valor em dolar é: " +dolar);
    }
    
}
