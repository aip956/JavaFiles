

import java.util.*;

public class minMultToEnd {
    static int minimumMultiplications(int[] arr, int start, int end) {
        int steps = 0;
        Arrays.sort(arr);
        int product = start;
        for (int i = 0; i < arr.length; i++) {
            product *= arr[i];
            System.out.println("44Prod: " + product);
            int aft_mod = product % 10000;
            System.out.println("46aftMod: " + aft_mod);
            steps++;
            System.out.println("48steps: " + steps);
            if (aft_mod == end) {
                return steps;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        // int arr[] = {15,-2,2,-8,1,7,10,23};
        // int n = 8;
        // int arr[] = {2, 5, 7};
        int arr[] = {3, 4, 65};
        // int start = 3;
        // int end = 30;
        int start = 3;
        int end = 30;
        
        int output = minimumMultiplications(arr, start, end);
        System.out.println("Output: " + output); // Output: 
    }
}


/* 
To solve this problem, you can use a breadth-first search (BFS) algorithm. BFS is a suitable approach for finding the shortest path in unweighted graphs, which is similar to finding the minimum steps in this problem. Here's a step-by-step solution:

Initialize a queue for BFS and a visited set to keep track of visited states.

Create a class or structure to represent a state. Each state should include the current value (start) and the number of steps taken to reach it.

Add the initial state (start value and 0 steps) to the queue.

Implement a loop that continues until the queue is empty.

Inside the loop, dequeue the front state from the queue.

For each number in the array (arr), calculate the new value by multiplying the current value (start) with the number and taking the modulo 100000.

Check if the new value matches the "end" value. If it does, return the number of steps taken to reach this state.

If the new value has not been visited before, add it to the queue with the number of steps incremented by one, and mark it as visited.

If you exhaust all possible states and cannot reach the "end" value, return -1 to indicate that it's not possible to reach the target.

Here's a Java implementation of the algorithm:

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

class State {
    int value;
    int steps;

    public State(int value, int steps) {
        this.value = value;
        this.steps = steps;
    }
}

public class MinimumSteps {
    public static int minSteps(int[] arr, int start, int end) {
        Set<Integer> visited = new HashSet<>();
        Queue<State> queue = new ArrayDeque<>();
        queue.offer(new State(start, 0));

        while (!queue.isEmpty()) {
            State currentState = queue.poll();

            if (currentState.value == end) {
                return currentState.steps;
            }

            for (int num : arr) {
                int newValue = (currentState.value * num) % 100000;
                if (!visited.contains(newValue)) {
                    visited.add(newValue);
                    queue.offer(new State(newValue, currentState.steps +

*/