/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Wx8-PC
 */
public class MouseInalambrico {
    
    private boolean conectado;
    private boolean encendido;

    public MouseInalambrico() {
        this.conectado = false;
        this.encendido = false;
        System.out.println("Mouse Inalambrico creado.. ");
    }
    
    public void concetarAdaptadorBluetooth(){
        if (!conectado) {
            conectado = true;
            System.out.println("Adaptador bluetooth conectado");
        }else{
            System.out.println("El adaptador bluetooth ya esta conectado");
        }
    }
    
    public void desconectarAdaptadorBluetooth(){
        if(conectado){
            conectado = false;
            System.out.println("Adaptador bluetooth desconectado");
        }else{
            System.out.println("El adaptador bluetooth ya esta desconectado");
        }
    }
    public void apagar(){
        if(conectado){
            conectado = false;
            System.out.println("Adaptador se esta apagando");
        }else{
            System.out.println("El adaptador ya esta apagado");
    }
    }
    public void encender(){

        if(conectado){
            conectado = true;
            System.out.println("Adaptador esta encendido");
        }else{
            System.out.println("El adaptador ya esta encendido");
        }
     
            
            
            
        }

 
    
    
    
}
