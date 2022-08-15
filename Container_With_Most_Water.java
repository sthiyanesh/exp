public class Container_With_Most_Water {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1;
        int area=0;
        while(i<j){
            int temp = (j-i)*Math.min(height[i],height[j]);
            area = Math.max(temp,area);
            if(height[i]>height[j]){
                j--;
            }else{
                i++;
            }
        }
        return area;
    }
}
