import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(System.out);

		int t,n,sum,temp,i;
	    t=Integer.parseInt(br.readLine());
	    while(t>0){
	        sum=0;
	        boolean flag=true;
	        n=Integer.parseInt(br.readLine());
	        String s=br.readLine();
	        String[] str=s.split(" ");
		    for (i=0;i<n;i++){
	            temp=Integer.parseInt(str[i]);
	    	    if(temp>100) flag=false;
	            sum+=temp;
	        }
	        if((sum>=(100+n))||sum<100){
	            flag=false;
	        }
	        if(flag){
	            out.println("YES");
	        }else{
	        	out.println("NO");
	        }
	        t--;
	    }
		
		out.close();
	}

}
