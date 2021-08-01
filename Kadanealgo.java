/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import java.util.Scanner;

public class Kadanealgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            int j = sc.nextInt();
            array[i] = j;
        }
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int k = 0; k < array.length; k++) {
            currSum = currSum + array[k];
            if (currSum > maxSum)
                maxSum = currSum;
            if (currSum < 0)
                currSum = 0;
        }
        System.out.println(maxSum);

    }
}
