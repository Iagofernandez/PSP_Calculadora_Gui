
package psp.hilos4;

public class PSPHilos4 extends Thread {
//Realiza un programa en java que execute tres fíos de forma concurrente. 
//Un de eles debe sumar os números pares del 1 ao 1000, outro os impares, 
//e outro, os que terminen en dous ou en tres.

    
    public PSPHilos4(String str){
   
    super(str);
    }
//hilo que realiza la suma de los numeros pares del 1 al 1000
   //hilo que relaiza la suma de los numeros impares del 1 al 1000(mas  o menos)
    //falta hilo que sume numeros acabados en 2 o 3 (falta)
    
    @Override
    public void run() {
        super.run();
        
        int sumaPar=0;
        String cadeaPar = "";
        
        for(int i = 0;i<1000;i=i+2){
            cadeaPar=cadeaPar+ " "+i;
            sumaPar = sumaPar +i;
        }
        System.out.println(cadeaPar);
        System.out.println(sumaPar);
        
    int sumaImp = 0;
    String cadeaImp ="";
    for(int y=0;y<1000;y=y+1){
        if(y%2!=0){
            cadeaImp =cadeaImp+" "+y;
            sumaImp = sumaImp+y;
        
        }
        
        System.out.println(cadeaImp);
        System.out.println(sumaImp);
    }
    
    }

    
    public static void main(String[] args) {
   PSPHilos4 h1 = new PSPHilos4("Suma pares");
   
   PSPHilos4 h2 = new PSPHilos4("suma impares");
   h1.start();
   h2.start();

    }
    
}
