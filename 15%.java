package quinzeporcento;
import javax.swing.JOptionPane;

public class Quinzeporcento {

    public static void main(String[] args) {
      Double  n1, res;
      String sn1;
      
      sn1 = JOptionPane.showInputDialog(null, "Defina o salário do trabalhador: ");
      n1 = Double.parseDouble(sn1);
      res = 0.15*n1+n1;
      JOptionPane.showMessageDialog(null,"Ao adicionar 15%, o salário sobe para: " +res);
    }
    
}
