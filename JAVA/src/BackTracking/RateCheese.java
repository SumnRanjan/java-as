package BackTracking;

import java.util.Scanner;

public class RateCheese {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char [][] maze = new char[n][m];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < m; j++) {
                maze[i][j] = s.charAt(j);
            }
        }

        int [][] display = new int[n][m];
        rateCheese(maze , 0 , 0 , display);
    }

    public static void rateCheese(char [][] maze , int cr , int cc , int [][] ans){
        if(cr == maze.length - 1 && cc == maze[0].length - 1 && maze[cr][cc] == 'O'){
            ans[cr][cc] = 1;
            display(ans);
            return;
        }

        if(cr < 0 || cc < 0 || cr >= maze.length || cc >= maze[0].length || maze[cr][cc] == 'X'){
            return;
        }

        maze[cr][cc] = 'X';
        ans[cr][cc] = 1;

        rateCheese(maze , cr + 1 , cc , ans);
        rateCheese(maze , cr - 1, cc  , ans);
        rateCheese(maze , cr , cc + 1 , ans);
        rateCheese(maze , cr , cc - 1 , ans);

        maze[cr][cc] = 'O';
        ans[cr][cc] = 0;
    }

    private static void display(int [][] display){
        for (int[] ints : display) {
            for (int j = 0; j < display[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}
