package maxsubarray;

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
		int n;
		String sar[];
		int ar[],n1,n2;
		while(t-->0){
			s=br.readLine();
			n=Integer.parseInt(s);
			ar=new int[n];
			s=br.readLine();
			sar=s.split(" ");
			for(int i=0;i<n;i++){
				ar[i]=Integer.parseInt(sar[i]);
			}
			n1=ar[0];
			n2=0;
			for(int i=0;i<n;i++){
				if(ar[i]>=0){
					n2+=ar[i];
				}
			}
			for(int i=0;i<n;i++){
				int ts=0;
				for(int j=i;j<n;j++){
					ts+=ar[j];
					n1=(ts>n1?ts:n1);
				}
			}
			out.println(n1+" "+n2);
		}
		
		out.close();
	}

}
