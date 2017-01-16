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
public class MousePS2 extends Mouse{

    public MousePS2() {
        System.out.println("Mouse PS2 creado..");
    }

    
    @Override
    public void conectar() {
        System.out.println("Mouse PS2 conectado: ");
    }

    @Override
    public void desconectar() {
        System.out.println("Mouse PS2 desconectado:");
    }
    
}
