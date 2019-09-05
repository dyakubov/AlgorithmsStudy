package lesson7;

public class Main7 {

    public static void main(String[] args) {
        testGraph();

    }

    private static void testGraph() {
        Graph graph = new Graph(10);
        graph.addVertex("Москва");
        graph.addVertex("Тула");
        graph.addVertex("Рязань");
        graph.addVertex("Калуга");
        graph.addVertex("Липецк");
        graph.addVertex("Тамбов");
        graph.addVertex("Орел");
        graph.addVertex("Саратов");
        graph.addVertex("Курск");
        graph.addVertex("Воронеж");

        graph.addEdges("Москва",
                "Тула",
                "Рязань",
                "Калуга");

        graph.addEdge("Тула", "Липецк");
        graph.addEdge("Липецк", "Воронеж");

        graph.addEdge("Рязань", "Тамбов");
        graph.addEdge("Тамбов", "Саратов");
        graph.addEdge("Саратов", "Воронеж");

        graph.addEdge("Калуга", "Орел");
        graph.addEdge("Орел", "Курск");
        graph.addEdge("Курск", "Воронеж");


        graph.showShortestRout("Москва", "Воронеж");
    }
}