# ryann
  package área;
import javax.swing.JOptionPane;
public class Área {

    public static void main(String[] args) {
    double  QUA, AQ;
     String sQUA;
     
     sQUA = JOptionPane.showInputDialog(null, "Digite o lado do quadrado: ");
    
     
     QUA = Double.parseDouble(sQUA);
     
     AQ = QUA*QUA; 
    
     JOptionPane.showMessageDialog(null, "Area do quadrado: " +AQ);
     
    }
    
}

     
   
