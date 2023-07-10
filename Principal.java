import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Principal{

    public static void main(String[] args){

       double dias, diaria, refeit, estadia, desc, parc, acrescimo, tot;
       String mens;
       DecimalFormat df = new DecimalFormat ("##.##");

       dias=Double.parseDouble(JOptionPane.showInputDialog("Quantidade de dias em que esteve hospedado: "));
       diaria=Double.parseDouble(JOptionPane.showInputDialog("Valor da diária: "));
       refeit=Double.parseDouble(JOptionPane.showInputDialog("Total de despesas no refeitório: "));

       estadia=dias*diaria;
       tot=estadia+refeit;
       desc=tot-tot/10;
       acrescimo=tot+tot/10;
       parc=acrescimo/3;

       mens="Total de gastos: R$"+tot
         +"\nFormas de pagamento:"
         +"\nÀ vista (10% de desconto): R$"+desc  
         +"\nParcelado em até 3x (10% de acréscimo): R$"+acrescimo
         +"\nValor das parcelas: R$"+df.format(parc);
      JOptionPane.showMessageDialog(null, mens);    
    }
}
