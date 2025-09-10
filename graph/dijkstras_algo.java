public class dijkstras_algo
{
    public static void main(Strig args[])
    {
        int startNode=0;
        System.out.println("output=");
        dijkstra(startNode);
    }
    public static void dijkstra(int v)
    {
        int dist[]=new int[10];
        boolean visited[]=new boolean[10];
        int predecessor[]=new predecessor[10];

        for(int i=0;i<n;i++)
        {
            dist[i]=Integer.MAX_VAL;
            visited[i]=false;
            predecessor[i]=-1;
        }
        dist[v]=0;
        visited[v]=true;
        predecessor[v]=-1;
        for(int i=0;i<n;i++)
        {
            if(graph[v][i]&&!visited[i]&&(dist[i]>dist[v]+graph[v][i])
            {
                dist[i]=dist[v]+graph[v][i];
                predecessor[i]=v;
                visited[i]=true;
            }
        }
    }
}