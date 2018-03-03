package strings;
import java.util.*;

public class String3 {
    public static void main(String[] args) {
        String country = "  Bangladesh is my country   ";
        System.out.println(country);
        
        String s3 = country.trim();///first and last space clean
        System.out.println(s3);
        
        char ch = country.charAt(0); //what is the charecter at 0 index
        System.out.println("ch "+ch);
        
        int value = country.codePointAt(0);// find the ASCII value of 0 index charecter
        System.out.println("value = "+value);
        
        int pos = country.indexOf("is");//find the index number of first n
        System.out.println("First Position of is = "+pos);
        
        pos = country.lastIndexOf('n'); //find the last n from the string
        System.out.println("Last position of n = "+pos);
    }

}
