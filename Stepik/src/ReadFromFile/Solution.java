/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReadFromFile;

/**
 *
 * @author mcold
 */

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.Reader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class Solution {
    
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, IOException{
        
    FileInputStream fis = new FileInputStream("test.txt");
    InputStreamReader isr = new InputStreamReader(fis, "Cp1251");
    // Reader in = new BufferedReader(isr);
    BufferedReader buf = new BufferedReader(isr);
    String s = buf.readLine();
    System.out.println(s);
    }
    
}
