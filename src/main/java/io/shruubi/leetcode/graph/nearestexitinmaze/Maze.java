package io.shruubi.leetcode.graph.nearestexitinmaze;

import java.util.*;

public final class Maze {
    private final MazeNode[][] maze;

    private MazeNode startNode;

    private MazeNode currentPosition;

    public Maze(MazeNode[][] maze) {
        this.maze = maze;
    }

    public static Maze createFromInput(char[][] input) {
        MazeNode[][] maze = new MazeNode[input.length][input[0].length];

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[0].length; j++) {
                MazeNode mazeNode = new MazeNode(i, j, input[i][j]);
                maze[i][j] = mazeNode;
            }
        }

        return new Maze(maze);
    }

    public void setStartNode(MazeNode startNode) {
        this.startNode = startNode;
        this.currentPosition = startNode;
    }

    public MazeNode getNode(int x, int y) {
        return maze[x][y];
    }

    public boolean canMoveTo(int x, int y) {
        return x >= 0 && x < maze.length && y >= 0 && y < maze[0].length && !maze[x][y].isWall();
    }

    public List<MazeNode> getNonBlockedNeighbours(MazeNode node) {
        int currentX = node.getXPos();
        int currentY = node.getYPos();

        List<MazeNode> neighbours = new ArrayList<>();
        if (canMoveTo(currentX - 1, currentY)) {
            neighbours.add(this.maze[currentX - 1][currentY]);
        }

        if (canMoveTo(currentX + 1, currentY)) {
            neighbours.add(this.maze[currentX + 1][currentY]);
        }

        if (canMoveTo(currentX, currentY - 1)) {
            neighbours.add(this.maze[currentX][currentY - 1]);
        }

        if (canMoveTo(currentX, currentY + 1)) {
            neighbours.add(this.maze[currentX][currentY + 1]);
        }

        return neighbours;
    }

    public int findShortestPathToEdgeOfMaze() {
        if (this.currentPosition == null) {
            return -1;
        }

        Set<MazeNode> visited = new HashSet<>();
        Queue<MazeNode> queue = new LinkedList<>();
        queue.add(this.currentPosition);
        visited.add(this.currentPosition);

        int steps = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                MazeNode current = queue.poll();
                if (current == null) {
                    continue;
                }

                if (!current.equals(startNode) && this.isBorderNode(current.getXPos(), current.getYPos())) {
                    return steps;
                }

                List<MazeNode> neighbours = getNonBlockedNeighbours(current);
                for (MazeNode neighbour : neighbours) {
                    if (!visited.contains(neighbour)) {
                        queue.add(neighbour);
                        visited.add(neighbour);
                    }
                }
            }

            steps++;
        }

        return -1;
    }

    private boolean isBorderNode(int x, int y) {
        return x == 0 || x == maze.length - 1 || y == 0 || y == maze[0].length - 1;
    }
}
