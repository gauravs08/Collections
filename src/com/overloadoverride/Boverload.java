/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.overloadoverride;

public class Boverload {

    public static void main(String[] args) {
        Aoverload a = new Aoverload();
        int b = 27;
        int c = 3;
        int result = a.addThem(b, c); // Which addThem is invoked?
         System.out.println("Boverload:int=="+result);
        double doubleResult = a.addThem(22.5, 9.3); // Which addThem?
        System.out.println("Boverload:double=="+doubleResult);
        //int intResult = a.addThem(22.0, 9); // Which addThem?
        //System.out.println("Boverload:int=="+intResult);
    }
}
