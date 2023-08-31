package Graph.AdjacencyMatrix;

import java.util.ArrayList;

public class CL
{
	public static void main(String[] args)
	{
		ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
		nodeList.add(new GraphNode("A", 0));
		nodeList.add(new GraphNode("B", 1));
		nodeList.add(new GraphNode("C", 2));
		nodeList.add(new GraphNode("D", 3));
		nodeList.add(new GraphNode("E", 4));
		
		Graph g= new Graph(nodeList);
		g.addUndirectedEdge(0, 1);
		g.addUndirectedEdge(0, 2);
		g.addUndirectedEdge(0, 3);
		g.addUndirectedEdge(1, 4);
		g.addUndirectedEdge(2, 3);
		g.addUndirectedEdge(3, 4);
		
		System.out.println(g.toString());
											//		  A B C D E 
											//		  A: 0 1 1 1 0 
											//		  B: 1 0 0 0 1 
											//		  C: 1 0 0 1 0 
											//		  D: 1 0 1 0 1 
											//		  E: 0 1 0 1 0 
//		g.bfs();//A B C D E
		g.dfs();////A D E C B
		
		
	}
}
