# Island-Bridge-Solver
This repository contains a solution to the "Shortest Bridge" problem, which involves finding the shortest bridge between two islands in a 2D binary matrix.
## Problem Description
Given a 2D binary matrix representing an island, the goal is to find the shortest bridge to connect two islands. 
The matrix consists of 0s and 1s, where 0 represents water and 1 represents land. 
The bridge can only be built vertically or horizontally between adjacent land cells.

The solution utilizes a combination of depth-first search (DFS) and breadth-first search (BFS) algorithms to identify the islands and find the shortest path between them.
## Approach
The solution follows these main steps:

- Find the coordinates of the first island by iterating through the matrix.
- Use DFS to mark all cells of the first island as visited and add them to a queue.
- Use BFS to find the shortest path between the two islands:
- Initialize a distance variable to -1.
- While the queue is not empty, increment the distance and process the cells:
- Retrieve a cell from the queue.
- Check the neighboring cells (up, down, left, right) and return the distance if the second island is found.
- Add unvisited land cells to the queue and mark them as visited.
- Return the distance, which represents the length of the shortest bridge.
## Complexity Analysis
The time complexity of the solution is O(N^2), where N is the size of the matrix. This is because we visit each cell in the matrix during the DFS and BFS operations.

The space complexity is O(N^2) as well, considering the space required for the queue and the recursive calls in the DFS.
## Conclusion
The "Shortest Bridge Solver Algorithm" repository provides a solution to the problem of finding the shortest bridge between two islands in a 2D binary matrix. The solution is implemented in Java and utilizes DFS and BFS algorithms.
