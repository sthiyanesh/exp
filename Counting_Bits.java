public class Counting_Bits {
    public int[] countBits(int n) {
        int[] a = new int[n+1];
        if(n==0){
            a[0]=0;
            return a;
        }
        if(n==1){
            a[0]=0;
            a[1]=1;
            return a;
        }
        a[0]=0;
        a[1]=1;
        int k=2;
        int j=0;
        for(int i=2;i<=n;i++){
            if(i==k){
                j=0;
                k*=2;
            }
            a[i]=a[j]+1;
            j++;
        }
        return a;
    }
}
