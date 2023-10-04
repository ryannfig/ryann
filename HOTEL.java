package hotel;
import javax.swing.JOptionPane;
public class HOTEL {

    public static void main(String[] args) {
       double promo, desconto, diaria;
       int quartos, preju;
       String squartos, svalor;
       
       squartos = JOptionPane.showInputDialog("Temos seis quartos, todos com valor de R$100 a diária. Quantos serão ocupados? ");
          
       quartos = Integer.parseInt(squartos);
       
       diaria = 100*25/100;
       JOptionPane.showMessageDialog(null, "Temos uma promoção de "+diaria+"% de desconto.");
       
       if(quartos == 6)
       {
            promo = (600*25)/100;
            desconto = 600-promo;
            preju = 25*6;
            JOptionPane.showMessageDialog(null, "Valor da hospedagem com todos os quartos inclusos: " +desconto);
            JOptionPane.showMessageDialog(null, "Com o desconto, fica R$"+preju+" a menos.");
       }
       else if(quartos == 3)
       {
           promo = (300*25)/100;
           desconto = 300-promo;
           JOptionPane.showMessageDialog(null, "Valor da hospedagem incluindo 3 dos 6 quartos: " +desconto);
       }    

    }
    
}
