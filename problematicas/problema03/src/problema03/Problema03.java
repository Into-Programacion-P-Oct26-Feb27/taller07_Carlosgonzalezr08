/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

/**
 *
 * @author Carlos
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int contador = 1;
        int suma = 2;
        
        while (suma <= 26){
            
            suma = (contador * contador) + 1;
            contador = contador + 1;
            System.out.printf("%d\n", suma);
        }
        
    }
    
}
