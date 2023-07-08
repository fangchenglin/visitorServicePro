package com.sx.visitorService.DTO;

import java.util.*;

public class Graph {
    private Map<Character, Map<Character, Integer>> adjacencyMap;

    public Graph() {
        adjacencyMap = new HashMap<>();
    }

    public void addEdge(char start, char end, int distance) {
        adjacencyMap.putIfAbsent(start, new HashMap<>());
        adjacencyMap.get(start).put(end, distance);

        // Assuming the graph is undirected
        adjacencyMap.putIfAbsent(end, new HashMap<>());
        adjacencyMap.get(end).put(start, distance);
    }

    public List<Character> shortestPath(char start, char end) {
        Map<Character, Integer> distances = new HashMap<>();
        Map<Character, Character> previousNodes = new HashMap<>();
        PriorityQueue<Character> minHeap = new PriorityQueue<>(Comparator.comparingInt(distances::get));

        distances.put(start, 0);
        minHeap.add(start);

        while (!minHeap.isEmpty()) {
            char currentNode = minHeap.poll();

            if (currentNode == end) {
                break; // Reached the destination
            }

            if (!adjacencyMap.containsKey(currentNode)) {
                continue;
            }

            for (char neighbor : adjacencyMap.get(currentNode).keySet()) {
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

        List<Character> path = new ArrayList<>();
        char currentNode = end;

        while (currentNode != start) {
            path.add(0, currentNode);
            currentNode = previousNodes.get(currentNode);
        }

        path.add(0, start);

        return path;
    }
    public void  initGraph(){
        addEdge('A', 'B', 5);
        addEdge('A', 'C', 8);
        addEdge('A', 'D', 3);
        addEdge('B', 'E', 6);
        addEdge('B', 'F', 2);
        addEdge('C', 'G', 4);
        addEdge('D', 'H', 9);
        addEdge('E', 'I', 7);
        addEdge('F', 'J', 1);
        addEdge('G', 'J', 3);
    }
    public static void main(String[] args) {
        Graph graph = new Graph();

        // Add edges with distances
        graph.addEdge('A', 'B', 5);
        graph.addEdge('A', 'C', 8);
        graph.addEdge('A', 'D', 3);
        graph.addEdge('B', 'E', 6);
        graph.addEdge('B', 'F', 2);
        graph.addEdge('C', 'G', 4);
        graph.addEdge('D', 'H', 9);
        graph.addEdge('E', 'I', 7);
        graph.addEdge('F', 'J', 1);
        graph.addEdge('G', 'J', 3);

        // Example usage
        List<Character> path = graph.shortestPath('A', 'C');
        System.out.println("Shortest path from A to C: " + path);

        path = graph.shortestPath('B', 'J');
        System.out.println("Shortest path from B to J: " + path);
    }
}
