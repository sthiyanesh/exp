public class Subtract_the_Product_and_Sum_of_Digits_of_an_Integer {
    public int subtractProductAndSum(int n) {
        int a=n;
        int sum=0;
        int product=1;
        while(a>0){
            int rem = a%10;
            sum+=rem;
            product*=rem;
            a/=10;
        }
        return product-sum;
    }
}
