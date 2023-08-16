package exercicio.pkg2;
import javax.swing.JOptionPane;

public class Exercicio2 {

    public static void main(String[] args) {
        // TODO code application logic here
       int n1, n2, soma;
       String sn1, sn2;
       sn1 = JOptionPane.showInputDialog(null, "digite um numero: ");
       sn2 = JOptionPane.showInputDialog(null, "Digite outro numero: ");
       
       n1 = Integer.parseInt(sn1);
       n2 = Integer.parseInt(sn2);
       
       soma = n1+n2;
       JOptionPane.showMessageDialog(null, "O valor da soma é: " +soma);
    }
    
}
