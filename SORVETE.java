package sorvete;
import javax.swing.JOptionPane;
public class SORVETE {

    public static void main(String[] args) {
        int sabor, quant;
        
        Double vm = 3.0, vc = 4.0;
        
        String ssabor, squant;
        
        ssabor = JOptionPane.showInputDialog(null, "Sabor (1 - (morango, 2 - chocolate) ");
        squant = JOptionPane.showInputDialog(null, "Quantas bolas de sorvete? ");
        
        sabor = Integer.parseInt(ssabor);
        quant = Integer.parseInt(squant);
        
        switch(sabor)
        {
            case 1:
                if(quant == 1)
                {
                    vm = 1*3.0;
                    vm = vm*0.93;
                    JOptionPane.showMessageDialog(null, "Valor total: " +vm);
                }    
                else if(quant == 2)
                {
                    vm = 2*3.0;
                    vm = vm*0.93;
                    JOptionPane.showMessageDialog(null, "Valor total: "+vm);
                }    
                else if(quant == 3)
                {
                    vm = 3*3.0;
                    vm = vm*0.93;
                    JOptionPane.showMessageDialog(null, "Valor total" +vm);
                }    
                else
                {
                    vm = quant*3.0;
                    vm = vm*0.85;
                    JOptionPane.showMessageDialog(null, "");
                }    
        }    
        
        switch(sabor)
        {
            
            case 2:
                if(quant == 1)
                {
                    vc = 1*4.0;
                    vc = vc*0.90;
                    JOptionPane.showMessageDialog(null, "Valor total: " +vc);
                }    
                else if(quant == 2)
                {
                    vc = 2*4.0;
                    vc = vc*0.90;
                    JOptionPane.showMessageDialog(null, "Valor total: "+vc);
                }    
                else if(quant == 3)
                {
                    vc = 3*4.0;
                    vc = vc*0.90;
                    JOptionPane.showMessageDialog(null, "Valor total" +vc);
                }    
                else
                {
                    vc = 3*3.0;
                    vc = vc*0.90;
                    JOptionPane.showMessageDialog(null, "Valor total: " +vc);
                }    
             break;   
            default:
                    JOptionPane.showMessageDialog(null, "Sabor inválido");
        }    
    }
    
}
