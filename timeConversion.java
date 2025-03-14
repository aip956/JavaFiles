import java.util.*;

class timeConversion {
    public static String timeConversion(String s) {
        String AMPM = s.substring(8)
        // Convert hour from string to integer
        String timePart = s.substring(0, 8);

        

        return time;
    
        }

    public static void main(String[] args) {
        String s = "12:01:00PM";
        System.out.println(timeConversion(s));

    }


}




/*
 * https://www.hackerrank.com/challenges/time-conversion/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
 * Given a time in -hour AM/PM format, convert it to military (24-hour) time.

Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
- 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.

Example
s = '12:01:00PM'
Return '12:01:00'
s = '01:01:00PM'
Return '13:01:00'.
s = '11:01:00PM'
Return '23:01:00'.
To get AM vs PM: substring(8)
To get number, substring (0, 8)
if PM
    if 12, return number part
    else, add 12

s = "12:01:00AM"
Return '00:01:00'
s = "03:01:00AM"
Return "03:01:00"
s = "11:01:00AM"
Return "11:01:00"
if AM, 
    if 12, subtract 12
    else return number
 */