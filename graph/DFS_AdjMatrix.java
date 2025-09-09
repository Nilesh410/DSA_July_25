import java.util.Stack;

public class DFS_AdjMatrix {
    static final int MAX = 100;

    static void dfsUsingMatrix(int startNode, int[][] adjMatrix, int v, boolean[] visited) {
        Stack<Integer> stack = new Stack<>();
        stack.push(startNode);

        while (!stack.isEmpty()) {
            int node = stack.pop();

            if (!visited[node]) {
                visited[node] = true;
                System.out.print(node + " ");

                // Push adjacent nodes in reverse order (for DFS behavior)
                for (int i = v - 1; i >= 0; i--) {
                    if (adjMatrix[node][i] == 1 && !visited[i]) {
                        stack.push(i);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int v = 5;
        int[][] adjMatrix = new int[MAX][MAX];

        // Undirected Graph edges
        adjMatrix[0][1] = adjMatrix[1][0] = 1;
        adjMatrix[0][2] = adjMatrix[2][0] = 1;
        adjMatrix[1][3] = adjMatrix[3][1] = 1;
        adjMatrix[2][4] = adjMatrix[4][2] = 1;

        boolean[] visited = new boolean[MAX];

        System.out.println("DFS Traversal Starting:");
        dfsUsingMatrix(0, adjMatrix, v, visited);
    }
}
