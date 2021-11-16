
package Red;

import javax.swing.JOptionPane;


public class Redondear {
    public static void main (String [] args){
        double decimal1;
        long resultado;
        
        JOptionPane.showMessageDialog(null, " Programita que te redondea numeros ");

        
        decimal1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa un decimal a redondear: "));
        
        resultado = Math.round(decimal1);
        
        JOptionPane.showMessageDialog(null, " El resultado es: "+resultado);

    }
}
