package angulotri;
import javax.swing.JOptionPane;
public class ANGULOTRI {

    public static void main(String[] args) {
       int angulo;
       String sangulo;
       
       sangulo = JOptionPane.showInputDialog(null, "Informe o grau de um dos angulo");
 
       angulo = Integer.parseInt(sangulo);
       if(angulo == 90)
       {
           JOptionPane.showMessageDialog(null, "Triangulo retangulo.");
       }    
       if(angulo > 90)
       {
           JOptionPane.showMessageDialog(null, "Triangulo obtusangulo.");
       }    
       if(angulo < 90)
       {
           JOptionPane.showMessageDialog(null, "Triangulo Acutangulo");
       }    
    }
    
}
