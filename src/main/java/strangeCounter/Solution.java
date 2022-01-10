/*
There is a strange counter. At the first second, it displays the number 3.
Each second, the number displayed by decrements by 1 until it reaches 1.
In next second, the timer resets to 2 * the initial number for the prior cycle and continues counting down.
The diagram below shows the counter values for each time  in the first three cycles:

 time  value        time  value
------+------       ------+------       ...
|  1  |  3  |       |  4  |  6  |
|  2  |  2  |       |  5  |  5  |
|  3  |  1  |       |  6  |  4  |
                    |  7  |  3  |
                    |  8  |  X  |
                    |  9  |  1  |

Find and print the value (X) displayed by the counter at time t.

Sample Input: 8
Sample Output: 2
 */

package strangeCounter;

public class Solution {

    public static long strangeCounter(long t) {
        long b = 3;
        long q = 2;
        long step = 0;
        long stepTime = 0;
        long cumulativeStepTime = 0;

        while (cumulativeStepTime < t) {
            stepTime = (long) (b * Math.pow(q, step));
            cumulativeStepTime += stepTime;
            step++;
        }
        long value = cumulativeStepTime - t + 1;
        return value;
    }
}
