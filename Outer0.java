/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Outer;

/**
 *
 * @Herusubakti
 */
public class Outer0 {
     int number = 0;

    void outerMethod() {
       
    class Inner {
        public void print() {
            System.out.println("Mengakses inner class yang ke: " + (number++));
        }
    }

        Inner in = new Inner();
        in.print();
    }
}

class Main {
    public static void main(String[] args) {
        Outer0 out = new Outer0();
        out.outerMethod();
        out.outerMethod();
        out.outerMethod();
        
    }
}


