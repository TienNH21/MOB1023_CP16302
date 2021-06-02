/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi9_exception;

/**
 *
 * @author tiennh
 */
public class DemoMultiCatch {
    public static void main(String[] args) {
        String[] arr = new String[] {"1", "a", null, "2"};

        for (int i = 0; i < 5; i++) {
            parse(arr[i]);
        }
    }
    
    private static int parse(String input) throws NumberFormatException
    {
        try {
            int kq = Integer.parseInt(input);
            System.out.println("Kết quả: " + kq);
            
            return kq;
        } catch (NumberFormatException e) {
            e.printStackTrace();

            throw e;
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Vui lòng nhập đủ thông tin!");
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("Vui lòng nhập đủ thông tin!");
        }

        return 0;
    }
}
