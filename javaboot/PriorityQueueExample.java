import java.util.*;

public class PriorityQueueExample {

    // Find Min/Find Max: O(1)
    // Insert: O(log n)
    // Delete Min/Delete Max: O(log n)
    // Extract Min/Extract Max: O(log n)

    // By default PQ is a Min HEAP
    public static void normalPQ() {
    
        PriorityQueue<Integer> pQueue = new PriorityQueue<>();
        pQueue.add(10);
        pQueue.add(30);
        pQueue.add(30);
        pQueue.add(2);
        pQueue.add(50);

        System.out.println(pQueue.peek());
    }

    // By default PQ is a Min HEAP
    public static void stringPQ() {
    
        PriorityQueue<String> pQueue = new PriorityQueue<>();
        pQueue.add("Shaija");
        pQueue.add("Raj");
        pQueue.add("Azhikodan");
        pQueue.add("Jayarajan");
        pQueue.add("Akhil");

        System.out.println(pQueue.peek());
    }

    public static void maxHeap() {
        PriorityQueue<Integer> pQueue = new PriorityQueue<>(10, Collections.reverseOrder());
        pQueue.add(10);
        pQueue.add(30);
        pQueue.add(30);
        pQueue.add(2);
        pQueue.add(50);
        
        System.out.println(pQueue.peek());
    }

    static class Node {
        public int x;
        public int y; 
        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    
    public static class NodeComparator implements Comparator<Node> {
        
        public int compare(Node nodeA, Node nodeB) {
            if(nodeA.x == nodeB.x) {
                return nodeA.y < nodeB.y ? 1 : -1; 
            } else {
                return nodeA.x > nodeB.x ? 1 : -1; 
            }
        }
    }

    public static void customPQ() {
        
        PriorityQueue<Node> pQueue = new PriorityQueue<Node>(new NodeComparator());
        Node n1 = new Node(1, 4); 
        Node n2 = new Node(1, 3); 
        Node n3 = new Node(2, 4); 
        Node n4 = new Node(2, 3); 
        pQueue.add(n1);
        pQueue.add(n2);
        pQueue.add(n3);
        pQueue.add(n4);

        System.out.println(String.valueOf(pQueue.peek().x)+ " " + String.valueOf(pQueue.peek().y) );
    }

    public static void main(String args[]) {
        normalPQ();
        stringPQ();
        maxHeap();
        customPQ();
    }
}