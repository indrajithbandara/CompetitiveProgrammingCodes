#include <bits/stdc++.h>

int main(){
int t,i;
int ans;
scanf("%d",&t);

for(i=0;i<t;i++){

   double sum=0;
   int temp=5;
   scanf("%d",&ans);
   while(ans!=0)
   {
    if(ans&1)
        sum+=temp;
    temp*=5;
     ans/=2;
    }
   printf("%.0f\n",sum);
   }
return 0;
}
