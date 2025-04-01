

class BeautifulDay {
    public static int beautifulDays(int i, int j, int k) {
        // Write your code here
    
        }

    public static int reverse(int i) {
        int reversed;
        while (i % 10 > 0) {
            // 4321
            int mod = i % 10; // 1
            int mod10 = mod * 10; // 10, 20
            reversed += mod10; // 10
            i /= 10; // 32
        }
    }


}


/*

reverse (number)
number = abs val of number
int reversed = 0

while number/10 > 0
    number = 321, 32, 3
    int mod = number % 10 (321 % 10 = 1), 2, 3
    reversed += mod = 1, 10+2=12, 120+3=123

    reversed *= 10 (= 10), 120
    number /= 10 = 32, 3

Determine reverse number
4321 => 432
4321%10 = 1 => 2
4321/10 = 432 => 43
rev+1 => 1  => 10+2
rev *= 10 = 10 => 12

num = 4321
mod = num%10  => 1
rev += mod = 1
rev *= 10 = 10
num /= 10 = 432

num = 432
mod = num%10  => 2
rev += mod = 10 + 2 = 12
rev *= 10 = 120
num /= 10 = 43

num = 43
mod = num%10  => 3
rev += mod = 120 = 123
rev *= 10 = 1230
num /= 10 = 4

num = 4
mod = num%10  => 4
rev += mod = 120 = 1234


abs(Num - rev) % k == 0, Beautiful

 * Beautiful Days at the Movies
https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
Lily likes to play games with integers. She has created a new game where she determines the difference between a number and its reverse. For instance, given the number , its reverse is . Their difference is . The number  reversed is , and their difference is .

She decides to apply her game to decision making. 
She will look at a numbered range of days and will 
only go to a movie on a beautiful day.

Given a range of numbered days,  and a number , 
determine the number of days in the range that are 
beautiful. Beautiful numbers are defined as numbers 
where  is evenly divisible by . If a day's value 
is a beautiful number, it is a beautiful day. 
Return the number of beautiful days in the range.

Function Description

Complete the beautifulDays function in the editor below.

beautifulDays has the following parameter(s):

int i: the starting day number
int j: the ending day number
int k: the divisor
Returns

int: the number of beautiful days in the range
Input Format

A single line of three space-separated integers describing the respective values of , , and .

Constraints

Sample Input

20 23 6
Sample Output

2
Explanation

Lily may go to the movies on days , , , and . We perform the following calculations to determine which days are beautiful:

Day  is beautiful because the following evaluates to a whole number: 
Day  is not beautiful because the following doesn't evaluate to a whole number: 
Day  is beautiful because the following evaluates to a whole number: 
Day  is not beautiful because the following doesn't evaluate to a whole number: 
Only two days,  and , in this interval are beautiful. Thus, we print  as our answer.
 */