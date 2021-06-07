package buoi9_exception;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tiennh
 */
public class DemoException {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3 };
        try {
            System.out.println(arr[2]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
