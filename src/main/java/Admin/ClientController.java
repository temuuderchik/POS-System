/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Admin;

import entity.ServerObjects;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class ClientController {

    private static String ip = "localhost";
    private static final Integer port = 1234;

    public ClientController(String pi) {
        ClientController.ip = pi;
    }

    public static ServerObjects main(ServerObjects ss) throws IOException {
        ServerObjects res = null;
        try ( Socket socket = new Socket(ip, port)) {
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());

            oos.writeObject(ss);
            oos.flush();
            try {
                res = (ServerObjects) ois.readObject();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ClientController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return res;
    }
}
