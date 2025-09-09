def dfs_using_matrix(start_node, adj_matrix, v, visited):
    stack = []
    stack.append(start_node)

    while stack:
        node = stack.pop()
        if not visited[node]:
            visited[node] = True
            print(node, end=" ")

            # Push neighbors in reverse order (like in C++/Java)
            for i in range(v - 1, -1, -1):
                if adj_matrix[node][i] == 1 and not visited[i]:
                    stack.append(i)


def main():
    v = 5
    adj_matrix = [[0] * v for _ in range(v)]

    adj_matrix[0][1] = adj_matrix[1][0] = 1
    adj_matrix[0][2] = adj_matrix[2][0] = 1
    adj_matrix[1][3] = adj_matrix[3][1] = 1
    adj_matrix[2][4] = adj_matrix[4][2] = 1

    visited = [False] * v

    print("DFS Traversal Starting:")
    dfs_using_matrix(0, adj_matrix, v, visited)


if __name__ == "__main__":
    main()
