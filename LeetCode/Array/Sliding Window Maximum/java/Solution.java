import java.util.*;

public class Solution {
    public int[] maxSlidingWindow(int[] a, int k) {
        if (a == null || k <= 0) {
            return new int[0];
        }

        int n = a.length;
        int[] result = new int[n - k + 1];
        int ri = 0;
        Deque<Integer> q = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            // Remove indices that are out of the current window
            while (!q.isEmpty() && q.peek() < i - k + 1)
                q.poll();

            // Remove smaller elements (they're useless)
            while (!q.isEmpty() && a[q.peekLast()] < a[i])
                q.pollLast();

            // Add current index
            q.offer(i);

            // Record the maximum for this window
            if (i >= k - 1)
                result[ri++] = a[q.peek()];
        }

        return result;
    }
}