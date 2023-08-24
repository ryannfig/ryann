package salario;
import javax.swing.JOptionPane;

public class Salario {

    
    public static void main(String[] args) {
      double x1, sal, Res;
      String sx1;
      
      sx1 = JOptionPane.showInputDialog(null, "Salário: ");
      x1 = Double.parseDouble(sx1);
      
      sal = 0.14*x1-x1;
      Res = -(sal);
      JOptionPane.showMessageDialog(null,"Salário com 14% de desconto do INSS: " +Res);
    }
    
}
