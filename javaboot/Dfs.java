import java.util.*; 

public class Dfs {

    public static class DfsNode {
        public Node node;
        public int depth;
        public DfsNode(Node node, int depth) {
            this.node = node; 
            this.depth = depth; 
        }
    }

    public static void main(String args[]) {

        Map<Node, List<Node>> graph = Graph.getRandomAcyclicDirectedGraph();

        Set<Node> visited = new HashSet<>();
        Stack<DfsNode> frontier = new Stack<>(); 
        frontier.add(new DfsNode(graph.keySet().iterator().next(), 0));

        while(frontier.size() > 0) {
            DfsNode dfsNode = frontier.pop();
            if(!visited.contains(dfsNode.node)) {
                System.out.println(String.valueOf(dfsNode.node.value) + " " + String.valueOf(dfsNode.depth));
                visited.add(dfsNode.node);
                for(Node node : graph.get(dfsNode.node)) {
                    if(!visited.contains(node)) {
                        frontier.add(new DfsNode(node, dfsNode.depth + 1));
                    }
                }
            }
        }
    }
}