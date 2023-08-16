package raiz;
import javax.swing.JOptionPane;

public class RAIZ {

 
    public static void main(String[] args) {
        double n1, qua, raiz;
        String sn1;        
      sn1 =  JOptionPane.showInputDialog(null, "Escolha um numero: ");
      n1 = Integer.parseInt(sn1);
      qua = n1*n1;
      raiz = Math.sqrt(n1); 
      JOptionPane.showMessageDialog(null,"O quadrado do numero é: " +qua+ " A raiz do numero é: " +raiz);
     
    }
    
}
