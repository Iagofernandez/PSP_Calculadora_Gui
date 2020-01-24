

package calculadora;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class cliente {
    public static void main(String args[]) throws IOException{
        String cad1, cad2, cad3;
        String resultado = "";
        String url = "localhost";
        int port = 1111;
        
        try{
            System.out.println("Iniciando el socket del cliente");
            Socket sc1 = new Socket (url, port);
            InputStreamReader isr = new InputStreamReader (System.in);
            InputStream is = sc1.getInputStream();
            BufferedReader bf = new BufferedReader(isr);
            OutputStream os1 = sc1.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os1);
            DataInputStream dis = new DataInputStream(is);
            
            System.out.println("Que tipo de operacion quieres?");
            System.out.println("1)Suma 2)Resta 3)Multiplicacion 4)Division");
            cad3 = bf.readLine();
            dos.writeUTF(cad3);
            
            System.out.println("Dame el primer operando");
            cad1 = bf.readLine();
            dos.writeUTF(cad1);
            
            System.out.println("Dame el segundo operando");
            cad2 = bf.readLine();
            dos.writeUTF(cad2);
            
            resultado = dis.readUTF();
            System.out.println("El resultado es = " + resultado);
            
            dos.flush();
            dos.close();
            
        }
        catch(IOException e){
            System.out.println("Server no encontrado");
        }
    }
}
