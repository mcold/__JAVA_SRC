/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple_types;

/**
 *
 * @author mcold
 */
public class Solution {
    
    public static void main(String[] args){
        boolean myBoolean = true;
        int myInt = (myBoolean) ? 1 : 0;
        System.out.println(((myBoolean) ? 1 : 0) + ((myBoolean) ? 1 : 0));
    }
    
    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        return ((b ? 1 : 0) + (a ? 1 : 0) + (c ? 1 : 0) + (d ? 1 : 0)) == 2;
        
        //return a & b & c & d;
    }
}
