package io.shruubi.leetcode.graph.nearestexitinmaze;

/**
 * 75. Nearest Exit from Entrance in Maze
 * <a href="https://leetcode.com/problems/nearest-exit-from-entrance-in-maze/">Nearest Exit from Entrance in Maze</a>
 */
public class NearestExitFromEntranceInMaze {
    public int nearestExit(char[][] maze, int[] entrance) {
        Maze mazeObj = Maze.createFromInput(maze);
        mazeObj.setStartNode(mazeObj.getNode(entrance[0], entrance[1]));
        return mazeObj.findShortestPathToEdgeOfMaze();
    }
}
