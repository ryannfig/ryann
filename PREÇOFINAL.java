package preçobruto;
import javax.swing.JOptionPane;
public class PREÇOBRUTO {

    public static void main(String[] args) {
      int PF, pb, imp, ml;
      String spb, simp, sml;
      
      spb = JOptionPane.showInputDialog(null, "Digite o preço bruto: ");
      simp = JOptionPane.showInputDialog(null, "Digite o imposto: ");
      sml = JOptionPane.showInputDialog(null, "Digite a magem de lucro: ");
      
      pb = Integer.parseInt(spb);
      imp = Integer.parseInt(simp);
      ml = Integer.parseInt(sml);
      
      PF = pb+imp+ml;
      
      JOptionPane.showMessageDialog(null, "O preço final é de: " +PF);
    }
    
}
