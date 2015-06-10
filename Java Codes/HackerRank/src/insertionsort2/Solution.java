package insertionsort2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class Solution {
	
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(System.out);
		int n;
		String s;
		s=br.readLine();
		n=Integer.parseInt(s);
		int ar[]=new int[n];
		String sar[];
		s=br.readLine();
		sar=s.split(" ");
		for(int i=0;i<n;i++){
			ar[i]=Integer.parseInt(sar[i]);
		}
		if(n==1){
			out.println(ar[0]);
		}else{
			for(int i=2;i<=n;i++){
				int a[]=new int[i];
				for(int b=0;b<i;b++){
					a[b]=ar[b];
				}
				Arrays.sort(a);
				for(int j=0;j<i;j++){
					out.print(a[j]+" ");
				}
				if(n>i){
					for(int j=i;j<n;j++){
						out.print(ar[j]+" ");
					}
				}
				out.println();
			}
			
		}
		out.close();
	}

}
