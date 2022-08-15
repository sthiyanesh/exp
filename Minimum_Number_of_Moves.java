import java.util.*;
public class Minimum_Number_of_Moves {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int cnt=0;
        for(int i=0;i<seats.length;i++){
            cnt+=Math.abs(seats[i]-students[i]);
        }
        return cnt;
    }
}
