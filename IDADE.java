package idade;
import javax.swing.JOptionPane;
public class IDADE {

    public static void main(String[] args) {
     int idade; 
     String sidade;
     
      sidade = JOptionPane.showInputDialog(null, "Digite a idade: ");
      idade = Integer.parseInt(sidade);
      
      if(idade >= 18 && idade <= 65)
      {
          JOptionPane.showMessageDialog(null, "Está entre as idades indicadas.");
      }       
      else
      {
          JOptionPane.showMessageDialog(null, "Não está entre as idades indicadas.");
      }    
    }
    
}
