package areacirc;
import javax.swing.JOptionPane;

public class AreaCIRC {

     
    public static void main(String[] args) {
        Double raio, area;
        String sraio;
        
        sraio = JOptionPane.showInputDialog(null, "Digite o número equevalente ao raio: ");
        
        raio = Double.parseDouble(sraio);
        
        area = (raio*raio)*3.14;
        
        JOptionPane.showMessageDialog(null, "A area do circulo é: " +area);
        
        
    }
    
}
