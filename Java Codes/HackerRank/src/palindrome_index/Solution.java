package palindrome_index;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(System.out);
		int t;
		String s;
		s=br.readLine();
		t=Integer.parseInt(s);
		while(t-->0){
			s=br.readLine();
			int i;
			String temp;
			if(s.length()<2 || pali(s)){
				out.println("-1");
			}else{
				for(i=0;i<s.length();i++){
					temp=s.substring(0,i)+s.substring(i+1);
					if(pali(temp)){
						out.println(i);
						break;
					}
				}
				if(i==s.length()){
					out.println("-1");
				}
			}
		}
		out.close();
	}

	private static boolean pali(String s) {
		int mid=s.length()/2;
		for(int i=0;i<mid;i++){
			if(s.charAt(i)!=s.charAt(s.length()-i-1)){
				return false;
			}
		}
		return true;
	}

}
