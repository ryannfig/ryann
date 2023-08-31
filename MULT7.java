package multiplosete;
import javax.swing.JOptionPane;
public class MULTIPLOSETE {

    public static void main(String[] args) {
       double M, res;
       String sM;
       
       sM =  JOptionPane.showInputDialog(null, "Digite o numero: ");
       
       M = Double.parseDouble(sM);
       
       res = M % 7;
       
       if(res == 0)
       {
        JOptionPane.showMessageDialog(null, "O  número " +M+ " é multiplo de sete");
       }    
       else
       {
        JOptionPane.showMessageDialog(null, "O número " +M+ " não é multiplo de sete");   
       }    
    }
    
}
