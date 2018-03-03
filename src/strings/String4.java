package strings;
import java.util.*;
public class String4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1 = "Bangladesh is my country";
        
        String s2 = s1.replace('i', 'j');// replace
        System.out.println(s2);
        System.out.println(s1);
        
        String s3[]= s1.split(" ");//split according to space( )
        for(String s:s3){
            System.out.println(s);
        }
    }
}
