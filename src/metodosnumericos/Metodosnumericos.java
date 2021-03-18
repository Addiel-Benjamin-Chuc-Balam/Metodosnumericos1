/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosnumericos;
import javax.swing.JOptionPane;
/**
 *
 * @author Adiel
 */
public class Metodosnumericos {

    /**
     * @param args the command line arguments
     */
     public static double discriminante;
    public static void main(String[] args) {
        // TODO code application logic here
        double x,n;
        int a,b,c;
        boolean Salir = false;
        
        do{
            
                
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"Menu\n\n " + "¿Que Opcion Desea Realizar?\n\n"
                +"1.- Euler\n\n"
                +"2.- Euler Cuadratica\n\n"+
                 "3.- Salir","Metodos Numericos",JOptionPane.INFORMATION_MESSAGE));
        
        
       switch(opcion){
           
           case 1:
                double Euler = 0;
                x=Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el valor de X","Valores",JOptionPane.INFORMATION_MESSAGE));
                n=Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el valor de N","Valores",JOptionPane.INFORMATION_MESSAGE));
                 for (int j = 0; j <= n; j++) {
                        Euler += (Math.pow(x, j) / Factorial(j));
                    }
                JOptionPane.showMessageDialog(null,"El resultado de euler elevado a " + x + " es: " + Euler+"\n\n"
                        +"El resultado de euler elevado a -" + x + " es: " + (1 / Euler),"Resultados",JOptionPane.INFORMATION_MESSAGE);
           break;
           
           case 2:
                a=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor de A"));
                b=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor de B"));
                c=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor de C"));
                 discriminante = Math.sqrt(Math.pow(b, 2) - (4 * a * c));
                    ecuacion1(a, b, c);
                    ecuacion2(a, b, c);
                    break; 
                    
           case 3:
               Salir=true;
               break;
               
           default:
           JOptionPane.showMessageDialog(null,"La Opcion Es Incorrecta");  
           break;
                
            }
    }while(Salir!=true);
        }
    public static double Factorial(int n) {
        double cont = 1;
        for (int i = 1; i <= n; i++) {
            cont *= i;
        }
        return cont;
    }

 public static void ecuacion1(int a, int b, int c) {
        double x1 = 0, x2 = 0;
        if (discriminante > 0) {
            x1 = (-b + discriminante) / (2 * a);
            x2 = (-b - discriminante) / (2 * a);
        } else if (discriminante == 0) {
            x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            x2 = x1;
        }
        JOptionPane.showMessageDialog(null,"Primer Metodo de Solucion");
        impresion(x1, x2);
    }
     public static void ecuacion2(int a, int b, int c) {
        double x1 = 0, x2 = 0;
        if (discriminante > 0) {
            x1 = (-2 * c) / (b + discriminante);
            x2 = (-2 * c) / (b - discriminante);
        } else if (discriminante == 0) {
            x1 = (-2 * c) / (b + discriminante);
            x2 = x1;
        }
        JOptionPane.showMessageDialog(null,"Segundo Metodo de Solucion");
        impresion(x1, x2);
    }
     public static void impresion(double x1, double x2) {
        if (discriminante >= 0) {
            JOptionPane.showMessageDialog(null,"El resultado de x1 es " + x1+"\n\n"+
                    "El resultado de x2 es " + x2);
        } else {
            JOptionPane.showMessageDialog(null, "\n\nNo tiene ninguna solucion");
        }
    }
}
    
    

