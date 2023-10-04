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
    public int leastInterval(char[] tasks, int n) {
        
    }



    public static void main(String[] args) {
        char[] tasks1 = { "A","A","A","B","B","B" };
        int n1 = 2;
        System.out.println("Output1: " + leastInterval(tasks1, n1));
    }
}
