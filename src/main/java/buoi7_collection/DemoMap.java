/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi7_collection;

import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author tiennh
 */
public class DemoMap {
    public static void main(String[] args) {
        HashMap<String, Integer> diemMob1023 = new HashMap<String, Integer>();
        
        diemMob1023.put("lab1", 10);
        diemMob1023.put("lab2", 8);
        diemMob1023.put("lab3", 7);
        
        System.out.println("Điểm MOB1023: " + diemMob1023.toString());
        System.out.println("Điểm Lab 1: " + diemMob1023.get("lab1"));
        
        System.out.println("Key Set: " + diemMob1023.keySet().toString());
        System.out.println("map.values: " + diemMob1023.values());
        
        Set<String> listKey = diemMob1023.keySet();
        
        for (String key: listKey) {
            Integer value = diemMob1023.get(key);
            System.out.println("value: " + value);
        }
    }
}
