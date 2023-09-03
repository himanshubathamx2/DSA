package Graph.Kruskal;

import java.util.ArrayList;

public class Cl
{
	public static void main(String[] args)
	{
		ArrayList<WeightedNode> nodeList= new ArrayList<>();
		nodeList.add(new WeightedNode("A", 1));
		nodeList.add(new WeightedNode("B", 1));
		nodeList.add(new WeightedNode("C", 1));
		nodeList.add(new WeightedNode("D", 1));
		nodeList.add(new WeightedNode("E", 1));
		
		Kruskal graph  =new Kruskal(nodeList);
		graph.addWeightedUndirectedEdge(0, 1, 5);
		graph.addWeightedUndirectedEdge(0, 2, 13);
		graph.addWeightedUndirectedEdge(0, 4, 15);
		graph.addWeightedUndirectedEdge(0, 1, 5);
		graph.addWeightedUndirectedEdge(1, 2, 10);
		graph.addWeightedUndirectedEdge(1, 3, 8);
		graph.addWeightedUndirectedEdge(2, 3, 6);
		graph.addWeightedUndirectedEdge(2, 4, 20);
		System.out.println("Running Prims's algo on graph");
		graph.kruskal();
	}
}
