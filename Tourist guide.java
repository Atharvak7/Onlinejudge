import java.util.*;
import java.lang.Math;
class tour
{
	static ArrayList<Double> tripslist = new ArrayList<>();   // stores no. of trips for every path
	static void addEdge(int[][] adj , int start , int end , int w)
	{
		adj[start][end] = w;
		adj[end][start] = w;
	}
	
 public static void main(String args[])
	{
		int adj[][] = new int[50][50];
		Scanner sc = new Scanner(System.in);
		int vertex = sc.nextInt();
		int edges = sc.nextInt();
		
		for(int i = 0 ; i < edges ; i++)
		{
			int start = sc.nextInt();
		    int end = sc.nextInt();
			int w = sc.nextInt();
			addEdge(adj , start-1  , end-1 , w);
		}	
		int source = sc.nextInt();
		int dest = sc.nextInt();
		--source;
		--dest;
		double tourists = sc.nextInt();
		//print(adj , vertex);
		boolean[] vis = new boolean[vertex];
        ArrayList<Integer> path = new ArrayList<>();   // stores path of trip
		
        path.add(source);
        printAllPaths(source , dest , vis, path , adj , vertex, tourists , tripslist); 
		System.out.println("Minimum Number of Trips = " +Collections.min(tripslist));
		
	}
	
	static void printAllPaths(int s, int d , boolean[] vis , List<Integer>path , int[][] adj , int vertex , double tourists , List<Double>tripslist)
    {
  
        if (s == d) 
		{
            //System.out.println(path);
			int min = 19234;
			for(int i = 0 ; i < path.size()-1 ; i++) // path - 1-->2-->4-->7
			{
				if(adj[path.get(i)][path.get(i+1)] < min)
					min = adj[path.get(i)][path.get(i+1)];
			}
            double m = (double) min;
			double trips = Math.ceil(tourists/m);
			//System.out.println(trips);	
			tripslist.add(trips);
            return;
        }
       vis[s] = true;
       
		   for(int j = 0 ; j < vertex ; j++)
		   {   
	          if(adj[s][j] != 0)
			  {	  
                if (!vis[j]) 
			   {
                path.add(j);
                printAllPaths(j, d, vis, path , adj ,vertex , tourists , tripslist);
                path.remove(Integer.valueOf(j));
			   }
            }
		   }	
    
	vis[s] = false;
	
	}	
	
	
	
}
