/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eon;
import java.rmi.*;
import java.rmi.registry.*;
/**
 *
 * @author prince
 */
public class EON_Client {
    public static Eon_intf generate; 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Starting Client");
	try{
            LocateRegistry.createRegistry(1099);
            generate = (Eon_intf)Naming.lookup("rmi://localhost:1099/eon");  
            String x = generate.demo();
            System.out.println(x);
            new login().setVisible(true);
	}
	catch (Exception e) {
            System.out.println(e);
	}
    }
    
}
