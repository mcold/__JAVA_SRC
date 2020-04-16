/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Difference;

/**
 *
 * @author mcold
 */
public class Solution {
    
    public static void main(String[] args){
        double a = 0.1;
        double b = 0.2;
        double c = 0.3;
        
        System.out.println(doubleExpression(a, b, c));
        System.out.println(equelition(a, b, c));
        
    }
    
    public static boolean doubleExpression(double a, double b, double c) {
    boolean g = Math.abs((a + b) - c) < 1E-4;
    System.out.println(g); 
    return g;
}
    
    public static boolean equelition(double a, double b, double c) {
        return a + b == c;
    }
}
