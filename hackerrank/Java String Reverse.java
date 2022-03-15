import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int j=0;
        String result = "";
        for(int i = A.length()-1; i >= 0 && j< A.length();i--) {
            if(A.charAt(i) != A.charAt(j)){
                result = "No";
                break;
            }
            j++;
        }
        if(result.equals("No")) 
            System.out.println("No");
        else
            System.out.println("Yes");
    }
}
