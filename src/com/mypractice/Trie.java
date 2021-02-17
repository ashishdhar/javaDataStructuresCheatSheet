package com.mypractice;

public class Trie {
    TrieNode root;

    public Trie(){
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode current = root;

        for (char ch: word.toCharArray()) {
            current = current.getChildren().computeIfAbsent(ch, c -> new TrieNode());
        }
        current.isWordEnd = true;
    }

    public boolean find(String word) {
        TrieNode current = root;

        for (char ch: word.toCharArray()) {
            current = current.getChildren().get(ch);
            if (current == null) {
                return false;
            }
        }
        return current.isWordEnd == true ? true : false;
    }
}
