import java.util.*;
public class BFS_AdjMatrix
{
    public static final int MAX=100;
    
    public static void bfsUsingMatrix(int startNode,int adjMatrix[][],int vertex,boolean visited[])
    {
        Queue<Integer>q=new LinkedList<>();
        q.add(startNode);
        visited[startNode]=true;

        while(!q.isEmpty())
        {
            int node=q.poll();
            System.out.print(node+" ");

            for(int i=0;i<vertex;i++)
            {
                if(adjMatrix[node][i]==1 && !visited[i])
                {
                    q.add(i);
                    visited[i]=true;
                }
            }
        }
    }
    public static void main(String args[])
    {
        int vertex=5;
        int adjMatrix[][]=new int[MAX][MAX];

        adjMatrix[0][1] = adjMatrix[1][0] = 1;
        adjMatrix[0][2] = adjMatrix[2][0] = 1;
        adjMatrix[1][3] = adjMatrix[3][1] = 1;
        adjMatrix[2][4] = adjMatrix[4][2] = 1;

        boolean[] visited = new boolean[MAX];

        System.out.println("BFS Traversal Starting:");
        bfsUsingMatrix(0, adjMatrix, vertex, visited);
    }
}