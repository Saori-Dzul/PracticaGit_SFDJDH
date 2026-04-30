
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Pomuch1
 */
public class Calificacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner Scanner = new Scanner (System.in);   
    for (int n = 1; n <= 15; n++ ){   
    System.out.print ("teclee un numero negativo: ");    
    int num = Scanner.nextInt ();    
    int pos = num * -1;   
    System.out.println("Numero original :"+ num); 
    System.out.println("Numero positivo :"+ pos);     
        
        
    }  
        
    Scanner.close();
    
    }
    
}
