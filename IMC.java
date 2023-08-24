package imc;
import javax.swing.JOptionPane;
public class IMC {

    public static void main(String[] args) {
        double peso, alt, IMC;
        String speso, salt;
        
        speso = JOptionPane.showInputDialog(null, "Digite o peso do indivíduo: ");
        salt = JOptionPane.showInputDialog(null, "Digite a altura do indivíduo: ");
        
        peso = Double.parseDouble(speso);
        alt = Double.parseDouble(salt);
        
        IMC = peso/(alt*alt);
        
        JOptionPane.showMessageDialog(null, "O IMC dessa pessoa é: " +IMC);
    }
    
}
