import java.util.Scanner;

public class Kadanealgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tell the size for the array :");
        int n = sc.nextInt();
        int array[] = new int[n];
        System.out.println("Enter the entries for the array :");
        for (int i = 0; i < n; i++) {
            int j = sc.nextInt();
            array[i] = j;
        }
        int maxSum = kadane(n, array);
        System.out.println("The maximum sum subarray for this array is : " + maxSum);

    }

    private static int kadane(int n, int array[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int k = 0; k < array.length; k++) {
            currSum = currSum + array[k];
            if (currSum > maxSum)
                maxSum = currSum;
            if (currSum < 0)
                currSum = 0;
        }
        return (maxSum);
    }
}
