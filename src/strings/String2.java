package strings;
import java.util.*;
public class String2 {
    public static void main(String[] args) {
        String firstName = "Mahmudul";
        String lastName = " Hasan";
        
        String full = firstName + lastName;
        System.out.println("Full name = "+full);
        
        String con = firstName.concat(lastName);
        System.out.println("Using concat: "+con);
        
        System.out.println("Uppercase : "+full.toUpperCase());
        
        boolean b = firstName.startsWith("A");
        System.out.println("Start With A !!! "+b);
        
        b = lastName.endsWith("n");
        System.out.println("Last with n !!! "+b);
        
        String name[] = {"mahmud","hasan","swarna"};
        System.out.println("Using for each loop");
        for(String x : name){
            System.out.println(x);
        }
        
        System.out.println("Using for loop");
        for(int i=0; i<name.length; i++)
        {
            System.out.println(name[i]);
        }
    }

}
