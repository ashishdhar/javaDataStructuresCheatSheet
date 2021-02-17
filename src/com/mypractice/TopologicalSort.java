package com.mypractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Collectors;

public class TopologicalSort {

    public static List<String> topSort(Graph G) {
        Map<String, Integer> count = new HashMap<>();
        for(Map.Entry<String, Set<String>> entry : G.getNodes().entrySet() ){
            count.put(entry.getKey(), 0);
        }
        for(Map.Entry<String, Set<String>> entry : G.getNodes().entrySet() ){
            for(String adjNode: entry.getValue()) {
                Integer numOfInEdges = count.get(adjNode);
                count.put(adjNode, numOfInEdges + 1);
            }
        }
        System.out.println(count);
        List<String> sortedGraph = new ArrayList<>();
        Queue<String> Q = new LinkedList<>();
        count.entrySet().stream()
                .filter(stringIntegerEntry -> stringIntegerEntry.getValue() == 0)
                .map(stringIntegerEntry -> stringIntegerEntry.getKey())
                .collect(Collectors.toList())
        .forEach(n -> Q.add(n));
        while (!Q.isEmpty()) {
            String node = Q.remove();
            sortedGraph.add(node);
            for(String adjoining: G.getNodes().get(node)){
                int indegree = count.get(adjoining);
                count.put(adjoining, indegree - 1);
                if (count.get(adjoining) == 0) {
                    Q.add(adjoining);
                }
            }
        }

        return sortedGraph;
    }
}
