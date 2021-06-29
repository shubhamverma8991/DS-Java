package adjacencymatrix;

import java.util.Scanner;

public class GraphDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many vertices?");
		int v = sc.nextInt();
		Graph g = new Graph(v);
		int src,tgt;
		System.out.println("Input the Source and Target vertex for which edge exists -1 to end");
		src = sc.nextInt();
		tgt = sc.nextInt();
		do
		{
			g.addEdge(src, tgt);
			System.out.println("Input the Source and Target vertex for which edge exists -1 to end");
			src = sc.nextInt();
			tgt = sc.nextInt();
		} while (src!=-1);
		g.show();
		
		
		g.bft(0);
		g.dft(0);
		sc.close();
	}

	}


