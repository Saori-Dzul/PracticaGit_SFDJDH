
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Pomuch1
 */
public class Cubo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner Scanner = new Scanner (System.in);
    for (int n = 1; n <= 10; n++ ){
    System.out.print ("teclee un numero: ");
    int num = Scanner.nextInt (); 
    int cubo = num*num*num;    
    int cuarta = cubo*num;   
    System.out.print("El cubo del numero es :"+ cubo);      
    System.out.print("La cuarta del numero es:"+cuarta);
    }                                     
     Scanner.close();    
    }
    
}
