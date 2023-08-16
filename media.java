package media;
import javax.swing.JOptionPane;

public class Media {


    public static void main(String[] args) {
       double n1, n2, media;
       String sn1, sn2;
       
      sn1 = JOptionPane.showInputDialog(null, "Digite a primera nota");
      sn2 = JOptionPane.showInputDialog(null, "Digite a segunda nota");
       
      n1 = Double.parseDouble(sn1);
      n2 = Double.parseDouble(sn2);
      media = (n1+n2)/2;
      
      JOptionPane.showMessageDialog(null, "A media é de: " +media);
    }
    
}
