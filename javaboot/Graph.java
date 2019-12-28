import java.util.*; 

public class Graph {

                     
    /*             /----> 5 -> 10 -> 11 -> 14
        1 -> 2 -> 4-> 6 -> 8 /  \         /
              \-> 3 /       /    12 -> 13
                   \->7    /       
                      \-> 9   
    */
    public static Map<Node, List<Node>> getRandomAcyclicDirectedGraph() {

        Map<Node, List<Node>> adjList = new HashMap<>(); 
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        Node n8 = new Node(8);
        Node n9 = new Node(9);
        Node n10 = new Node(10);
        Node n11 = new Node(11);
        Node n12 = new Node(12);
        Node n13 = new Node(13);
        Node n14 = new Node(14);

        adjList.put(n1, new ArrayList<>());
        adjList.put(n2, new ArrayList<>());
        adjList.put(n3, new ArrayList<>());
        adjList.put(n4, new ArrayList<>());
        adjList.put(n5, new ArrayList<>());
        adjList.put(n6, new ArrayList<>());
        adjList.put(n7, new ArrayList<>());
        adjList.put(n8, new ArrayList<>());
        adjList.put(n9, new ArrayList<>());
        adjList.put(n10, new ArrayList<>());
        adjList.put(n11, new ArrayList<>());
        adjList.put(n12, new ArrayList<>());
        adjList.put(n13, new ArrayList<>());
        adjList.put(n14, new ArrayList<>());
        
        adjList.get(n1).add(n2);

        adjList.get(n2).add(n3);
        adjList.get(n2).add(n4);

        adjList.get(n3).add(n7);
        adjList.get(n3).add(n6);

        adjList.get(n4).add(n5);
        adjList.get(n4).add(n6);
        
        adjList.get(n5).add(n10);

        adjList.get(n6).add(n8);

        adjList.get(n7).add(n9);
        
        adjList.get(n9).add(n10);

        adjList.get(n10).add(n11);
        adjList.get(n10).add(n12);

        adjList.get(n11).add(n14);

        adjList.get(n12).add(n13);

        adjList.get(n13).add(n14);
        
        return adjList;
    }

}