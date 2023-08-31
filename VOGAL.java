package vogal;
import javax.swing.JOptionPane;
public class VOGAL {

    
    public static void main(String[] args) {
      String vogal;
      
      vogal = JOptionPane.showInputDialog(null, "Digite uma letra");
      
      if((vogal.equals("A")) || (vogal.equals("E"))  ||  (vogal.equals("E")) || (vogal.equals("I")) || (vogal.equals("O")) || (vogal.equals("U")))
      {
          JOptionPane.showMessageDialog(null, "vogal");
      }
      else
      {
          JOptionPane.showMessageDialog(null, "não é vogal");
      }    
                      
    }
    
}
