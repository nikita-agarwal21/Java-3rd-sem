package assignment;

import java.util.Scanner;

public class PathFinderDemo {
	public static void main(String [] args){
        int n, k, x, countx = 0, i, j, s, d;
        Scanner scanner = new Scanner(System.in);
        k = scanner.nextInt();
        n = scanner.nextInt();
        x = scanner.nextInt();
        int cost [][] = new int[n+1][n+1];
        for(int a = 1; a < n+1; a++)
            for(int b = 1; b < n+1; b++)
                cost [a][b] = 9999;
        int time [][] = new int[n+1][n+1];
        for(int a = 1; a < n+1; a++)
            for(int b = 1; b < n+1; b++)
                time [a][b] = 0;
        while(countx < x){
            i = scanner.nextInt();
            j = scanner.nextInt();
            time [i][j] = scanner.nextInt();
            time[j][i] = time[i][j];
            cost [i][j] = scanner.nextInt();
            cost[j][i] = cost[i][j];
            countx++ ;
        }
        s = scanner.nextInt();
        d = scanner.nextInt();
        PathFinder pathfinder = new PathFinder(k, n, x, cost, time, s, d);
        pathfinder.path();
    }
}

