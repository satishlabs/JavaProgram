package com.ds.graph;

import java.util.ArrayList;

public class Graph {
	private int vCount; //Number of vertices
	private int eCount; //Number of edges
	
	private ArrayList[] adjacents; //array of integer lists
	
	public Graph(int vCount) {
		this.eCount = vCount;
		this.eCount = 0;
		adjacents = new ArrayList[vCount];
		
		for(int i=0;i<vCount; i++) {
			adjacents[i] = new ArrayList<Integer>();
		}
	}
	
	public int getVertexCount() {
		return vCount;
	}
	public int getEdgesCount() {
		return eCount;
	}
	
	public void addEdge(int src,int dest) {
		adjacents[src].add(dest);
		eCount++;
	}
	public Object[] add(int src) {
		return adjacents[src].toArray();
	}
}
