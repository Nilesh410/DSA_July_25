#include<iostream>
#include<stack>
using namespace std;
const int MAX=100;
void dfsUsingMatrix(int startnode,int adjMatrix[][MAX],int v,bool visited[])
{
    stack<int> st;
    st.push(startnode);

    while(!st.empty())
    {
        int node=st.top();
        st.pop();

        if(!visited[node])
        {
            visited[node]=true;
            cout<<node<<" ";
            for(int i=v-1;i>=0;i--)
            {
                if(adjMatrix[node][i] && !visited[i])
                {
                    st.push(i);
                }
            }
        }
    }
}
int main()
{
    int v=5;
    int adjMatrix[MAX][MAX]={0};
    adjMatrix[0][1]=adjMatrix[1][0]=1;
    adjMatrix[0][2]=adjMatrix[2][0]=1;
    adjMatrix[1][3]=adjMatrix[3][1]=1;
    adjMatrix[2][4]=adjMatrix[4][2]=1;

    bool visited[MAX]={false};

    cout<<"DFS Traversal Starting\n";
    dfsUsingMatrix(0,adjMatrix,v,visited);
    return 0;
}