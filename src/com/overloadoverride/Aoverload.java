
package com.overloadoverride;

class Aoverload {

    public Integer addThem(int x, int y) {
        //System.out.println("Aoverload:addThem(int,int)=="+x+y);
        return x + y;
    }
// Overload the addThem method to add doubles instead of int
    public double addThem(double x, double y) {
        //// System.out.println("Aoverload:addThem(double,double)=="+x+y);
        return x + y;
    }
}
