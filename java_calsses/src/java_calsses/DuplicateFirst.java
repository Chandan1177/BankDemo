package java_calsses;

import java.util.Scanner;

public class DuplicateFirst {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter");
		String inputstr=sc.next().toLowerCase();
		int length=inputstr.length();
		
		StringBuilder sb=new StringBuilder("");
		
		char [] chararray=new char[length];
		int [] frqarray=new int[length];
		int position=0;
		
		for(int i=97;i<=122;i++) {
			int frq=0; 
			for(int j=0;j<inputstr.length();j++) {
				if(inputstr.charAt(j)==i) {
					frq++;
				}
			}
			if(frq>0) {
				chararray[position]=(char)i;
				frqarray[position]=frq;
				position++;
				inputstr.replaceAll(""+(char) i, "");
			}
		}
		
		
		for(int i=length;i>0;i--) {
			for(int j=0;j<length;j++) {
				int l=frqarray[j];
				if(l==i) {
										
					for(int k=0;k<l;k++) {
						sb.append(chararray[j]);
					}
				}
			}
			
		}
		System.out.println(sb);
	}

}
