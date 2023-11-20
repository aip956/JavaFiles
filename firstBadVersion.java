public class firstBadVersion {
    public int firstBadVersion(int n) {
        // divide n by 2; that is the pivot; isBadVersion(mid) = false; number is good
        // if mid = true, mid = mid / 2
        // if mid = false, mid = (mid + bad) / 2
        int left = n - 1;
        int right = 0;
        int mid = n / 2;
        System.out.println("mid: " + mid);
        while (!isBadVersion(mid))
        if (!isBadVersion(mid)) {
            System.out.println("mid is good: " + !isBadVersion(mid));
            mid = mid / 2;
        } else {
            System.out.println("mid is good: " + !isBadVersion(mid));
            mid = (n+mid) / 2;
        }
        
    }

    public static void main(String[] args) {
        int n = 10;
        int bad = 8;
        System.out.println("Output1: " + firstBadVersion(n));
    }
}


/*
 *  https://leetcode.com/problems/first-bad-version/
 */