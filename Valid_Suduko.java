import java.util.*;
public class Valid_Suduko {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> a = new HashSet<String>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.')
                    continue;
                if(a.contains("row"+i+board[i][j])||a.contains("col"+j+board[i][j]))
                    return false;
                a.add("row"+i+board[i][j]);
                a.add("col"+j+board[i][j]);
                if(a.contains("box"+(i/3)+(j/3)+board[i][j]))
                    return false;
                a.add("box"+(i/3)+(j/3)+board[i][j]);
            }
        }
        return true;
    }
}
