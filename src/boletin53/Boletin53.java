
package boletin53;

import javax.swing.JOptionPane;

/**
 *
 * @author julianlinux
 */
public class Boletin53 {

    
  public static void main(String[] args) {
     Circulo segundoCirculo= new Circulo (Double.parseDouble(JOptionPane.showInputDialog("Teclea el radio:")));
     JOptionPane.showMessageDialog(null,"valor inicial del segundo es : "+segundoCirculo.getRadio());
     segundoCirculo.setRadio(Double.parseDouble(JOptionPane.showInputDialog("Teclea el radio:")));
     JOptionPane.showMessageDialog(null," El valor actual es : "+segundoCirculo.getRadio());
     JOptionPane.showMessageDialog(null,"El area: "+segundoCirculo.calcularArea());
     JOptionPane.showMessageDialog(null,"La longitud: "+segundoCirculo.calcularLongitud());
        }
    
    
    
    
}
