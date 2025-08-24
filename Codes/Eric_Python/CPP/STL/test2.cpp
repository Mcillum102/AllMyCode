#include <iostream>
#include <vector>

int main() {
    std::ios_base::sync_with_stdio(false);
    std::cin.tie(NULL);

    int N;
    std::cin >> N;

    // F[i] stores the node that node 'i' goes to.
    std::vector<int> F(N + 1);
    for (int i = 1; i <= N; ++i) {
        std::cin >> F[i];
    }

    // status: 0=unvisited, 1=non-loopy, 2=loopy
    std::vector<int> status(N + 1, 0);

    // Check each node as a potential starting point
    for (int i = 1; i <= N; ++i) {
        if (status[i] != 0) {
            // If this node has already been processed, skip it
            continue;
        }

        // Trace the path starting from node 'i'
        std::vector<int> current_path;
        int current_node = i;

        // Keep moving until we find a cycle or a previously processed node
        while (current_node != 0 && status[current_node] == 0) {
            status[current_node] = i; // Temporarily mark node with the starting node's ID
            current_path.push_back(current_node);
            current_node = F[current_node];
        }

        // After the loop, determine the final status for this path
        int final_status;
        if (current_node == 0) {
            // Case 1: Path terminates at 0. It is non-loopy.
            final_status = 1;
        } else if (status[current_node] == i) {
            // Case 2: Found a cycle within our own path. It is loopy.
            final_status = 2;
        } else {
            // Case 3: Hit a previously processed component. Inherit its status.
            final_status = status[current_node];
        }

        // Now, update the final status for all nodes in the path we just traced
        for (int node_in_path : current_path) {
            status[node_in_path] = final_status;
        }
    }

    // Count the nodes that are not part of a loopy path
    int non_loopy_count = 0;
    for (int i = 1; i <= N; ++i) {
        if (status[i] == 1) {
            non_loopy_count++;
        }
    }

    std::cout << non_loopy_count << std::endl;

    return 0;
}