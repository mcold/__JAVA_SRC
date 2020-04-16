/*
В Григорианском календаре год является високосным в двух случаях: либо он кратен 4, но при этом не кратен 100, либо кратен 400.

Реализуйте метод, вычисляющий количество високосных лет с начала нашей эры (первого года) до заданного года включительно. На самом деле Григорианский календарь был введен значительно позже, но здесь для упрощения мы распространяем его действие на всю нашу эру.
 */
package visok;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author mcold
 */
public class Solution {
    
    public static void main(String[] args) throws Exception{
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(buf.readLine());
        int n = leapYearCount(year);
        System.out.println(n);
    }   
    
    public static int leapYearCount(int year) {
        int count = 0;
        int n = 1;
        while(n < year+1){
            if(n % 400 == 0){
                //System.out.println(n % 400);
                count++;
                n++;
                continue;
            }
            else{
                if(n % 100 == 0){
                    //System.out.println(n % 100);
                    n++;
                    continue;
                }
                else{
                    if(n % 4 == 0){
                        //System.out.println(n % 4);
                        count++;
                        n++;
                        continue;
                    }
                }
            }
            
            n++;
        }
        return count;
        
    }
    
}
