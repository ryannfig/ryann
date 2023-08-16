package exercício;
import javax.swing.JOptionPane;

public class Exercício {

    public static void main(String[] args) {
        //QUAL O SEU NOME?
       String nome, Sobrenome;
        
       nome = JOptionPane.showInputDialog(null, "Qual o seu nome?");
       Sobrenome = JOptionPane.showInputDialog(null, "Qual o seu sobrenome?");
       
       
       JOptionPane.showMessageDialog(null, "Muito prazer, " +nome +Sobrenome);
    }
    
}
