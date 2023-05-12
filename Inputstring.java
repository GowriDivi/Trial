package Revv;

import java.util.Scanner;

public class Inputstring {

	public static void main(String[] args) {
		
System.out.println("Enter any String:");
     Scanner r=new Scanner(System.in);
     String s=r.nextLine();
     String rev="";
     for(int i=s.length()-1;i>=0;i--)
     {
    	 rev=rev+s.charAt(i);
     }
    System.out.println("Reversed string is:");
    System.out.println(rev);
	}

}
