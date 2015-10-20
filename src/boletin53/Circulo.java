
package boletin53;

/**
 *
 * @author julianlinux
 */

public class Circulo {
   private double radio;
   public static final double Pi=3.14;

//Constructores
   public Circulo(){}

   public Circulo (double ra){
       radio=ra;
      
   }
   
   //Metodos de acceso get set
   public void setRadio(double ra){
       radio=ra;
   }
   
   public double getRadio(){
       return radio;
       
   }
   
   public double calcularArea(){
       return Pi*Math.pow(radio,2);
   }
  public double calcularLongitud(){
      return Pi*(radio*2);
  }
   


}