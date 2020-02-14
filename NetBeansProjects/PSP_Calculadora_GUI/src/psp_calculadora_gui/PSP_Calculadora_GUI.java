
package psp_calculadora_gui;

public class PSP_Calculadora_GUI {

    public static void main(String[] args) {
      // NUEVO EJERCICIO DE PSP DE CALCULADORA CLIENTE SERVIDOR
      //VERSION 2.0
      //AHORA EL SERVIDOR PUEDE ATENDER PETICIONES DE VARIOS CLIENTES A LA VEZ
      //Y SE LE AÑADE UNA NUEVA INTERFAZ AL CLIENTE
      Multiclientes mc = new Multiclientes();
      mc.start();
      
    }
    
}
