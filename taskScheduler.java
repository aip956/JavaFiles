/* https://leetcode.com/problems/task-scheduler/description/
 * 1. Create task freq map; 
 * 2. Find task with highes frequ maxFreq
 * 3. Calc total time needed to execute all tasks without
 *  considering cooldown. totalTime = (maxFreq - 1) * (n + 1) + maxFreq
 * 4. Check if there are other tasks with same freq as maxFreq
 *  If so, increment total_time by the number of tasks with same maxFreq
 * 5. Return max of total_time and length of input array
 * (Total time < length of iarray, there are additional tasks that can be inserted
 *  between the most freq tasks to meet cooldown req.)
 * 
 * 
 */



public class taskScheduler {
    public static int leastInterval(char[] tasks, int n) {
        int[] taskCount = new int[26];
        int maxFreq = 0;

        // count freq of each task
        for (char task : tasks) {
            if (task >= 'A' && task <= 'Z') {
                taskCount[task - 'A']++;
                System.out.println("task: " + task);
                System.out.println("taskCount[task]: " + taskCount[task - 'A']);
            }           
        }

        // Find the task with the highest freq
        for (int count : taskCount) {
            maxFreq = Math.max(maxFreq, count);
            System.out.println("count: " + count);
            System.out.println("maxFreq: " + maxFreq);
        }

        // Calc total time without cooldown
        int totalTime = (maxFreq - 1) * (n + 1) + maxFreq;
        System.out.println("totalTime: " + totalTime);

        // Check if there are other tasks with same freq
        for (int count : taskCount) {
            if (count == maxFreq) {
                totalTime++;
                System.out.println("46count: " + count);
                System.out.println("totalTime: " + totalTime);
            }
        }
        System.out.println("50totalTime: " + totalTime);
        System.out.println("51tasks.length: " + tasks.length);
        return Math.max(totalTime, tasks.length);
    }



    public static void main(String[] args) {
        char[] tasks1 = {'A','A','A','B','B','B'};
        int n1 = 2;
        System.out.println("Output1: " + leastInterval(tasks1, n1));
    }
}
