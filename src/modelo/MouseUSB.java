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
public class MouseUSB extends Mouse{

    public MouseUSB() {
        System.out.println("Mouse USB creado.....");
    }

    
    
    
    @Override
    public void conectar() {
        System.out.println("Mouse USB conectado");
    }

    @Override
    public void desconectar() {
        System.out.println("Mouse USB desconectado");
    }
    
}
