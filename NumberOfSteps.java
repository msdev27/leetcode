public class NumberOfSteps {
    public int numberOfSteps(int num) {
        return helper(num, 0);
    }

    public static int helper (int n, int counter) {
        if (n == 0) {
            return counter;
        }

        if (n%2 == 0) {
            return helper(n/2, counter+1);
        }
        return helper(n-1, counter+1);
    }
}
