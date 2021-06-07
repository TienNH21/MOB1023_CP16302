/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading.c1_extends_thread;

/**
 *
 * @author tiennh
 */
public class MyThread extends Thread {
    @Override
    public void run()
    {
        System.out.println("Hello Poly");
    }
}
