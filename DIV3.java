package div3;
import javax.swing.JOptionPane;
public class DIV3 {


    public static void main(String[] args) {
       double n;
       String sn;
       
       sn = JOptionPane.showInputDialog(null, "Digite o número: ");
       
       n = Double.parseDouble(sn);
       
       
       if((n % 2 == 0) && (n % 3 == 0))
       {
           JOptionPane.showMessageDialog(null, "O número " +n+ " é par e divisível por 3.");
       }    
       else
       {
          JOptionPane.showMessageDialog(null, "O número " +n+ " não é divisível por 3."); 
       }    
       
    }
    
}
