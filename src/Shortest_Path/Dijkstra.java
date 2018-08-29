package Shortest_Path;

// this algorithm does not work for any negative weighted value

import java.util.*;
//import java.util.LinkedList;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.LinkedHashSet;
//import java.util.Iterator;
//import java.util.PriorityQueue;
//import java.util.Scanner;

class Pair3 implements Comparable <Pair3>{
	private Integer wt, v;

	public Pair3(int wt, int v) {
		this.wt = wt;
		this.v = v;
	}
	public int getWt() {
		return wt;
	}
	public int getV() {
		return v;
	}
	@Override
	public int compareTo(Pair3 o) {
		return wt.compareTo(o.wt);
	}	
}

public class Dijkstra {
	
	private int vertex, edge;
	private int[] cnt;
	private int[] parent;
	private PriorityQueue <Pair3> q;
	private LinkedHashSet <Integer> set;
	private LinkedList <Pair3> adj[];
	
	public Dijkstra(int v, int eg, int size) {
		vertex = v;
		edge = eg;
		cnt = new int[size];
		parent = new int[size];
		Arrays.fill(cnt, Integer.MAX_VALUE);
		q = new PriorityQueue<>();
		set = new LinkedHashSet<>();
		adj = new LinkedList[size];
		for(int i = 0; i < size; i++) {
			adj[i] = new LinkedList<>();
		}
	}
	
	public void addEdge(int a, int b, int wt) {
		adj[a].add(new Pair3(wt, b));
		adj[b].add(new Pair3(wt, a));
	}
	
	public void dijkstra(int src, int d) {
		q.add(new Pair3(0, src));
		cnt[src] = 0;
		while(!q.isEmpty()) {
			int u = q.poll().getV();
			Iterator<Pair3> it = adj[u].iterator();
			while(it.hasNext()) {
				Pair3 next = it.next();
				int v = next.getV();
				int wt = next.getWt();
				if(cnt[v] > cnt[u] + wt) {
					cnt[v] = cnt[u] + wt;
					q.add(new Pair3(cnt[v], v));
					parent[v]= u;
				}
			}
		}
		Iterator <Integer> it = set.iterator();
		while(it.hasNext()) {
			int next = it.next();
			System.out.println(src + " --> " + next + " = " + cnt[next]);
		}
		ArrayList <Integer> list = new ArrayList<>();
		for(int v = d; v != src; v = parent[v]) {
			list.add(v);
		}
		list.add(src);
		Collections.reverse(list);
		Iterator <Integer> i = list.iterator();
		while(i.hasNext()) {
			System.out.print(i.next() + " --> ");
		}
		System.out.println("tata");
	}
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int size = 200;
		int v = cin.nextInt();
		int eg = cin.nextInt();
		Dijkstra g = new Dijkstra(v, eg, size);
		for(int i = 0; i < eg; i++) {
			int a = cin.nextInt();
			int b = cin.nextInt();
			g.addEdge(a, b, cin.nextInt());
			
			// for printing
                        
			g.set.add(a);
			g.set.add(b);
		}
		int source = cin.nextInt();
		int destination = cin.nextInt();
		g.dijkstra(source, destination);
		cin.close();
	}
}

/*
sample input

3 3
1 2 5
2 3 5
1 3 9
1 3

5 7
1 2 10
1 3 20
2 4 5
2 3 30
4 3 15
4 5 8
3 5 6
1 5

*/
