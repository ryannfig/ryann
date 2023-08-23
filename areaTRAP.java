package areatrap;
import javax.swing.JOptionPane;

public class AreaTRAP {

   
    public static void main(String[] args) {
      double bma, bme, H, area; 
      String sbma, sbme, sH;
      
      sbma = JOptionPane.showInputDialog(null, "Digite a base maior: ");
      sbme = JOptionPane.showInputDialog(null, "Digite a base menor: ");
      sH = JOptionPane.showInputDialog(null, "Digite a altura: ");
      
      bma = Double.parseDouble(sbma);
      bme = Double.parseDouble(sbme);
      H = Double.parseDouble(sH);
      
      area = (bma+bme)*H/2;
      
      JOptionPane.showMessageDialog(null, "A area do trapézio é: " +area);
      
    }
    
}
