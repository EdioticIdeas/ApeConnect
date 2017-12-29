/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SocketConnect;

import LOGIN.UserLogin;
import com.sun.corba.se.spi.oa.OADefault;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Shub
 */
public class ServerConnection{
    private String ipAddress;
    private int portNumber;

    public ServerConnection(String ipAddress, int portNumber) {
        this.ipAddress = ipAddress;
        this.portNumber = portNumber;
    }
    Socket S;
    Object object;
    boolean isDone = false;
    
     public Object read(Request request) throws IOException,NumberFormatException{
           
             S = new Socket (ipAddress, portNumber);
            ObjectOutputStream in = new ObjectOutputStream(S.getOutputStream());
            in.writeObject(request);
            abc a = new abc();
            a.start();
            while (a.isAlive());
            return object;
        }
     
     class abc extends Thread{
            
        @Override
        public void run() {
            while(!isDone){
            try {
                ObjectInputStream inputStream = new ObjectInputStream(S.getInputStream());
                object = inputStream.readObject();
                isDone = true;
            } catch (IOException ex) {
                System.out.println(ex);
            } catch (ClassNotFoundException ex) {
                System.out.println(ex);
            }
            }
        }
            
        }
    
}
