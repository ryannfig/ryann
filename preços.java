package preços;
import javax.swing.JOptionPane;
public class Preços {

    public static void main(String[] args) {
       double p1, p2;
       String sp1, sp2;
       
       sp1 = JOptionPane.showInputDialog(null, "Digite o primeiro valor: ");
       sp2 = JOptionPane.showInputDialog(null, "Digite o segundo valor: ");
       
       p1 = Double.parseDouble(sp1);
       p2 = Double.parseDouble(sp2);
       
       if(p1 > p2)
       {
           JOptionPane.showMessageDialog(null, "O produto 1 é mais caro");
       }    
       else
       {
           JOptionPane.showMessageDialog(null, "O produto 2 é mais caro");
       }    
    }
    
}
