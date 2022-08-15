public class Average_Salary_Excluding_the_Minimum_and_Maximum_Salary {
    public double average(int[] salary) {
        int min = salary[0];
        double sum = salary[0];
        int max = salary[0];
        for(int i=1;i<salary.length;i++){
            if(min>salary[i]){
                min=salary[i];
            }
            if(max<salary[i]){
                max=salary[i];
            }
            sum+=salary[i];
        }
        sum-=min;
        sum-=max;
        double b = salary.length-2;
        double a = sum/b;
        return a;
    }
}
