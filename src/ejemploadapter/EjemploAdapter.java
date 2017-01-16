/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploadapter;

import java.util.Scanner;
import modelo.Mouse;
import modelo.MousePS2;
import modelo.MouseUSB;
import modelo.adapter.MouseInalambricoAdapter;

/**
 *
 * @author Wx8-PC
 */
public class EjemploAdapter {
    
    private static Mouse mouse;
    private static void usarMouse(){
        mouse.conectar();
        mouse.desconectar();
    }
    public static void main(String[] args) {
        
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        
        do{
            System.out.println("\n*****Menu de opciones *****"
            +"\n\n1. Mouse USB. \n2. Mouse PS2. \n3. Mouse Inalambrico.\n4. Salir"
                    + "\n\nIngrese opcion: ");
        opcion = teclado.nextInt();
        
switch (opcion){
    case 1:
        mouse = new MouseUSB();
        usarMouse();
        break;
    case 2:
        mouse = new MousePS2();
        usarMouse();
        break;
    case 3:
        mouse = new MouseInalambricoAdapter();
        usarMouse();
        break;
        
    case 4:
        System.out.println("Fin de la ejecucion.. ");
        break;
    default:
        System.out.println("Opcion invalida");
}
        }while (opcion != 4);
    }
}
    
    
    
    
    

