package javaPrograms;

import java.util.ArrayList;

public class PAlwithArraylist {

	public static void main(String[] args) {
		String s = "noon";
		ArrayList<Character> al = new ArrayList<Character>();
		for(int i=0;i<s.length();i++) {
			al.add(s.charAt(i));
		}
		System.out.println(al);
		boolean pal = true;
		int j=0,k=al.size()-1;
		while(j<=k) {
			if(al.get(j) != al.get(k)) {
				pal = false;
				break;
				
			}
			j++;
			k--;
		}
		if(pal) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}

		
	}

}
