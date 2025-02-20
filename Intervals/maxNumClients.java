import java.util.*;

class maxNumClients {
    public static int getMaxTrafficTime(List<Integer> start, List<Integer> end) {
        // error check

        // initialize return
        List<int[]> events = new ArrayList<>();

        // Convert start and end times into events
        for (int s : start) {
            events.add(new int[] {s, +1}); // Start event
        }
        for (int e : end) {
            events.add(new int[]{e, -1}); // End event
        }

        // Sort by time, by end
        events.sort((a, b) -> a[0] == b[0] ? Integer.compare(b[1], a[1]) : Integer.compare(a[0], b[0]));

        int activeClients = 0;
        int maxClients = 0;
        int earliestTime = -1;

        // Sweep through events
        for (int[] event : events) {
            activeClients += event[1]; // +1 if start, -1 if end

            if (activeClients > maxClients) {
                maxClients = activeClients;
                earliestTime = event[0]; // update earliest time of max clients
            }
        }
        return earliestTime;
    }

    public static void main(String[] args) {
        List<Integer> start = Arrays.asList(1, 6, 2, 9);
        List<Integer> end = Arrays.asList(8, 7, 6, 10);
        System.out.println(getMaxTrafficTime(start, end));
    }
}








/*
Create an event for each start/end time
start times (time, +1) client starts
end times (time, -1) client ends

Sort all events by time first
If 2 events have the same time, process end times (-1)
before start times

Sweep through the sorted events, maintaining:
activeClients: Num of currently active
maxClients: Max num of concurrent clients
earliestTime: Earliest time when maxClients was reached

O(n log n)

 * There is a client-server architecture with n clients
 * and one server. Each client starts its interaction 
 * with the server at the second start[i] and stops at
 * the second end[i]. The maximum traffic is defined as
 * the max number of concurrent interactions with the 
 * server.
 * 
 * Find the earliest time at which the amx number of clients
 * are interacting with the server.
 */