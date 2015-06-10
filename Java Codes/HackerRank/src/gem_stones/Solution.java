package gem_stones;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(System.out);
		int t;
		String s;
		s=br.readLine();
		t=Integer.parseInt(s);
		int ar[][]=new int[t][26];
		for(int i=0;i<t;i++){
			for(int j=0;j<26;j++){
				ar[i][j]=0;
			}
		}
		if(t==1){
			s=br.readLine();
			out.println(s.length());
		}else{
		
			for(int i=0;i<t;i++){
				s=br.readLine();
				
					for(int a=0;a<s.length();a++){
						ar[i][(int)(s.charAt(a)-'a')]=1;
					
				}
			}
			int ans=0;
			for(int i=0;i<26;i++){
				int temp=1;
				for(int j=0;j<t;j++){
					if(ar[j][i]==0){
						temp=0;break;
					}
				}
				ans+=temp;
			}
			out.println(ans);
		}
		out.close();
	}

}
