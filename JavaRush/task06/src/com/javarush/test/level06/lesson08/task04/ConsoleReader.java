package com.javarush.test.level06.lesson08.task04;

/* Класс ConsoleReader
Сделать класс ConsoleReader, у которого будут 4 статических метода:
String readString() – читает с клавиатуры строку
int readInt() – читает с клавиатуры число
double readDouble() – читает с клавиатуры дробное число
void readLn() – ждет нажатия enter [использовать readString()]
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConsoleReader {
    
    
    public static String readString() throws Exception{
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String s = buf.readLine();
        return s;
    }
    
    public static int readInt() throws Exception{
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(buf.readLine());
        return i;
    }
    
    public static double readDouble() throws Exception{
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        Double d = Double.parseDouble(buf.readLine());
        return d;
    }
    
    public static String readLn() throws Exception{
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String s = buf.readLine();
        return s;
    }
    
    
}
