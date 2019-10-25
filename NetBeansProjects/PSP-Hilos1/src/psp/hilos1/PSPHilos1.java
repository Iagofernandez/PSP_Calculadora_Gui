
package psp.hilos1;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PSPHilos1 extends Thread{
public PSPHilos1(String str){
    super(str);
}

    @Override
    public void run() {
        
       for(int i = 0;i<10;i++){
            System.out.println(i+" "+getName());
            try{
               Thread.sleep((int) (Math.random() * (1000 - 2000)+ 2000));
            } catch (InterruptedException ex) {
               Logger.getLogger(PSPHilos1.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       System.out.println("Acaba "+ getName());
    }

    public static void main(String[] args) {
       PSPHilos1 h1 = new PSPHilos1("");

        PSPHilos1 h2 = new PSPHilos1("");
        h1.start();
        h2.start();

System.out.println("Acaba main");
    }
    
}
