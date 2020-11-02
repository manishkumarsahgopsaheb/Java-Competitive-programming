import java.util.*;
class Link_state_routing {
	final static int V = 4;
	static int minDistance(int dist[],boolean sptSet[]) {
		int min = Integer.MAX_VALUE;	int min_index=0;
		for(int v=0;v<V;v++) {
			if(sptSet[v]==false && dist[v]<=min){
				min=dist[v];	min_index=v;
			}
		}
		return min_index;
	}
	static void printSolution(int dist[]) {
		System.out.println("Node number || Distance from source node");
		for(int i=0;i<V;i++) {
			System.out.println(i+" || "+dist[i]);
		}
	}
	static void run_Link_state_routing(int graph[][],int src) {
		int dist[] = new int[V];	
		boolean sptSet[] = new boolean[V];
		for(int i=0;i<V;i++) {
			dist[i] = Integer.MAX_VALUE;	sptSet[i] = false;
		}
		dist[src]=0;
		for(int count=0;count<V-1;count++) {
			int u = minDistance(dist,sptSet);
			sptSet[u]=true;
			for(int v=0;v<V;v++) {
				if(sptSet[v]==false && graph[u][v]>0 && dist[u]!=Integer.MAX_VALUE && dist[u]+graph[u][v]<dist[v]) {
					dist[v]=dist[u]+graph[u][v];
				}
			}
		}
		printSolution(dist);
	}
	public static void main(String []args) {
		int graph[][] = {{0,2,0,1},{2,0,3,7},{0,3,0,11},{1,7,11,0}};
		run_Link_state_routing(graph,0);
	}
}
