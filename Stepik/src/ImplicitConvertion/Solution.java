package ImplicitConvertion;

/**
 *
 * @author mcold
 */
public class Solution {
    
    public static void main(String[] args){
        
        
        // byte
        byte a = 1;
        
        a += 3;                 // неявное преобразование в Int
        System.out.println(a);  // 4
        
        
        // shift byte
        byte b = -1;        // 11111111
        b >>>= 7;           // неявное преобразование в Int -> 32-е 1-цы
        System.out.println(b);  // -1
        
        System.out.println("Неявное преобразование типов ---------");
        System.out.println("---------------");
        // byte -> int
        byte b2 = 1;
        int i = 7;
        //b2 = i;           // mistake
        
        
        // char -> int
        char c = 15;
        int i2 = c + 1;     // norm т.к. преобразование расширяющее
        
        // String -> int
        String s = "SOme";
        //int i3 = s;
        
        
        // byte -> char
        byte b3 = 1;
        //char c2 = b3;
        
        
        // long -> float
        long l = 100;
        float f = l + 500;     // norm т.к. преобразование расширяющее
        
        
        // float -> long
        float f3 = 500;
        //long l2 = f3;
        
        
        
    }
    
    
    
}
