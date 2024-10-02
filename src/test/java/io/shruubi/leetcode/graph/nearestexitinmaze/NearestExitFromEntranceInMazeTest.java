package io.shruubi.leetcode.graph.nearestexitinmaze;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NearestExitFromEntranceInMazeTest {

    private NearestExitFromEntranceInMaze nearestExitFromEntranceInMaze;

    @Before
    public void setUp() {
        this.nearestExitFromEntranceInMaze = new NearestExitFromEntranceInMaze();
    }

    @Test
    public void exampleOne() {
        char[][] maze = {
                {'+', '+', '.', '+'},
                {'.', '.', '.', '+'},
                {'+', '+', '+', '.'}
        };
        int[] entrance = {1, 2};
        int expected = 1;
        int actual = this.nearestExitFromEntranceInMaze.nearestExit(maze, entrance);
        assertEquals(expected, actual);
    }

    @Test
    public void exampleTwo() {
        char[][] maze = {
                {'+', '+', '+'},
                {'.', '.', '.'},
                {'+', '+', '+'}
        };
        int[] entrance = {1, 0};
        int expected = 2;
        int actual = this.nearestExitFromEntranceInMaze.nearestExit(maze, entrance);
        assertEquals(expected, actual);
    }

    @Test
    public void exampleThree() {
        char[][] maze = {
                {'.', '+'}
        };
        int[] entrance = {0, 0};
        int expected = -1;
        int actual = this.nearestExitFromEntranceInMaze.nearestExit(maze, entrance);
        assertEquals(expected, actual);
    }
}