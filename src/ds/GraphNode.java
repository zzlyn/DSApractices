package ds;

public class GraphNode {
	private Integer val;
	private GraphNode[] connections;

	public GraphNode(int value) {
		val = value;
	}

	public  void setNodes(GraphNode[] connections) {
		this.connections = connections;
	}
	
	public Integer getVal() {
		return val;
	}

	public GraphNode[] getConnections() {
		return connections;
	}

}
