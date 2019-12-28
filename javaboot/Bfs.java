import java.util.*; 

public class Bfs {

    public static class BfsNode {
        public Node node;
        public int depth;
        public BfsNode(Node node, int depth) {
            this.node = node; 
            this.depth = depth; 
        }
    }

    public static void main(String args[]) {

        Map<Node, List<Node>> graph = Graph.getRandomAcyclicDirectedGraph();

        Set<Node> visited = new HashSet<>();
        Queue<BfsNode> frontier = new LinkedList<>(); 
        frontier.add(new BfsNode(graph.keySet().iterator().next(), 0));

        while(frontier.size() > 0) {
            BfsNode bfsNode = frontier.remove();
            if(!visited.contains(bfsNode.node)) {
                System.out.println(String.valueOf(bfsNode.node.value) + " " + String.valueOf(bfsNode.depth));
                visited.add(bfsNode.node);
                for(Node node : graph.get(bfsNode.node)) {
                    if(!visited.contains(node)) {
                        frontier.add(new BfsNode(node, bfsNode.depth + 1));
                    }
                }
            }
        }
    }
}