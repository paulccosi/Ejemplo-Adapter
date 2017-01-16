/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.adapter;

import modelo.Mouse;
import modelo.MouseInalambrico;

/**
 *
 * @author Wx8-PC
 */
public class MouseInalambricoAdapter extends Mouse{
    
    private MouseInalambrico mouse;
    public MouseInalambricoAdapter(){
        mouse = new MouseInalambrico();
    }
    
    @Override
    public void conectar() {
        mouse.concetarAdaptadorBluetooth();
        mouse.encender();
    }

    @Override
    public void desconectar() {
         mouse.desconectarAdaptadorBluetooth();
         mouse.apagar();
    }
    
}
