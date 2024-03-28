import java.util.*;

class RecentCounter {
    Queue<Integer> queue;
    public RecentCounter() {
        queue = new LinkedList<>();
    }
    
    public int ping(int t) {
        queue.add(t);
        while (queue.peek() < t - 3000) {
            queue.poll();
        }
        return queue.size();
    }

    public static void main(String[] args) {
        RecentCounter recentCounter = new RecentCounter();
        String[] commands = {"RecentCounter", "ping", "ping", "ping", "ping"};
        int[][] arguments = {{}, {1}, {100}, {3001}, {3002}};
        for (int i = 1; i < commands.length; i++) {
            String command = commands[i];
            int[] argument = arguments[i];

            if (command.equals("ping")) {
                int pingResult = recentCounter.ping(argument[0]);
                System.out.println("ping(" + argument[0] + ") = " + pingResult);
            } else {
                System.err.println("Invalid command: " + command);
            }
        }
    }
}

/*
 * to compile: javac numberRecentCalls.java
 * to run: java RecentCounter
 */