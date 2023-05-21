/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadorarmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author ELITEBOOK
 */
public class RemoteMethodInvocation extends UnicastRemoteObject implements Calculadora {

    public RemoteMethodInvocation() throws RemoteException {
        // Constructor for RemoteMethodInvocation class.
    }

    @Override
    public int add(int a, int b) throws RemoteException {
        // Method to add two numbers a and b.
        return a + b;
    }

    @Override
    public int sub(int a, int b) throws RemoteException {
        // Method to subtract two numbers a and b.
        return a - b;
    }

    @Override
    public int mul(int a, int b) throws RemoteException {
        // Method to multiply two numbers a and b.
        return a * b;
    }

    @Override
    public int div(int a, int b) throws RemoteException {
        // Method to divide two numbers a and b.
        return a / b;
    }

}
