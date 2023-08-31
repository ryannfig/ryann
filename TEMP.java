package febre;
import javax.swing.JOptionPane;
public class FEBRE {

    public static void main(String[] args) {
       double febre;
       String sfebre;
       
       sfebre = JOptionPane.showInputDialog(null, "Digite a temperatura: ");
       
       febre = Double.parseDouble(sfebre);
       
       if(febre >= 36.5)
       {
           JOptionPane.showMessageDialog(null, "Está com febre");
       }    
       else
       {
           JOptionPane.showMessageDialog(null, " Sem febre");
       }    
    }
    
}
