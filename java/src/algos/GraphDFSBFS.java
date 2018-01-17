package algos;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import ds.GraphNode;

public class GraphDFSBFS {

	/**
	 * 
	 */
	private static GraphNode constructCycleGraph() {
		GraphNode seven = new GraphNode(7);
		GraphNode eight = new GraphNode(8);
		GraphNode one = new GraphNode(1);
		GraphNode nine = new GraphNode(9);
		GraphNode ten = new GraphNode(10);
		GraphNode eleven = new GraphNode(11);
		GraphNode three = new GraphNode(3);
		GraphNode five = new GraphNode(5);

		three.setNodes(new GraphNode[] { ten });
		five.setNodes(new GraphNode[] { ten });
		ten.setNodes(new GraphNode[] { eleven, one, nine, five, three });
		eleven.setNodes(new GraphNode[] { ten });
		one.setNodes(new GraphNode[] { seven, nine, ten });
		nine.setNodes(new GraphNode[] { one, eight, ten });
		seven.setNodes(new GraphNode[] { one, eight });
		eight.setNodes(new GraphNode[] { seven, nine });
		return ten;
	}

	private static String dfs(GraphNode root) {
		StringBuilder sb = new StringBuilder();
		Stack<GraphNode> stk = new Stack<GraphNode>();

		boolean[] visited = new boolean[1000];

		stk.push(root);
		visited[root.getVal()] = true;

		while (!stk.isEmpty()) {
			GraphNode current = stk.pop();
			sb.append(current.getVal().toString() + " ");

			if (current.getConnections() != null) {

				for (int i = current.getConnections().length - 1; i > -1; i--) {
					GraphNode node = current.getConnections()[i];
					if (visited[node.getVal()] == true)
						continue;

					visited[node.getVal()] = true;
					stk.push(node);
				}

			}

		}

		return sb.toString();

	}

	private static String bfs(GraphNode root) {
		StringBuilder sb = new StringBuilder();
		Queue<GraphNode> que = new LinkedList<GraphNode>();

		boolean[] visited = new boolean[1000];

		que.add(root);
		visited[root.getVal()] = true;

		while (!que.isEmpty()) {
			GraphNode current = que.poll();
			sb.append(current.getVal().toString() + " ");

			if (current.getConnections() == null) {
				continue;
			}

			for (GraphNode node : current.getConnections()) {
				if (visited[node.getVal()] == true)
					continue;
				visited[node.getVal()] = true;
				que.add(node);
			}

		}
		return sb.toString();
	}

	public static void main(String[] args) {
		GraphNode root = constructCycleGraph();
		System.out.println("BFS: " + bfs(root));
		System.out.println("DFS: " + dfs(root));
	}

}
