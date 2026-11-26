/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String jugador;
        String posicion;
        String lista_jugador = "Listado de Jugadores\n";
        String lista_edades = "Listado de Edades\n";
        String lista_promedio = "";
        String salir;
        String cadena_final = "";
        int edad;
        int suma_edades = 0;
        int contador = 0;
        double promedio_edad = 0;
        double promedio_altura = 0;
        double altura;
        double suma_Altura = 0;
        boolean limite = true;
        
                
        while (limite == true){
            System.out.println("Ingrese le nombre del jugador");
            jugador = entrada.nextLine();
            
            System.out.println("Ingrese la posicion del jugador");
            posicion = entrada.nextLine();
            
            System.out.println("Ingrese la edad del jugador");
            edad = entrada.nextInt();
            
            System.out.println("Ingrese la altura del jugador");
            altura = entrada.nextDouble();
            
            entrada.nextLine();
            contador = contador + 1;
            suma_edades = suma_edades + edad;
            suma_Altura = suma_Altura + altura;
            
            lista_jugador = String.format("%s%d. %s -%s-, edad: %d, estatura: "
                    + "%.2f\n",lista_jugador, contador, jugador, posicion,
                    edad, altura);
            
            
            
            lista_edades = String.format("%s %d\n", lista_edades, edad);
            
            promedio_edad = suma_edades / contador;
            promedio_altura = suma_Altura / contador;
            
            System.out.println("Desea terminar la lista (si-no)");
            
            salir = entrada.nextLine();
            if (salir.equals("si")){
                limite = false;
            }
            
            
        }
        
        lista_promedio = String.format("Promedio de edades: %.2f\nPromedio de "
                + "Estaturas: %.2f\n", promedio_edad, promedio_altura);
        
        cadena_final = String.format("%s%s%s", lista_jugador, lista_edades, 
                lista_promedio);
        
        System.out.println(cadena_final);
        
    }
    
}
