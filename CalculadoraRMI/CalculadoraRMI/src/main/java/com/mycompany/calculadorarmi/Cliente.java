/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadorarmi;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author ELITEBOOK
 */
public class Cliente {

    public static void main(String[] args) {
        try {
            // Obtener una referencia del registro RMI en el localhost con el puerto 1099
            Registry r = LocateRegistry.getRegistry("localhost", 1099);
            // Obtener una referencia de la calculadora que se encuentra en el registro
            Calculadora cal = (Calculadora) Naming.lookup("//localhost/calculadora");

            // Ciclo que se ejecuta hasta que el usuario cancele el programa
            while (true) {
                // Mostrar un cuadro de diálogo para que el usuario elija una operación
                String menu = JOptionPane.showInputDialog("¿Que operación desea realizar?\n\n (+, -, /, *) o de click en cancelar para salir...");

                // Realizar la operación seleccionada por el usuario
                switch (menu) {
                    case "+":
                        // Obtener dos números del usuario
                        int a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número"));
                        int b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número"));
                        // Mostrar el resultado de la suma
                        JOptionPane.showMessageDialog(null, a + " + " + b + " = " + cal.add(a, b));
                        break;
                    case "-":
                        // Obtener dos números del usuario
                        int c = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número"));
                        int d = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número"));
                        // Mostrar el resultado de la resta
                        JOptionPane.showMessageDialog(null, c + " - " + d + " = " + cal.sub(c, d));
                        break;
                    case "*":
                        // Obtener dos números del usuario
                        int e = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número"));
                        int f = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número"));
                        // Mostrar el resultado de la multiplicación
                        JOptionPane.showMessageDialog(null, e + " * " + f + " = " + cal.mul(e, f));
                        break;
                    case "/":
                        // Obtener dos números del usuario
                        int g = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número"));
                        int h = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número"));
                        // Mostrar el resultado de la división
                        JOptionPane.showMessageDialog(null, g + " / " + h + " = " + cal.div(g, h));
                        break;
                    default:
                        // Si el usuario cancela el programa, salir del ciclo
                        break;
                }
            }
        } catch (Exception ex) {
            // En caso de error, mostrar el mensaje de error
            System.err.println("ex: " + ex.getMessage());
        }
    }
}
