
package calculadora;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class servidor {
    public static void main(String args[]) throws IOException {
        int x,y;
        int resultado = 0;
        int port = 1111;
        String a,b,c,tipo;
        ServerSocket ss = null;
        String url = "localhost";
        try{
            ss = new ServerSocket(port);
            Socket s1 = ss.accept();
            
            InputStream is = s1.getInputStream();
            OutputStream os = s1.getOutputStream();
            DataInputStream dis = new DataInputStream(is);
            DataOutputStream dos = new DataOutputStream(os);
            
            System.out.println("Esperando al tipo de operacion");
            tipo = dis.readUTF();
            System.out.println("El tipo de operacion es " + tipo);
            
            System.out.println("Eserando el primer numero");
            a = dis.readUTF();
            System.out.println("El primer valor es " + a);
            
            System.out.println("Esperando al segundo numero");
            b = dis.readUTF();
            System.out.println("El segundo valor es" + b);
            
            x = Integer.parseInt(a);
            y = Integer.parseInt(b);
            
            if(tipo.equals("1")){
                resultado = x + y;
                
            }
            else if(tipo.equals("2")){
                resultado = x - y;
            }
            else if(tipo.equals("3")){
                resultado = x * y;
            }
            else if(tipo.equals("4")){
                resultado = x / y;
            }
             else{
                  System.out.println("Error");
                }
            System.out.println("El resultado es = " + resultado);
            dos.writeUTF(Integer.toString(resultado));
            
            s1.close();
            dis.close();
            
            
        }
        catch(IOException e){
            System.out.println("Error en el cliente");
        }
    }
}
