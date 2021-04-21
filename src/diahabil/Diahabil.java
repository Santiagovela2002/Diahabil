/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diahabil;


import java.util.Scanner;
/**
 *
 * @author Santiago Vela
 */
public class Diahabil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner diaSem = new Scanner(System.in);
    int num = 0;
    System.out.println("Considerando los días de la semana, ingrese un número del 1 al 7: ");
    num = diaSem.nextInt();
    
     if (num >0 && num <=7 ) {
         
         switch (num){
            case 1:
            System.out.println("Es Lunes y es día hábil");
            break;   
            case 2:
            System.out.println("Es Martes y es día hábil");
            break;
            case 3:
            System.out.println("Es Miércoles y es día hábil");
            break;   
            case 4:
            System.out.println("Es Jueves y es día hábil");
            break;
            case 5:
            System.out.println("Es Viernes y es día hábil");
            break;   
            case 6:
            System.out.println("Es Sábado y es fin de semana");
            break;
            case 7:
            System.out.println("Es Domingo y es fin de semana");
            break;
     }     
        
    }else{  
        System.out.println("El número que colocó no pertenece a ningún día de la semana. Por favor ingrese un número del 1 al 7");
     }
    }
    
}
