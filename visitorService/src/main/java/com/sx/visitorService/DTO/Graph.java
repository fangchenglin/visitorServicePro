package com.sx.visitorService.DTO;

import java.util.*;

public class Graph {
    private Map<String, Map<String, Integer>> adjacencyMap;

    public Graph() {
        adjacencyMap = new HashMap<>();
    }

    public void addEdge(String start, String end, int distance) {
        adjacencyMap.putIfAbsent(start, new HashMap<>());
        adjacencyMap.get(start).put(end, distance);

        // Assuming the graph is undirected
        adjacencyMap.putIfAbsent(end, new HashMap<>());
        adjacencyMap.get(end).put(start, distance);
    }

    public List<String> shortestPath(String start, String end) {
        Map<String, Integer> distances = new HashMap<>();
        Map<String, String> previousNodes = new HashMap<>();
        PriorityQueue<String> minHeap = new PriorityQueue<>(Comparator.comparingInt(distances::get));

        distances.put(start, 0);
        minHeap.add(start);

        while (!minHeap.isEmpty()) {
            String currentNode = minHeap.poll();

            if (currentNode == end) {
                break; // Reached the destination
            }

            if (!adjacencyMap.containsKey(currentNode)) {
                continue;
            }

            for (String neighbor : adjacencyMap.get(currentNode).keySet()) {
                int distance = distances.get(currentNode) + adjacencyMap.get(currentNode).get(neighbor);

                if (!distances.containsKey(neighbor) || distance < distances.get(neighbor)) {
                    distances.put(neighbor, distance);
                    previousNodes.put(neighbor, currentNode);
                    minHeap.add(neighbor);
                }
            }
        }

        if (!distances.containsKey(end)) {
            return Collections.emptyList(); // No path found
        }

        List<String> path = new ArrayList<>();
        String currentNode = end;

        while (currentNode != start) {
            path.add(0, currentNode);
            currentNode = previousNodes.get(currentNode);
        }

        path.add(0, start);

        return path;
    }
    public void  initGraph(){
        addEdge("store1", "t1", 1);
        addEdge("t1", "t2", 3);
        addEdge("t2", "museum", 3);
        addEdge("t1", "t3", 2);
        addEdge("t3", "t4", 1);
        addEdge("t4", "museum", 2);
        addEdge("t2", "coffee", 2);
        addEdge("coffee", "wheel", 2);
        addEdge("museum", "t6", 3);
        addEdge("t6", "wheel", 1);
        addEdge("t6", "t7", 1);
        addEdge("t7", "wheel", 1);
        addEdge("t8", "t7", 4);
        addEdge("t8", "t9", 3);
        addEdge("t9", "t10", 5);
        addEdge("t10", "gate", 2);
        addEdge("gate", "t11", 2);
        addEdge("t11", "t12", 2);
        addEdge("t10", "t12", 2);
        addEdge("t12", "education", 1);
        addEdge("t12", "t13", 2);
        addEdge("t13", "t14", 3);
        addEdge("t14", "opera", 2);
        addEdge("t14", "t15", 1);
        addEdge("t15", "t16", 1);
        addEdge("t16", "t17", 2);
        addEdge("t17", "town", 5);
        addEdge("town", "t18", 1);
        addEdge("t18", "t19", 2);
        addEdge("t19", "t20", 3);
        addEdge("t20", "t21", 3);
        addEdge("t21", "store1", 1);
        addEdge("t14", "t22", 2);
        addEdge("t22", "hotel", 2);
        addEdge("hotel", "rest", 1);
        addEdge("swan", "rest", 1);
        addEdge("swan", "peafowl", 2);
        addEdge("t16", "peafowl", 1);
        addEdge("t23", "t20", 3);
        addEdge("t23", "t24", 3);
        addEdge("t24", "museum", 3);
        addEdge("t24", "t25", 2);
        addEdge("t26", "t25", 3);
        addEdge("t26", "t9", 4);
        addEdge("t17", "t27", 1);
        addEdge("t27", "t28", 2);
        addEdge("t19", "t28", 3);
        addEdge("t24", "t28", 3);







    }
    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.initGraph();



        // Example usage
        List<String> path = graph.shortestPath("store1", "wheel");
        System.out.println("Shortest path from A to C: " + path);

//        path = graph.shortestPath("B1", "J1");
//        System.out.println("Shortest path from B1 to J1: " + path);
    }
}
