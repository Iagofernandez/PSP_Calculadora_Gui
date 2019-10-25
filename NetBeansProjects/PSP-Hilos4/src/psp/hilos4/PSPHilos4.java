
package psp.hilos4;

public class PSPHilos4 extends Thread {
//Realiza un programa en java que execute tres fíos de forma concurrente. 
//Un de eles debe sumar os números pares del 1 ao 1000, outro os impares, 
//e outro, os que terminen en dous ou en tres.

    
    public PSPHilos4(String str){
   
    super(str);
    }
//hilo que realiza la suma de los numeros pares del 1 al 1000
    @Override
    public void run() {
        super.run();
        
        int suma=0;
        String cadea = "";
        
        for(int i = 0;i<1000;i=i+2){
            cadea=cadea+ " "+i;
            suma = suma +i;
        }
        System.out.println(cadea);
        System.out.println(suma);
        
    
    }

    
    public static void main(String[] args) {
   PSPHilos4 h1 = new PSPHilos4("Suma pares");
   h1.start();


    }
    
}
