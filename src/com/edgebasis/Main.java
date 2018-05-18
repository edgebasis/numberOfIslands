package com.edgebasis;

public class Main {

    public static void main(String[] args) {
        char[][] mygrid = new char[][]{
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','1','1','0'}
        };

        System.out.println(numIslands(mygrid));

    }

    public static int numIslands(char[][] grid) {

        if(grid==null) return 0;

        int islandCount = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]=='1'){

                    islandToWater(grid, i, j);
                    ++islandCount;
                }

            }
        }

        return islandCount;

    }

    private static void islandToWater(char[][] grid, int i, int j){


        if(i <0 || j < 0 || i >= grid.length || j >= grid.length || grid[i][j] == '0') return;


        grid[i][j]='0';

        islandToWater(grid,i+1, j);
        islandToWater(grid,i-1, j);
        islandToWater(grid, i, j+1);
        islandToWater(grid, i, j-1);


    }

}
