package strings;
import java.util.*;
public class Strings {
    public static void main(String[] args) {
        String s1 = "Mahmud Shahin love Swarna";
        String s2 = new String("Mahmud Shahin");
        
        System.out.println("s1 = "+s1);
        System.out.println("s2 = "+s2);
        
        char ch[] = {'s','h','a','h','i','n'};
        //System.out.println("ohao : "+ch); // is not working
        System.out.println(ch);
        int len = s1.length();
        System.out.println("Length of s1: "+len);
        if(s1.contains(s2))// s2 is in s1
        {
            System.out.println("S1 Contain : "+s2);
        }else if(s1.equals(s2))
        {
            System.out.println("Equals");
        }else
        {
            System.out.println("Not contain or Equal");
        }
        boolean con = s1.contains("love");
        System.out.println("Contain "+con);
        con = s1.isEmpty();
        System.out.println("Empty "+con);
    }

}
