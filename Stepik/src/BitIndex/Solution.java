/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BitIndex;

/**
 *
 * @author mcold
 */
public class Solution {
    
    public static void main(String[] args){
    
       System.out.println(flipBit(0, 1));
    }
    
    public static int flipBit(int value, int bitIndex) {
        return value ^ (1 << (bitIndex-1));
    }   
    
}
