package com.ds.graph;

public class Application {
	public static void main(String[] args) {
		BetterGraph myGraph = new BetterGraph(5, "directed");
		myGraph.addVertex("Virat");
		myGraph.addVertex("MsDhoni");
		myGraph.addVertex("Rohit");
		myGraph.addVertex("KLRahul");
		myGraph.addVertex("Bumrah");
		
		myGraph.addEdge("MsDhoni", "KLRahul");
		myGraph.addEdge("MsDhoni", "Virat");
		myGraph.addEdge("Virat", "KLRahul");
		myGraph.addEdge("Virat", "Rohit");
		myGraph.addEdge("Rohit", "Bumrah");
		myGraph.addEdge("Rohit", "MsDhoni");
		myGraph.addEdge("KLRahul", "Bumrah");
		myGraph.addEdge("Bumrah", "Virat");
		
		myGraph.print();
	}
}
