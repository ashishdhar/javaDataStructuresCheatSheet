package com.mypractice;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {

    private Map<Character, TrieNode> elements;
    public boolean isWordEnd;

    public Map<Character, TrieNode> getChildren() {
        return elements;
    }

    public TrieNode(){
        elements = new HashMap<>();
    }

}
