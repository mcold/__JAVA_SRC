/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WorkWithUnicode;

import java.io.UnsupportedEncodingException;

/**
 *
 * @author mcold
 */
public class Solution {
    public static void main(String[] args){
     try {
      String priwet = new String(                       // преобразуем поток байт в String
                    "\u041F"+"\u0440"+"\u0438"+
                    "\u0432"+"\u0435"+"\u0442"+"!");
      
      System.out.println(priwet);
      
      
      char c = 32;
      
      char c2 = '\u041F';
      
      System.out.println(c);
      
      char c3 = '\\';
      System.out.println((int)c3);
      
      byte[] utf8Bytes = priwet.getBytes("UTF8");       // обратная операция преобразования String в байт
      
      System.out.println(utf8Bytes);
      
      String priwet2 = new String(utf8Bytes,"UTF8");
        } catch (UnsupportedEncodingException e) {
      e.printStackTrace();
    }
        System.out.println("-------------");
        char x = charExpression(32);
        System.out.println(x);
        
        System.out.println("-------------");
        char y = charExpression(29);
        System.out.println(y);
        System.out.println("-------------");
        
        int b='\\'; 
        System.out.println(b);
    }
    
    
    public static char charExpression(int a) {
        char c = '\\';
        int num = (int)c;          // номер обратного слеша
        char res = (char)(num + a);
        return res;
    }
}
