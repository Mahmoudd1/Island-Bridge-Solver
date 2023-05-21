import java.util.LinkedList;
import java.util.Queue;

public class Solution   {
    Queue<int[]>myqueu=new LinkedList<>();
    public int shortestBridge(int[][] grid) {
        int len= grid.length;
        int i=0;
        int j=0;
        outerloop:
        for (i=0;i< len;i++)
        {
            for (j=0;j<len;j++)
            {
                if (grid[i][j]==1)
                {
                    break outerloop;
                }
            }
        }
        dfs(grid,i,j);
        int distance=-1;
        while (myqueu.size()>0)
        {
            distance++;
            int size= myqueu.size();
            while (size>0)
            {
                size--;

                int []temp=myqueu.poll();
                int a=temp[0];
                int b=temp[1];
                if (a>0)
                {
                    if (grid[a-1][b]==1)
                        return distance;
                    if (grid[a-1][b]==0)
                        myqueu.add(new int[]{a-1,b});
                    grid[a][b+1]=-1;
                }
                if (b>0)
                {
                    if (grid[a][b-1]==1)
                        return distance;
                    if (grid[a][b-1]==0)
                        myqueu.add(new int[]{a,b-1});
                    grid[a][b+1]=-1;
                }

                if (a<grid.length-1)
                {
                    if (grid[a+1][b]==1)
                        return distance;
                    if (grid[a+1][b]==0)
                         myqueu.add(new int[]{a+1,b});
                    grid[a+1][b]=-1;
                }
                if (b<grid.length-1)
                {
                    if (grid[a][b+1]==1)
                        return distance;
                    if (grid[a][b+1]==0)
                        myqueu.add(new int[]{a,b+1});
                    grid[a][b+1]=-1;
                }
            }
        }
            return distance;
    }
    void dfs(int[][]grid,int i, int j)
    {
        if (i>grid.length-1||j>grid.length-1 || j<0||i<0)
            return;
        if(grid[i][j]==0||grid[i][j]==2)
            return ;
        myqueu.add(new int[]{i,j});
        grid[i][j]=2;
        dfs(grid,i+1,j);
        dfs(grid,i,j+1);
        dfs(grid,i-1,j);
        dfs(grid,i,j-1);

    }
}
