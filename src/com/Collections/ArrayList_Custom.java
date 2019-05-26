/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Collections;

import java.util.AbstractList;
import java.util.List;

class ArrayList_Custom {

    public static List ArrayList_Custom(Object[] a) {
        return new ArrayList(a);
    }
}

class ArrayList extends AbstractList
        implements java.io.Serializable {

    private Object[] x;

    ArrayList(Object[] array) {
        x = array;
    }

    public Object get(int index) {
        return x[index];
    }

    public Object set(int index, Object element) {
        Object oldVal = x[index];
        x[index] = element;
        return oldVal;
    }

    public int size() {
        return x.length;
    }
}

