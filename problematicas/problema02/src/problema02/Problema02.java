/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

/**
 *
 * @author Carlos
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int contador = 2;
        int suma = 0;
        
        while (suma <= 90){
            suma = suma + contador;
            contador = contador + 2;
            System.out.printf("%d\n", suma);
        }
        
    }
    
}
