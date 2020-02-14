/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psp_calculadora_gui;

/**
 *
 * @author dam2
 */
public class Multiclientes extends Thread{
       @Override
    public void run() {
        
        Ventana obj = new Ventana();
        obj.setVisible(true);

        System.out.println("iniciando hilo cliente");

    }

         
         
}


