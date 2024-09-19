package Fibonacci;

import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class pruebaFibo {

    public static int numeroGenerar;
    public static int fibo;
    public static int opcion;
    public static boolean estado = false;
    public static StringBuilder mensaje;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        do {

            try {



                  opcion = Integer.parseInt(JOptionPane.showInputDialog(
                  "Ingrese la opcion que desee:\n"+
                  "1. Generar serie Fibonacci\n"+
                  "2. Salir"));

                switch (opcion) {
                    case 1:

                        numeroGenerar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion fibonacci que desea generar:"));

                        mensaje = new StringBuilder("La serie Fibonacci hasta la posicion " + numeroGenerar + " es:\n");
                        
                        //Se usa j para mostrar los datos sin salirse de la ventana
                        for (int i = 0, j = 0; i <= numeroGenerar; i++, j++) {

                            mensaje.append(Fibo.generarFibo(i) + "  ");
                            
                            
                            if (j == 30) {
                               
                                mensaje.append("\n");
                                j = 15;
                            }
                            
                        }
                        JOptionPane.showMessageDialog(null,mensaje);

                        break;

                    case 2:

                        estado = true;
                        
                        break;

                    default:
                        
                        JOptionPane.showMessageDialog(null,"\nIngrese solo el valor de 1 ó 2\n");
                        
                        break;
                }

            } catch (InputMismatchException e) {
                JOptionPane.showMessageDialog(null,"\nERROR!!! INGRESE UN VALOR VALIDO\n");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"\nERROR EN LA EJECUCION: " + e.getMessage() + "\n");
            }

        } while (!estado);
    }

}
