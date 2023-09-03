package Graph.DisjointSet;

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
		DisjointSet.makeSet(nodeList);
		WeightedNode firstNode  = nodeList.get(0);
		WeightedNode secondNode  = nodeList.get(1);
		DisjointSet output= DisjointSet.findSet(secondNode);
		output.printAllNodesofThisSet();
		
		DisjointSet.union(firstNode, secondNode);
		output= DisjointSet.findSet(secondNode);
		output.printAllNodesofThisSet();
	}
}
