package velmedia;
import javax.swing.JOptionPane;
public class VelMedia {

    public static void main(String[] args) {
        int km;
        String skm;
        
        skm = JOptionPane.showInputDialog(null, "Digite o valor da velocidade: ");
        
         km = Integer.parseInt(skm);
         
         if (km >= 110)
         {
             JOptionPane.showMessageDialog(null, "Ultrapassa o limite indicado.");
         }    
         else
         {
             JOptionPane.showMessageDialog(null, "Inferior ao limite indicado.");
         }    
    }
    
}
