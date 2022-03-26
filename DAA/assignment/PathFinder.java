package assignment;

public class PathFinder {

	    private int k;
	    private int n;
	    private int x;
	    private int cost [][];
	    private int time [][];
	    private int source;
	    private int dest;
	    int totalCost = 0, totalTime = 0, numberOfLayovers = -1;

	    public PathFinder(int k, int n, int x, int[][] cost, int[][] time, int source, int dest) {
	        this.k = k;
	        this.n = n;
	        this.x = x;
	        this.cost = cost;
	        this.time = time;
	        this.source = source;
	        this.dest = dest;
	    }
	    
	    public int minCost(int [] effectiveCost, boolean [] visited){
	        int min = Integer.MAX_VALUE, min_index = -1;
	        for(int v = 1; v < n+1; v++){
	            if(visited[v] == false && effectiveCost[v] <= min){
	                min = effectiveCost[v];
	                min_index = v;
	            }
	        }
	        return min_index;
	    }
	    
	    void pathTracker(int v, int s, int [] parent){
	        if(parent[v] != -1)
	            pathTracker(parent[v], s, parent);
	        if(v != s){
	            numberOfLayovers ++;
	            System.out.print("->" +v);
	        }      
	    }
	    
	    public void path(){
	        int temp = dest;
	        int [] parent = new int[n+1];
	        boolean [] visited = new boolean[n+1];
	        int [] effectiveCost = new int[n+1];
	        int u = -1, v, i;
	        for(v = 1; v < n+1 ; v++){
	            effectiveCost[v] = 99999;
	            visited[v] = false;
	            parent[v] = -1;
	        }
	        effectiveCost[source] = 0;
	        for(i = 1; i < n+1; i++){
	            u = minCost(effectiveCost, visited);
	            visited[u] = true;
	            for(v = 1; v < n+1; v++){
	                if(((effectiveCost[u]+ cost[u][v] + (time[u][v] * k))<effectiveCost[v]) && (u != v) && (visited[v] == false)){
	                    effectiveCost[v] = effectiveCost[u]+ cost[u][v] + (time[u][v] * k);
	                    parent[v] = u;
	                }
	            }
	        }
	        System.out.print(source);
	        pathTracker(dest, source, parent);
	        while(temp != source){
	            totalTime = totalTime + time[parent[temp]][temp];
	            temp = parent[temp];
	        }
	        System.out.printf("\n");
	        totalTime = totalTime + numberOfLayovers;
	        totalCost = effectiveCost[dest] + (numberOfLayovers*k);
	        System.out.println(totalTime + "   " + totalCost);
	        
	    }
	}
