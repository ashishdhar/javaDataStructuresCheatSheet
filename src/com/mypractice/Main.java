package com.mypractice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.Stack;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        Graph G = new Graph();
        G.addNode("a")
                .addNode("b")
                .addNode("c")
                .addNode("d")
                .addNode("e")
                .addNode("f")
                .addEdge("a", "b")
                .addEdge("a", "f")
                .addEdge("b", "c")
                .addEdge("b", "d")
                .addEdge("c", "d")
                .addEdge("d", "e")
                .addEdge("d", "f")
                .addEdge("e", "f");
        System.out.println(G);

        List<String> TopSorted = TopologicalSort.topSort(G);
        System.out.println(TopSorted);
       // create a list using the
        List<String> list = Arrays.asList("Lars", "Simon");
        // use type inference for ArrayList
        List<Integer> list1 = Arrays.asList(3,2,1,4,5,6,6);
        list.sort((s1, s2) -> s1.compareToIgnoreCase(s2));
        Collections.sort(list1);
        System.out.println(Collections.max(list1));
        System.out.println(Collections.min(list1));
        System.out.println(Collections.frequency(list1, 6));
        Collections.sort(list1);
        int index = Collections.binarySearch(list1, 4);
        System.out.println("index of 4 = " + index);
        System.out.println(list1);
        Collections.rotate(list1, 3);
        System.out.println(list1);
        Collections.sort(list1, Collections.reverseOrder());


        System.out.println("index" + index);

        //ARRAYS
        // Here array is the array name of int type
        int[] array = new int[4];
        System.out.println("The size of the array is " + array.length);

        // Here str is a string object
        String str = "testing123456";
        System.out.println("The size of the String is " + str.length());

	    // LINKED LIST code.
        LinkedList<String> ll = new LinkedList<>();

        // Adding elements to the linked list
        ll.add("Lucknow");
        ll.add("Delhi");
        ll.addLast("Mumbai");
        ll.addFirst("Dubai");
        ll.add(2, "Ernakulam");

        System.out.println(ll);

        ll.remove("Delhi");
        ll.remove(3);
        ll.removeFirst();
        ll.removeLast();

        System.out.println(ll);

        ll.push("Bangalore");
        ll.pop();
        ll.push("Hyderabad");
        System.out.println(ll);

        //HASH MAP


        Map<String, Integer> map = new HashMap<>();
        map.put("Ashpro", 1);
        map.put("RomCom", 2);
        map.put("PukPukDeepak", 3);
        map.forEach((k, v) -> System.out.printf("%s %s%n", k, v));
        // convert keys to list
        List<String> list5 = new ArrayList<>(map.keySet());
        for (String string : list) {
            System.out.println(string);
        }
        System.out.println("map.containsKey(\"Ashpro\") = " + map.containsKey("Ashpro"));
        System.out.println("map.get(Ashpro) = " +  map.get("Ashpro"));
        map.remove("Ashpro");
        System.out.println("map size = " + map.size());
        System.out.println("map.get(Ashpro) = " +  map.get("Ashpro"));
        map.put("RomCom", 6);
        System.out.println("map.get(RomCom) = " +  map.get("RomCom"));
        System.out.println("map.getOrDefault(Ashpro) = " + map.getOrDefault("Ashpro", 100));
        map.computeIfAbsent("key5", k -> 1001);
        for(Map.Entry<String, Integer> entry : map.entrySet() ){
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
        }
        // TREE MAP & SORTED MAP
        SortedMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(new Integer(3), "cool");
        treeMap.put(new Integer(2), "is");
        treeMap.put(new Integer(1), "ashish");
        treeMap.put(new Integer(6), "fool");
        treeMap.put(new Integer(5), "is");
        treeMap.put(new Integer(4), "reshu");
        System.out.println(treeMap);
        System.out.println(treeMap.subMap(3, 7));
        treeMap.remove(5);
        System.out.println(treeMap);

        SortedMap<String, String> tm
                = new TreeMap<>(new Comparator<String>() {
            public int compare(String a, String b)
            {
                return b.compareTo(a);
            }
        });

        // Adding elements into the TreeMap
        // using put()
        tm.put("India", "1");
        tm.put("Australia", "2");
        tm.put("South Africa", "3");

        // Displaying the TreeMap
        System.out.println(tm);

        // Removing items from TreeMap
        // using remove()
        tm.remove("Australia");
        System.out.println("Map after removing "
                + "Australia:" + tm);

        //SET
        // Set demonstration using HashSet
        Set<String> hash_Set
                = new HashSet<String>();

        hash_Set.add("Geeks");
        hash_Set.add("For");
        hash_Set.add("Geeks");
        hash_Set.add("Example");
        hash_Set.add("Set");


        System.out.println(hash_Set);
        System.out.println("hash_Set.size() = " + hash_Set.size());
        hash_Set.remove("Geeks");
        hash_Set.removeIf(s -> s.equals("Set"));
        hash_Set.forEach(s -> System.out.println(s + "append"));
        System.out.println("hash_Set.contains(\"Geeks\") = " + hash_Set.contains("Geeks"));

        Set<Integer> a = new HashSet<Integer>();
        a.addAll(Arrays.asList(new Integer[] {1, 3, 2, 4, 8, 9, 0}));
        Set<Integer> b = new HashSet<Integer>();
        b.addAll(Arrays.asList(new Integer[] {1, 3, 7, 5, 4, 0, 7, 5}));

        // To find union
        Set<Integer> union = new HashSet<Integer>(a);
        union.addAll(b);
        System.out.print("Union of the two Set");
        System.out.println(union);

        // To find intersection
        Set<Integer> intersection = new HashSet<Integer>(a);
        intersection.retainAll(b);
        System.out.print("Intersection of the two Set");
        System.out.println(intersection);

        // To find the symmetric difference
        Set<Integer> difference = new HashSet<Integer>(a);
        difference.removeAll(b);
        System.out.print("Difference of the two Set");
        System.out.println(difference);

        //PRIORITY QUEUE
        // Creating empty priority queue
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();

        // Adding items to the pQueue using add()
        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(15);
        pQueue.add(5);
        pQueue.add(50);



        // Printing the top element of PriorityQueue
        System.out.println(pQueue.peek());

        // Printing the top element and removing it
        // from the PriorityQueue container
        System.out.println(pQueue.poll());

        // Printing the top element again
        System.out.println(pQueue.peek());

        //STACKS
        //creating an instance of Stack class
        Stack<Integer> stk= new Stack<>();
        // checking stack is empty or not
        boolean result = stk.empty();
        System.out.println("Is the stack empty? " + result);
        // pushing elements into stack
        stk.push(78);
        stk.push(113);
        stk.push(90);
        stk.push(120);
        System.out.println(stk.pop());
        System.out.println(stk.peek());
        //prints elements of the stack
        System.out.println("Elements in Stack: " + stk);
        result = stk.empty();
        System.out.println("Is the stack empty? " + result);

        //QUEUE
        Queue<Integer> q = new LinkedList<>();

        // Adds elements {0, 1, 2, 3, 4} to
        // the queue
        for (int i = 0; i < 5; i++)
            q.add(i);

        // Display contents of the queue.
        System.out.println("Elements of queue " + q);

        // To remove the head of queue.
        int removedele = q.remove();
        System.out.println("removed element-" + removedele);

        System.out.println(q);

        // To view the head of queue
        int head = q.peek();
        System.out.println("head of queue-" + head);

        // Rest all methods of collection
        // interface like size and contains
        // can be used with this
        // implementation.
        int size = q.size();
        System.out.println("Size of queue-" + size);

        //ARRAYLIST
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(1);
        l1.add(0,2);
        l1.add(l1.size(), 3);
        //list to set
        Set<Integer> hSet = new HashSet<>(l1);
        System.out.println("hSet.contains(3) = " + hSet.contains(3));
        System.out.println(l1.indexOf(3));
        System.out.println(l1);
        System.out.println(l1.get(l1.size()-1));
        l1.set(l1.indexOf(3), 4);
        System.out.println(l1);
        l1.remove((Integer) 1);
        l1.remove(0);
        System.out.println(l1);

        //STRING
        String str123 = "My-name-is-Ashish";
        String[] sarr = str123.split("-");
        for (String s: sarr) {
            System.out.println(s);
        }
        List myList = Arrays.asList(sarr);
        System.out.println(myList.contains("name"));

        //TODO MATH https://www.guru99.com/math-java.html

        System.out.println("Trie Stuff !!!");

        Trie T = new Trie();
        T.insert("abc");
        T.insert("abd");
        T.insert("bda");
        T.insert("bdaacb");

        System.out.println(T.find("abc"));
        System.out.println(T.find("abd"));
        System.out.println(T.find("xyz"));
        System.out.println(T.find("abcde"));
        System.out.println(T.find("bdaacb"));

    }


}
