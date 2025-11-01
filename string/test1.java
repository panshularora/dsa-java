package string;
import java.util.*;

public class test1 {
    public static void main(String args[]){

        //concatation
        String firstName = "tony";
        String lastName = "stark";
        String fullName = firstName +" "+ lastName;
        System.out.println(fullName);

        //charAt
        for(int i=0; i<fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }

        //comparing string
        // s1 > s2 : +ve value
        // s1 = s2 : 0 value
        // s1 < s2 : -ve value

        String A = "Panshul";
        String B = "Panshul";

        if(A.compareTo(B) == 0){
            System.out.println("strings are equal");
        } else{
            System.out.println("strings arent equal");
        }

        //substring
        String name = "My name is Tony";
        String subname = name.substring(0, 4);
        System.out.println(subname);
    }
}
