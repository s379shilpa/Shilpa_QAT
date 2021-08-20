package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> myarr = new ArrayList<>();
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter the size : ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			myarr.add(sc.next());
		}
		System.out.println("The Reversed Strings is : ");
		for(int j=myarr.size()-1;j>=0;j--) {
			System.out.println(myarr.get(j));
			
		}
		System.out.println("The string to be reversed :"+myarr);
		Collections.reverse(myarr);
		System.out.println("The final reversed output is : "+myarr);
		sc.close();
	}

}
