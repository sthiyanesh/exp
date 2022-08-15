public class Find_Nearest_point_That_Has_the_Same_X_or_Y_Coordinate {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int mindist = 10000;
        int index = -1;
        for(int i=0;i<points.length;i++){
            if((points[i][0]==x)&&(Math.abs(points[i][1]-y)<mindist)){
                mindist = Math.abs(points[i][1]-y);
                index = i;
            }
            if((points[i][1]==y)&&(Math.abs(points[i][0]-x)<mindist)){
                mindist = Math.abs(points[i][0]-x);
                index = i;
            }
        }
        return index;
    }
}
