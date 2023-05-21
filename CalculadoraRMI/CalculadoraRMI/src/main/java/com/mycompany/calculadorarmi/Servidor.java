/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.calculadorarmi;

import java.awt.HeadlessException;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import javax.swing.JOptionPane;

/**
 *
 * @author ELITEBOOK
 */
public class Servidor {

    // El método main es el punto de entrada para la ejecución del programa.
    public static void main(String[] args) {
        try {
            // Se crea un objeto de tipo Registry en el puerto 1099.
            Registry r = LocateRegistry.createRegistry(1099);
            // Se registra el objeto de tipo RemoteMethodInvocation con el nombre "calculadora" en el Registry.
            r.bind("calculadora", new RemoteMethodInvocation());
            // Se muestra un mensaje indicando que el servidor ha sido iniciado exitosamente.
            JOptionPane.showMessageDialog(null, "Servidor iniciado...");
        } catch (HeadlessException | AlreadyBoundException | RemoteException e) {
            // Si ocurre algún error al iniciar el servidor, se muestra un mensaje de error.
            JOptionPane.showMessageDialog(null, "No fue posible iniciar el servidor: " + e.getMessage());
        }
    }
}
