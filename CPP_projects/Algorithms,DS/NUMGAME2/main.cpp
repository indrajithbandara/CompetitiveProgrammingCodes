#include <bits/stdc++.h>
using namespace std;

int main()
{
    int t,n;
    scanf("%d",&t);
    while(t--){
        scanf("%d",&n);
        if((n-1)%4==0){
            printf("ALICE\n");
        }else{
            printf("BOB\n");
        }
    }
    return 0;
}
