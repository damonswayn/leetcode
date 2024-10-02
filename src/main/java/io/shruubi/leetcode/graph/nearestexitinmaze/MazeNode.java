package io.shruubi.leetcode.graph.nearestexitinmaze;

public class MazeNode {
    private final int xPos;

    private final int yPos;

    private final char value;

    public MazeNode(int xPos, int yPos, char value) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.value = value;
    }

    public int getXPos() {
        return this.xPos;
    }

    public int getYPos() {
        return this.yPos;
    }

    public boolean isWall() {
        return this.value == '+';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        MazeNode mazeNode = (MazeNode) o;
        return xPos == mazeNode.xPos &&
                yPos == mazeNode.yPos &&
                value == mazeNode.value;
    }

    @Override
    public int hashCode() {
        int result = xPos;
        result = 31 * result + yPos;
        result = 31 * result + value;
        return result;
    }

    @Override
    public String toString() {
        return "MazeNode{" +
                "xPos=" + xPos +
                ", yPos=" + yPos +
                ", value='" + value + '\'' +
                '}';
    }
}
