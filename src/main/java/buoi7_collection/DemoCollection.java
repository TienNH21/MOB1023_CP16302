/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi7_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author tiennh
 */
public class DemoCollection {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(2);
        list.add(3);
        
        System.out.println("List: " + list.toString());
        System.out.println("-------------------");

        Set<Integer> set = new HashSet<Integer>();
        
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(3);
        set.add(3);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
//        System.out.println("Set: " + set.toString());
        
//        // Demo addAll
//        list.addAll(set);
//        System.out.println("List After addAll(): " + list.toString());
//        System.out.println("-------------------");
//
//        set.addAll(list);
//        System.out.println("Set After addAll(): " + set.toString());
//        System.out.println("-------------------");
        
//        set.removeAll(list);
//        System.out.println("Set After removeAll(): " + set.toString());
//        System.out.println("-------------------");

        Collections.shuffle(list);
        System.out.println("myList.shuffle() = " + list);
        
        Collections.sort(list);
        System.out.println("myList.sort() = " + list);
        
        Collections.reverse(list);
        System.out.println("myList.sort().reverse() = " + list);
    }
}
