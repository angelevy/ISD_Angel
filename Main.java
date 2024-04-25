public class Main {
    public static void main(String[] args) {
        AdjacencyList angel = new AdjacencyList(9);
        angel.addEdge('A', 'D');
        angel.addEdge('A', 'B');
        angel.addEdge('A', 'E');
        angel.addEdge('D', 'G');
        angel.addEdge('G', 'H');
        angel.addEdge('H', 'I');
        angel.addEdge('I', 'F');
        angel.addEdge('F', 'C');
        angel.addEdge('C', 'B');
        angel.addEdge('B', 'E');
        angel.addEdge('E', 'H');
        angel.addEdge('E', 'F');
        angel.addEdge('F', 'H');

        angel.printGraph();
    }
}