import java.util.*;
public class Main
{
	public static void main(String[] args) {
        String s1,s2;
        Scanner sc = new Scanner(System.in);
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        System.out.println("The length of the first string is "+s1.length());
        System.out.println("The length of the second string is "+s2.length());
        if(s1.length() == s2.length())
            System.out.println("The length of the two strings are the same");
        else 
            System.out.println("The length of the two strings is not the same");
            
        if(s1.equals(s2)==true)
            System.out.println("Two strings are equal");
        else
            System.out.println("Two strings are not equal");
	}
}
