package com.mypractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Graph {
    Map<String, Set<String>> nodes = new HashMap<>();

    public Map<String, Set<String>> getNodes() {
        return nodes;
    }

    public Graph addNode(String node) {
        if (!nodes.containsKey(node)) {
            nodes.put(node, new HashSet<>());
        }
        return this;
    }

    public Graph addEdge(String fromNode, String toNode) {
        if (nodes.containsKey(fromNode)) {
            nodes.get(fromNode).add(toNode);
        }
        return this;
    }

    @Override
    public String toString() {
        String graphStructure = "";
        for(Map.Entry<String, Set<String>> entry : nodes.entrySet() ){
            graphStructure = graphStructure + "Node = " + entry.getKey() + " Adjacency list = ";
            for(String adjNode : entry.getValue()) {
                graphStructure = graphStructure + adjNode + ",";
            }
            graphStructure = graphStructure  + "\n";
//            System.out.println("Key = " + entry.getKey() +
//                    ", Value = " + entry.getValue());
        }
        return  graphStructure;
    }

}
