package mascfem;
import javax. swing.JOptionPane;
public class MASCFEM {

    public static void main(String[] args) {
        String s;
        //String idi;
        
        s = JOptionPane.showInputDialog(null, "Digite sexo");
        
        //id = Integer.parseInt(idi);
        
        if(s.equals("masculino"))
        {
            JOptionPane.showMessageDialog(null, "masculino");
        }    
        else
        {
            JOptionPane.showMessageDialog(null, "feminino");
        }    
    }
    
}
