/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz;
import javax.swing.JOptionPane;
/**
 *
 * @author Aulas Heredia
 */
public class Quiz {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*Se crea el mensaje donde se solicita el salario, cantidad de empleados*/
       int cantidadEmpleados; 
        cantidadEmpleados = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de empleados que hay en la empresa: ")); 
        
        
        double totalPagar= 0;
        
        for (int i = 0; i < cantidadEmpleados; i++) {
           double salario= Double.parseDouble(JOptionPane.showInputDialog(null,"Digite su salario "+(i+ 1)+":"));
           
        double sem= salario* 0.0925;
       double ivm= salario* 0.0508; 
       
       
       totalPagar += sem + ivm; 
       
      
            
        }
       JOptionPane.showMessageDialog(null,"El total a pagar es de:"+ totalPagar+"₡");
        
       
       
       
       
    }
       
       
    }
    
   

